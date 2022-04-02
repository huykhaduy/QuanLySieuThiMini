package DAL.DataModels;

public class SanPham {
    private int maSP;
    private String tenSP;
    private String moTa;
    private String hinhAnh;
    private long giaTien;
    private int soLuong;
    private boolean isDeleted;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String moTa, String hinhAnh, long giaTien, int soLuong, boolean isDeleted) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.isDeleted = isDeleted;
    }

    public int getMaSP() {
        return this.maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return this.tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return this.hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public long getGiaTien() {
        return this.giaTien;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "{" +
            " maSP='" + getMaSP() + "'" +
            ", tenSP='" + getTenSP() + "'" +
            ", moTa='" + getMoTa() + "'" +
            ", hinhAnh='" + getHinhAnh() + "'" +
            ", giaTien='" + getGiaTien() + "'" +
            ", soLuong='" + getSoLuong() + "'" +
            ", isDeleted='" + isDeleted() + "'" +
            "}";
    }
}
