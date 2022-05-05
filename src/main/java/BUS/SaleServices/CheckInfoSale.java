package BUS.SaleServices;


import DAL.DataAcessObject.KhachHangDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataAcessObject.VoucherDAO;



public class CheckInfoSale {
    private final SanPhamDAO spDAO = new SanPhamDAO();
    private final KhachHangDAO khDAO = new KhachHangDAO();
    private final VoucherDAO voucherDAO = new VoucherDAO();
//    private KhachHang khachHang;
    
    
    //hàm này được gọi khi sự kiện click chuột vào panel MenuItem được thực hiện
    public boolean hasProduct(int maSP){
        return spDAO.select(maSP).getSoLuong() != 0;
    }
    
    
    //Hàm này được gọi để xem số lượng có đápứng đủ nhu cầu khách hàng không
    public boolean isEnoughAmountProduct(int maSP, int sl){     
        return spDAO.select(maSP).getSoLuong() >= sl;
    }
    
    //hàm này được gọi khi nhấn button thêm để kiểm tra mã khách hàng
    public boolean isPassengerExist(String sdt){ 
        return khDAO.selectByPhoneNumber(sdt) != null;
    }
    
    public boolean hasVoucher(String maVoucher){
        return voucherDAO.select(maVoucher) != null;
    }
    
    //Hàm này được gọi sau khi kiểm tra khách hàng đã tồn tại
    public boolean canUsePoint(String sdt){
        return khDAO.selectByPhoneNumber(sdt).getDiemThuong() >= 1000;
    }
    
   
//    public static void main(String[] agrv){
//        CheckInfoSale c = new CheckInfoSale();
//        System.out.println(c.isEnoughAmountProduct(1, 2));
//    }
}
