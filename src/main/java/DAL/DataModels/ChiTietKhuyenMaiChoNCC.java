package DAL.DataModels;

public class ChiTietKhuyenMaiChoNCC extends ChiTietKhuyenMai<String> {

    public ChiTietKhuyenMaiChoNCC() {
    }

    public ChiTietKhuyenMaiChoNCC(String maKM, String maId) {
        super(maKM, maId);
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMai{" +
                "maKM='" + getMaKM() + '\'' +
                ", maId=" + getMaId() +
                '}';
    }
}
