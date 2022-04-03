package DAL.DataModels;

public abstract class ChiTietPhieu {
    protected int maPhieu;
    protected int maSP;
    protected int soLuong;
    protected boolean isDeleted;

    public ChiTietPhieu() {
    }

    public ChiTietPhieu(int maPhieu, int maSP, int soLuong, boolean isDeleted) {
        this.maPhieu = maPhieu;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.isDeleted = isDeleted;
    }

    public int getMaPhieu() {
        return this.maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public int getMaSP() {
        return this.maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isIsDeleted() {
        return this.isDeleted;
    }

    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public abstract String toString();
}
