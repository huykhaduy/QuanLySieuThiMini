package DAL.DataModels;

import java.sql.Timestamp;

public class NhanVien extends ConNguoi {

    private int maNV;
    private int maChucVu;
    private String cmnd;
    private Timestamp ngaySinh;
    private Timestamp ngayThamGia;
    
    public NhanVien() {
    }

    public NhanVien(int maNV, int maChucVu, String cmnd, Timestamp ngaySinh, Timestamp ngayThamGia, String hoTen,
            String diaChi, String sdt, String email, int gioiTinh) {
        super(hoTen, diaChi, sdt, email, gioiTinh);
        this.maNV = maNV;
        this.maChucVu = maChucVu;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.ngayThamGia = ngayThamGia;
    }
    

    public int getMaNV() {
        return this.maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaChucVu() {
        return this.maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Timestamp getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Timestamp ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Timestamp getNgayThamGia() {
        return this.ngayThamGia;
    }

    public void setNgayThamGia(Timestamp ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", maChucVu=" + maChucVu + ", cmnd=" + cmnd + ", ngaySinh=" + ngaySinh + ", ngayThamGia=" + ngayThamGia + ", ten=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", email=" + email + ", gioiTinh=" + gioiTinh + '}';
    }
    
}
