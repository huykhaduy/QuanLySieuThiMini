package DAL.DataModels;

public class LoaiSanPham {
    private int maLoai;
    private String tenLoai;
    private String moTa;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoai, String tenLoai, String moTa) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public int getMaLoai() {
        return this.maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return this.tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "{" +
            " maLoai='" + getMaLoai() + "'" +
            ", tenLoai='" + getTenLoai() + "'" +
            ", moTa='" + getMoTa() + "'" +
            "}";
    }
}
