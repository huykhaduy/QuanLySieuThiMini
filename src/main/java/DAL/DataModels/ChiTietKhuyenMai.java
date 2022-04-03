package DAL.DataModels;

public abstract class ChiTietKhuyenMai<Id> {
    private String maKM;
    private Id maId;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(String maKM, Id maId) {
        this.maKM = maKM;
        this.maId = maId;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public Id getMaId() {
        return maId;
    }

    public void setMaId(Id maId) {
        this.maId = maId;
    }

    public abstract String toString();
}
