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
import DAL.DataModels.SanPham;
import DAL.DataModels.Voucher;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author TuanMinh
 */
public class PayAction {
    private final GiamGiaSPDAO giamGiaDAO = new GiamGiaSPDAO();
    private final SanPhamDAO sanPhamDAO = new SanPhamDAO();
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private final ChiTietHoaDonDAO CTHoaDonDAO = new ChiTietHoaDonDAO();
    private final VoucherDAO voucherDAO = new VoucherDAO();
    private final KhachHangDAO khachHangDAO = new KhachHangDAO();
    private final CheckInfoSale check = new CheckInfoSale();
    
    private HoaDon hoaDon;
    private int maHD;
    private int maKH, maNV, soVoucher;
    private long total;

//    public int getMaHD() {
//        return maHD;
//    }

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
        this.soVoucher = voucherDAO.select(maVoucher).getSoVoucher();
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
    
    public double totalBill(List<ChiTietHoaDon> orderList){
        total = 0;
        for(ChiTietHoaDon item : orderList){
            total += discountProductPrice(item.getMaSP()) * item.getSoLuong();
        }
        return total;
    }
    
    //Hàm tính giá trị giảm của voucher
    public long discountBillByVoucher(String maVoucher){
        Voucher voucher = voucherDAO.select(maVoucher);
        if(check.hasVoucher(maVoucher))
            if(total >= voucher.getGiaTriToiThieu())
                return (long) voucher.getKmToiDa() > (voucher.getPtGiam()*total) ? (voucher.getPtGiam()*total) : voucher.getKmToiDa();
        return 0;
    }
    
    public long discountBillByPoint(String sdt){
        if(check.isPassengerExist(sdt) && check.canUsePoint(sdt)){
            long diemThuong = khachHangDAO.selectByPhoneNumber(sdt).getDiemThuong();
            khachHangDAO.selectByPhoneNumber(sdt).setDiemThuong(diemThuong - 1000);
            return (long) (total*(0.1));
        }
        return 0;
    }
    
    public long payForBillAfterDiscount(String maVoucher, String sdt){
        return total - (discountBillByVoucher(maVoucher) + discountBillByPoint(sdt));
    }
    
    //Lưu hóa đơn
    public boolean storeBill(String hinhthuc, int maNV, int maKH, String maVoucher){
        this.setSoVoucher(maVoucher);
        hoaDon = new HoaDon(0,new Timestamp(System.currentTimeMillis()),hinhthuc,
                total, discountBillByVoucher(maVoucher), maNV, maKH, this.soVoucher,false);
        if(hoaDonDAO.insert(hoaDon)){
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
            
            item.setGiaTien((long)discountProductPrice(item.getMaSP()));
            item.setMaHD(maHD);
            flag = CTHoaDonDAO.insert(item);
        }
        return flag;
    }
}
