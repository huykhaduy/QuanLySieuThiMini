package DAL.DataModels;

import java.sql.Timestamp;

public class MaKhuyenMai {
    private String maKM;
    private String moTa;
    private int loaiKM;
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

    public MaKhuyenMai(String maKM, String moTa, int loaiKM, Timestamp ngayDB, Timestamp ngayKT, long giaTriToiThieu,
            long kmToiThieu, long kmToiDa, int ptGiam, int soLuotSD, boolean isDeleted) {
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
    

    public String getMaKM() {
        return this.maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getLoaiKM() {
        return this.loaiKM;
    }

    public void setLoaiKM(int loaiKM) {
        this.loaiKM = loaiKM;
    }

    public Timestamp getNgayDB() {
        return this.ngayDB;
    }

    public void setNgayDB(Timestamp ngayDB) {
        this.ngayDB = ngayDB;
    }

    public Timestamp getNgayKT() {
        return this.ngayKT;
    }

    public void setNgayKT(Timestamp ngayKT) {
        this.ngayKT = ngayKT;
    }

    public long getGiaTriToiThieu() {
        return this.giaTriToiThieu;
    }

    public void setGiaTriToiThieu(long giaTriToiThieu) {
        this.giaTriToiThieu = giaTriToiThieu;
    }

    public long getKmToiThieu() {
        return this.kmToiThieu;
    }

    public void setKmToiThieu(long kmToiThieu) {
        this.kmToiThieu = kmToiThieu;
    }

    public long getKmToiDa() {
        return this.kmToiDa;
    }

    public void setKmToiDa(long kmToiDa) {
        this.kmToiDa = kmToiDa;
    }

    public int getPtGiam() {
        return this.ptGiam;
    }

    public void setPtGiam(int ptGiam) {
        this.ptGiam = ptGiam;
    }

    public int getSoLuotSD() {
        return this.soLuotSD;
    }

    public void setSoLuotSD(int soLuotSD) {
        this.soLuotSD = soLuotSD;
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

    @Override
    public String toString() {
        return "MaKhuyenMai{" +
                "maKM='" + maKM + '\'' +
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
