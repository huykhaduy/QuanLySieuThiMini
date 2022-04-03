package DAL.DataModels;

import java.sql.Timestamp;

public class NhanVienQuanLy extends NhanVien{

    private int maChucVu;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(String hoTen, boolean gioiTinh, String diaChi, String email, String sdt, int maNV, String cmnd, Timestamp ngaySinh, Timestamp ngayThamGia, String maTK, int maChucVu) {
        super(hoTen, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, maTK);
        this.maChucVu = maChucVu;
    }

    public int getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
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
