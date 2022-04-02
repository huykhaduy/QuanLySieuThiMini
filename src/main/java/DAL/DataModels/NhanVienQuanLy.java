package DAL.DataModels;

import java.sql.Timestamp;

public class NhanVienQuanLy extends NhanVien{

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(int maNV, String cmnd, Timestamp ngaySinh, Timestamp ngayThamGia, String hoTen, String diaChi, String sdt, String email, int gioiTinh) {
        super(maNV, cmnd, ngaySinh, ngayThamGia, hoTen, diaChi, sdt, email, gioiTinh);
    }

    @Override
    public int getMaChucVu() {
        return 10;
    }

    public String getChucVu() {
        return "Quản lý";
    }
}
