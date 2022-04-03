package DAL.DataModels;

import java.sql.Timestamp;

public class TaiKhoan {
    private String tenTK;
    private String matKhau;
    private int soLanSai;
    private Timestamp ngayTao;
    private boolean isDeleted;
    private boolean isActive;
    private int maNV;


    public TaiKhoan() {
    }

    public TaiKhoan(String tenTK, String matKhau, int soLanSai, Timestamp ngayTao, boolean isDeleted, boolean isActive, int maNV) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.soLanSai = soLanSai;
        this.ngayTao = ngayTao;
        this.isDeleted = isDeleted;
        this.isActive = isActive;
        this.maNV = maNV;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getSoLanSai() {
        return soLanSai;
    }

    public void setSoLanSai(int soLanSai) {
        this.soLanSai = soLanSai;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "tenTK='" + tenTK + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", soLanSai=" + soLanSai +
                ", ngayTao=" + ngayTao +
                ", isDeleted=" + isDeleted +
                ", isActive=" + isActive +
                ", maNV=" + maNV +
                '}';
    }
}
