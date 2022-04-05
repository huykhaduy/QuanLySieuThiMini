package DAL.DataModels;

public class KhachHang extends ConNguoi {
    private int maKH;
    private long diemThuong;
    
    public KhachHang() {
    }

    public KhachHang(String hoTen, boolean gioiTinh, String diaChi, String email, String sdt, int maKH, long diemThuong) {
        super(hoTen, gioiTinh, diaChi, email, sdt);
        this.maKH = maKH;
        this.diemThuong = diemThuong;
    }

    public int getMaKH() {
        return this.maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public long getDiemThuong() {
        return this.diemThuong;
    }

    public void setDiemThuong(long diemThuong) {
        this.diemThuong = diemThuong;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                ", maKH=" + maKH +
                ", diemThuong=" + diemThuong +
                '}';
    }
}
