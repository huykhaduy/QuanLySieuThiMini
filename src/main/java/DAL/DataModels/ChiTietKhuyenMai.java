package DAL.DataModels;

public abstract class ChiTietKhuyenMai<Id> {
    private String maKM;
    private Id doituongKM;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(String maKM, Id doituongKM) {
        this.maKM = maKM;
        this.doituongKM = doituongKM;
    }

    public String getMaKM() {
        return this.maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public Id getDoituongKM() {
        return this.doituongKM;
    }

    public void setDoituongKM(Id doituongKM) {
        this.doituongKM = doituongKM;
    }

    public abstract String toString();
}
