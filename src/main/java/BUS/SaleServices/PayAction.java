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
import java.util.Date;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
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
        this.soVoucher = 0;
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
    public long discountBillByVoucher(String maVoucher){
        Voucher voucher;
        if(check.hasVoucher(maVoucher)){
            voucher = voucherDAO.select(maVoucher);
            if(total >= voucher.getGiaTriToiThieu())
                return (long) voucher.getKmToiDa() > (voucher.getPtGiam()*total) ? (voucher.getPtGiam()*total) : voucher.getKmToiDa();
        }
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
    public boolean storeBill(String hinhthuc, long total, int maNV, String sdt, String maVoucher){
        
        this.setSoVoucher(maVoucher);
        long discount = discountBillByVoucher(maVoucher) + discountBillByPoint(sdt);
        int maKH = 0;
        if(check.isPassengerExist(sdt)){
            maKH = khachHangDAO.selectByPhoneNumber(sdt).getMaKH();
        }
        
        hoaDon = new HoaDon(0,new Timestamp(System.currentTimeMillis()),hinhthuc,
                total, discount, maKH, maNV, this.soVoucher,false);
        
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
            
            item.setGiaTien((long)discountProductPrice(item.getMaSP()) * item.getSoLuong());
            item.setMaHD(maHD);
            flag = CTHoaDonDAO.insert(item);
        }
        return flag;
    }
    
    //Thông tin hóa đơn hiển thị trên JOptionPane
//    public String getBillToString(String hinhthuc, long total, int maNV, String sdt, String maVoucher, List<ChiTietHoaDon> listOrder){
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        LocalDateTime currentDay = LocalDateTime.now();
//        long discount = discountBillByVoucher(maVoucher) + discountBillByPoint(sdt);
//        
//        String tenKH = "";
//        if(check.isPassengerExist(sdt)){
//            tenKH = khachHangDAO.selectByPhoneNumber(sdt).getTenKH();
//        }
//
//        StringBuilder table = new StringBuilder(String.format("|   %-20s|%-5s|%-10s|\n", "Mặt hàng", "SL", "T.Tiền"));
//        for(ChiTietHoaDon order : listOrder){
//            table.append(String.format("|   %-20s|%-5d|%-10d|\n", sanPhamDAO.select(order.getMaSP()).getTenSP(), order.getSoLuong(), order.getGiaTien()));
//        }
//
//        String bill = "                    MINIMART                    \n"
//                +     "                HÓA ĐƠN BÁN HÀNG                \n\n\n"
//                +     String.format("Ngày bán: %-10s       Số: %d\n", dateFormat.format(date), this.maHD)
//                +     "Mã nhân viên: " + (maNV) + "\n"
//                +     "In lúc: " + currentDay.format(DateTimeFormatter.ofPattern("HH:mm")) + "\n"
//                +     "Khách hàng: " + tenKH + "\n"
//                +     table + "\n"
//                +     String.format("Tổng: %30d", total) + "\n"
//                +     String.format("Giảm: %30d", discount) + "\n"
//                +     String.format("Hình thức: %30s", hinhthuc) + "\n"
//                +     String.format("Thanh toán: %30d", total - discount) + "\n";
//
//        return bill;
//    }
    
    public String getNameFromPhoneNumber(String sdt){
        if(check.isPassengerExist(sdt))
            return khachHangDAO.selectByPhoneNumber(sdt).getTenKH();
        return null;
    }
    
    public String getNameSPFromID(int id){
        return sanPhamDAO.select(id).getTenSP();
    }
}
