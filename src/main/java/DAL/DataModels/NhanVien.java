package DAL.DataModels;

import java.sql.Date;
import java.sql.Timestamp;

public abstract class NhanVien extends ConNguoi {

    private int maNV;
    private String cmnd;
    private Date ngaySinh;
    private Date ngayThamGia;
    private boolean isDeleted;
    
    public NhanVien() {
    }

    public NhanVien(String hoTen, boolean gioiTinh, String diaChi, String email, String sdt, int maNV, String cmnd, Date ngaySinh, Date ngayThamGia, boolean isDeleted) {
        super(hoTen, gioiTinh, diaChi, email, sdt);
        this.maNV = maNV;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.ngayThamGia = ngayThamGia;
        this.isDeleted = isDeleted;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Date ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public abstract int getMaChucVu();

    public abstract String toString();
    
}
