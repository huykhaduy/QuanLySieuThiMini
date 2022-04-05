package DAL.DataModels;

public class ChiTietKhuyenMaiChoSP extends ChiTietKhuyenMai<Integer> {

    public ChiTietKhuyenMaiChoSP() {
    }

    public ChiTietKhuyenMaiChoSP(String maKM, Integer maId) {
        super(maKM, maId);
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMaiChoSP{" +
                "maKM='" + getMaKM() + '\'' +
                ", maId='" + getMaId() + '\''+"}";
    }
}
