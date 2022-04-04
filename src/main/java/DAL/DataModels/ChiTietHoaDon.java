package DAL.DataModels;

public class ChiTietHoaDon {
    protected int maSP;
    protected int maHD;
    protected int soLuong;
    protected long giaBan;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maSP, int maHD, int soLuong, long giaBan) {
        this.maSP = maSP;
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public int getMaSP() {
        return this.maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaHD() {
        return this.maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "{" +
                " maSP='" + getMaSP() + "'" +
                ", maHD='" + getMaHD() + "'" +
                ", soLuong='" + getSoLuong() + "'" +
                ", giaBan='" + getGiaBan() + "'" +
                "}";
    }

}
