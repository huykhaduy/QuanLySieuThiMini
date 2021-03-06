/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.SaleServices;

import DAL.DataAcessObject.ChiTietHoaDonDAO;
import DAL.DataAcessObject.GiamGiaSPDAO;
import DAL.DataAcessObject.HoaDonDAO;
import DAL.DataAcessObject.KhachHangDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataAcessObject.VoucherDAO;
import DTO.ChiTietHoaDon;
import DTO.GiamGiaSP;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.SanPham;
import DTO.Voucher;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author TuanMinh
 */
public class PayActionBus {
    private final GiamGiaSPDAO giamGiaDAO = new GiamGiaSPDAO();
    private final SanPhamDAO sanPhamDAO = new SanPhamDAO();
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private final ChiTietHoaDonDAO CTHoaDonDAO = new ChiTietHoaDonDAO();
    private final VoucherDAO voucherDAO = new VoucherDAO();
    private final KhachHangDAO khachHangDAO = new KhachHangDAO();
    private final CheckInfoSale check = new CheckInfoSale();
    
    private HoaDon hoaDon;
    private KhachHang khachHang;
    private Voucher voucher;
    private int maHD;
    private int maKH, maNV, soVoucher;
    private long total;

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD() {
        this.maHD = hoaDonDAO.selectNewestBill().getMaHD();
    }

//    public int getMaKH() {
//        return maKH;
//    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

//    public int getMaNV() {
//        return maNV;
//    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

//    public int getSoVoucher() {
//        return soVoucher;
//    }

    public void setSoVoucher(String maVoucher) {
        if(check.hasVoucher(maVoucher))
            this.soVoucher = voucherDAO.select(maVoucher).getSoVoucher();
        else this.soVoucher = 0;
    }
            
    
    
    
//    //H??m t??nh gi?? tr??? gi???m c???a s???n ph???m
//    public double discountProduct(int maSP){
//        GiamGiaSP giamGiaSP = giamGiaDAO.selectByMaSP(maSP);
//        SanPham sanPham = sanPhamDAO.select(maSP);
//        return (giamGiaSP == null) ? 0 : ((giamGiaSP.getPtGiam() * sanPham.getGiaTien())*1.0 / 100);
//    }
    
    //H??m t??nh gi?? tr??? c???a s???n ph???m sau khi gi???m
    public double discountProductPrice(int maSP){
        GiamGiaSP giamGiaSP = giamGiaDAO.selectByMaSP(maSP);
        SanPham sanPham = sanPhamDAO.select(maSP);
        return sanPham.getGiaTien() - ((giamGiaSP == null) ? 0 : ((giamGiaSP.getPtGiam() * sanPham.getGiaTien())*1.0 / 100));
    }    
    
    public long totalBill(List<ChiTietHoaDon> orderList){
        total = 0;
        for(ChiTietHoaDon item : orderList){
            total += discountProductPrice(item.getMaSP()) * item.getSoLuong();
        }
        return total;
    }
    
    //H??m t??nh gi?? tr??? gi???m c???a voucher
    public long discountBillByVoucher(String maVoucher, long total){
//        Voucher voucher;
        voucher = null;
        if(check.hasVoucher(maVoucher)){
            voucher = voucherDAO.select(maVoucher);
            if(total >= voucher.getGiaTriToiThieu() && voucher.getSoLuotSD() > 0 && new Timestamp(System.currentTimeMillis()).before(voucher.getNgayKT())){
                //Set l???i l?????t s??? d???ng
                voucher.setSoLuotSD(voucher.getSoLuotSD() - 1);
                return (long) (long)(voucher.getKmToiDa()) > ((voucher.getPtGiam()*total)/100) ? ((voucher.getPtGiam()*total)/100) : voucher.getKmToiDa();
            }
        }
        return 0;
    }
    
    public long discountBillByPoint(String sdt, long total){
        khachHang = null;
        if(check.isPassengerExist(sdt) && check.canUsePoint(sdt)){
            khachHang = khachHangDAO.selectByPhoneNumber(sdt);
            khachHang.setDiemThuong(khachHang.getDiemThuong() - 1000);
            return (long) (total*(0.1));
        }
        return 0;
    }
    
    public long payForBillAfterDiscount(String maVoucher, String sdt, long total){
        return total - (discountBillByVoucher(maVoucher, total) + discountBillByPoint(sdt, total));
    }
    
    //L??u h??a ????n -> Truy???n disVoucher v?? disPoint nh???m x??c nh???n xem nh??ng lo???i gi???m gi?? n??o ???????c s??? d???ng ????? d??? thay ?????i d??? li???u
    public boolean storeBill(String hinhthuc, long total, long disVoucher, long disPoint, int maNV, String sdt, String maVoucher){
        
        this.setSoVoucher(maVoucher);
        
        //N???u l?? kh??ch h??ng th??n thi???t ki???m tra xem c?? s??? d???ng ??i???m th?????ng kh??ng
        if(check.isPassengerExist(sdt)){
            //N???u kh??ng s??? d???ng th?? l???y kh??ch h??ng t??? c?? s??? d??? li???u v???
            //ng?????c l???i th?? ?????i t?????ng kh??ch h??ng ???? ???????c l???y t??? h??m discountByPoint
            if(disPoint == 0)
                khachHang = khachHangDAO.selectByPhoneNumber(sdt);
            khachHang.setDiemThuong(khachHang.getDiemThuong() + ((total - (disPoint + disVoucher))/1000));
        }    
        
        maKH = khachHang == null ? 0 : khachHang.getMaKH();

        hoaDon = new HoaDon(0,new Timestamp(System.currentTimeMillis()),hinhthuc,
                total, disVoucher + disPoint, maKH, maNV, this.soVoucher,false);
        
        
        if(hoaDonDAO.insert(hoaDon)){
            //L??u thay ?????i ??i???m th?????ng cho kh??ch h??ng
            if(check.isPassengerExist(sdt))
                khachHangDAO.update(maKH, khachHang);
            
            //Thay ?????i s??? l???n s??? d???ng voucher
            if (disVoucher != 0)
                voucherDAO.update(maVoucher, voucher);
            this.setMaHD();
            return true;
        }
        return false;
    }
    
    //L??u danh s??ch s???n ph???m v??o chi ti???t h??a ????n
    public boolean storeBillDetail(List<ChiTietHoaDon> orderList){
        //c??? ki???m tra xem c?? l??u ???????c d??? li???u kh??ng
        boolean flag = true;
        for(ChiTietHoaDon item : orderList){
            
            //Thay ?????i s??? l?????ng s???n ph???m trong kho
            SanPham sanPham = sanPhamDAO.select(item.getMaSP());
            sanPham.setSoLuong(sanPham.getSoLuong() - item.getSoLuong());
            sanPhamDAO.update(sanPham.getMaSP(), sanPham);
            
            item.setGiaTien((long)discountProductPrice(item.getMaSP()) * item.getSoLuong());
            item.setMaHD(maHD);
            flag = CTHoaDonDAO.insert(item);
        }
        return flag;
    }
    
    public String getNameFromPhoneNumber(String sdt){
        if(check.isPassengerExist(sdt))
            return khachHangDAO.selectByPhoneNumber(sdt).getTenKH();
        return null;
    }
    
    public String getNameSPFromID(int id){
        return sanPhamDAO.select(id).getTenSP();
    }
}
