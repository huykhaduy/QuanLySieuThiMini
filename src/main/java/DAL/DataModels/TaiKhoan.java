package DAL.DataModels;

import java.sql.Timestamp;

public class TaiKhoan {
    private String tenTK;
    private String matKhau;
    private int soLanSai;
    private Timestamp ngayTao;
    private int maLoai;
    private boolean isDeleted;
    private boolean isActive;


    public TaiKhoan() {
    }

    public TaiKhoan(String tenTK, String matKhau, int soLanSai, Timestamp ngayTao, int maLoai, boolean isDeleted,
            boolean isActive) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.soLanSai = soLanSai;
        this.ngayTao = ngayTao;
        this.maLoai = maLoai;
        this.isDeleted = isDeleted;
        this.isActive = isActive;
    }

    public String getTenTK() {
        return this.tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getSoLanSai() {
        return this.soLanSai;
    }

    public void setSoLanSai(int soLanSai) {
        this.soLanSai = soLanSai;
    }

    public Timestamp getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaLoai() {
        return this.maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
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

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "{" +
            " tenTK='" + getTenTK() + "'" +
            ", matKhau='" + getMatKhau() + "'" +
            ", soLanSai='" + getSoLanSai() + "'" +
            ", ngayTao='" + getNgayTao() + "'" +
            ", maLoai='" + getMaLoai() + "'" +
            ", isDeleted='" + isIsDeleted() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }
}
