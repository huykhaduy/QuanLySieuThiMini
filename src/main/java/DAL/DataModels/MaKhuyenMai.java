package DAL.DataModels;

import java.sql.Timestamp;

public class MaKhuyenMai {
    private int soKM;
    private String maKM;
    private int loaiKM;
    private String moTa;
    private Timestamp ngayDB;
    private Timestamp ngayKT;
    private long giaTriToiThieu;
    private long kmToiThieu;
    private long kmToiDa;
    private int ptGiam;
    private int soLuotSD;
    private boolean isDeleted;

    public MaKhuyenMai() {
    }

    public MaKhuyenMai(int soKM, String maKM, String moTa, int loaiKM, Timestamp ngayDB, Timestamp ngayKT, long giaTriToiThieu, long kmToiThieu, long kmToiDa, int ptGiam, int soLuotSD, boolean isDeleted) {
        this.soKM = soKM;
        this.maKM = maKM;
        this.moTa = moTa;
        this.loaiKM = loaiKM;
        this.ngayDB = ngayDB;
        this.ngayKT = ngayKT;
        this.giaTriToiThieu = giaTriToiThieu;
        this.kmToiThieu = kmToiThieu;
        this.kmToiDa = kmToiDa;
        this.ptGiam = ptGiam;
        this.soLuotSD = soLuotSD;
        this.isDeleted = isDeleted;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getLoaiKM() {
        return loaiKM;
    }

    public void setLoaiKM(int loaiKM) {
        this.loaiKM = loaiKM;
    }

    public Timestamp getNgayDB() {
        return ngayDB;
    }

    public void setNgayDB(Timestamp ngayDB) {
        this.ngayDB = ngayDB;
    }

    public Timestamp getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Timestamp ngayKT) {
        this.ngayKT = ngayKT;
    }

    public long getGiaTriToiThieu() {
        return giaTriToiThieu;
    }

    public void setGiaTriToiThieu(long giaTriToiThieu) {
        this.giaTriToiThieu = giaTriToiThieu;
    }

    public long getKmToiThieu() {
        return kmToiThieu;
    }

    public void setKmToiThieu(long kmToiThieu) {
        this.kmToiThieu = kmToiThieu;
    }

    public long getKmToiDa() {
        return kmToiDa;
    }

    public void setKmToiDa(long kmToiDa) {
        this.kmToiDa = kmToiDa;
    }

    public int getPtGiam() {
        return ptGiam;
    }

    public void setPtGiam(int ptGiam) {
        this.ptGiam = ptGiam;
    }

    public int getSoLuotSD() {
        return soLuotSD;
    }

    public void setSoLuotSD(int soLuotSD) {
        this.soLuotSD = soLuotSD;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "MaKhuyenMai{" +
                "soKM=" + soKM +
                ", maKM='" + maKM + '\'' +
                ", moTa='" + moTa + '\'' +
                ", loaiKM=" + loaiKM +
                ", ngayDB=" + ngayDB +
                ", ngayKT=" + ngayKT +
                ", giaTriToiThieu=" + giaTriToiThieu +
                ", kmToiThieu=" + kmToiThieu +
                ", kmToiDa=" + kmToiDa +
                ", ptGiam=" + ptGiam +
                ", soLuotSD=" + soLuotSD +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
