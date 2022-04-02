package DAL.DataModels;

public class KhachHang extends ConNguoi {
    private int maKH;
    private long diemThuong;
    
    public KhachHang() {
    }

    public KhachHang(int maKH, long diemThuong, String hoTen, String diaChi, String sdt, String email, int gioiTinh) {
        super(hoTen, diaChi, sdt, email, gioiTinh);
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
        return "maKH=" + maKH + ", diemThuong=" + diemThuong + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", email=" + email + ", gioiTinh=" + gioiTinh;
    }
    
}
