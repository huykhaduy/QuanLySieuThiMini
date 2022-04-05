package DAL.DataModels;

import java.sql.Date;
import java.sql.Timestamp;

public class NhanVienQuanLy extends NhanVien{

    private final int maChucVu = ChucVu.NHANVIENQUANLY;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(String hoTen, boolean gioiTinh, String diaChi, String email, String sdt, int maNV, String cmnd, Date ngaySinh, Date ngayThamGia, boolean isDeleted) {
        super(hoTen, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, isDeleted);
    }

    public int getMaChucVu() {
        return maChucVu;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                ", maChucVu=" + maChucVu +
                '}';
    }
}
