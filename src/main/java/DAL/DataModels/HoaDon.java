package DAL.DataModels;

import java.sql.Timestamp;

public class HoaDon {
    private int maHD;
    private Timestamp ngayHD;
    private String hinhThuc;
    private int maKH;
    private int maNV;
    private String maKM;

    public HoaDon() {
    }

    public HoaDon(int maHD, Timestamp ngayHD, String hinhThuc, int maKH, int maNV, String maKM) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.hinhThuc = hinhThuc;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maKM = maKM;
    }


    public int getMaHD() {
        return this.maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Timestamp getNgayHD() {
        return this.ngayHD;
    }

    public void setNgayHD(Timestamp ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getHinhThuc() {
        return this.hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public int getMaKH() {
        return this.maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNV() {
        return this.maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getMaKM() {
        return this.maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    @Override
    public String toString() {
        return "{" +
            " maHD='" + getMaHD() + "'" +
            ", ngayHD='" + getNgayHD() + "'" +
            ", hinhThuc='" + getHinhThuc() + "'" +
            ", maKH='" + getMaKH() + "'" +
            ", maNV='" + getMaNV() + "'" +
            ", maKM='" + getMaKM() + "'" +
            "}";
    }

}
