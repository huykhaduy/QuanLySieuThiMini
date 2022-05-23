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
import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.GiamGiaSP;
import DAL.DataModels.HoaDon;
import DAL.DataModels.KhachHang;
import DAL.DataModels.SanPham;
import DAL.DataModels.Voucher;
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
            
    
    
    
//    //Hàm tính giá trị giảm của sản phẩm
//    public double discountProduct(int maSP){
//        GiamGiaSP giamGiaSP = giamGiaDAO.selectByMaSP(maSP);
//        SanPham sanPham = sanPhamDAO.select(maSP);
//        return (giamGiaSP == null) ? 0 : ((giamGiaSP.getPtGiam() * sanPham.getGiaTien())*1.0 / 100);
//    }
    
    //Hàm tính giá trị của sản phẩm sau khi giảm
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
    
    //Hàm tính giá trị giảm của voucher
    public long discountBillByVoucher(String maVoucher, long total){
//        Voucher voucher;
        voucher = null;
        if(check.hasVoucher(maVoucher)){
            voucher = voucherDAO.select(maVoucher);
            if(total >= voucher.getGiaTriToiThieu() && voucher.getSoLuotSD() > 0){
                //Set lại lượt sử dụng
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
    
    //Lưu hóa đơn -> Truyền disVoucher và disPoint nhầm xác nhận xem nhưng loại giảm giá nào được sử dụng để dễ thay đổi dữ liệu
    public boolean storeBill(String hinhthuc, long total, long disVoucher, long disPoint, int maNV, String sdt, String maVoucher){
        
        this.setSoVoucher(maVoucher);
        
        //Nếu là khách hàng thân thiết kiểm tra xem có sử dụng điểm thưởng không
        if(check.isPassengerExist(sdt)){
            //Nếu không sử dụng thì lấy khách hàng từ cơ sở dữ liệu về
            //ngược lại thì đối tượng khách hàng đã được lấy từ hàm discountByPoint
            if(disPoint == 0)
                khachHang = khachHangDAO.selectByPhoneNumber(sdt);
            khachHang.setDiemThuong(khachHang.getDiemThuong() + ((total - (disPoint + disVoucher))/1000));
        }    
        
        maKH = khachHang == null ? 0 : khachHang.getMaKH();

        hoaDon = new HoaDon(0,new Timestamp(System.currentTimeMillis()),hinhthuc,
                total, disVoucher + disPoint, maKH, maNV, this.soVoucher,false);
        
        
        if(hoaDonDAO.insert(hoaDon)){
            //Lưu thay đổi điểm thưởng cho khách hàng
            if(check.isPassengerExist(sdt))
                khachHangDAO.update(maKH, khachHang);
            
            //Thay đổi số lần sử dụng voucher
            if (disVoucher != 0)
                voucherDAO.update(maVoucher, voucher);
            this.setMaHD();
            return true;
        }
        return false;
    }
    
    //Lưu danh sách sản phẩm vào chi tiết hóa đơn
    public boolean storeBillDetail(List<ChiTietHoaDon> orderList){
        //cờ kiểm tra xem có lưu được dữ liệu không
        boolean flag = true;
        for(ChiTietHoaDon item : orderList){
            
            //Thay đổi số lượng sản phẩm trong kho
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
