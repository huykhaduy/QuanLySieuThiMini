package DAL.DataModels;

import java.sql.Timestamp;

public class NhanVienBanHang extends NhanVien{

    public NhanVienBanHang() {
    }

    public NhanVienBanHang(int maNV, String cmnd, Timestamp ngaySinh, Timestamp ngayThamGia, String hoTen, String diaChi, String sdt, String email, int gioiTinh) {
        super(maNV, cmnd, ngaySinh, ngayThamGia, hoTen, diaChi, sdt, email, gioiTinh);
    }

    @Override
    public int getMaChucVu() {
        return 0;
    }

    public String getChucVu() {
        return "Bán hàng";
    }
}
