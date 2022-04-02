package DAL.DataModels;

public abstract class ConNguoi {
    protected String hoTen;
    protected String diaChi;
    protected String email;
    protected String sdt;
    protected int gioiTinh;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, String diaChi, String email, String sdt, int gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }


    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public abstract String toString();

}
