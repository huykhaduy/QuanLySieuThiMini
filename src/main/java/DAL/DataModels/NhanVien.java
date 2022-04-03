package DAL.DataModels;

import java.sql.Timestamp;

public abstract class NhanVien extends ConNguoi {

    private int maNV;
    private String cmnd;
    private Timestamp ngaySinh;
    private Timestamp ngayThamGia;
    private String maTK;
    
    public NhanVien() {
    }

    public NhanVien(String hoTen, boolean gioiTinh, String diaChi, String email, String sdt, int maNV, String cmnd, Timestamp ngaySinh, Timestamp ngayThamGia, String maTK) {
        super(hoTen, gioiTinh, diaChi, email, sdt);
        this.maNV = maNV;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.ngayThamGia = ngayThamGia;
        this.maTK = maTK;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Timestamp getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Timestamp ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Timestamp getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Timestamp ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public abstract int getMaChucVu();

    public abstract String toString();
    
}
