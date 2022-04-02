package DAL.DataModels;

public class ChiTietKhuyenMaiChoNCC extends ChiTietKhuyenMai<String> {

    public ChiTietKhuyenMaiChoNCC() {
    }

    public ChiTietKhuyenMaiChoNCC(String maKM, String doituongKM) {
        super(maKM, doituongKM);
    }

    @Override
    public String toString() {
        return "chiTietKhuyenMaiChoNCC{" +
                "maKM='" + getMaKM() + '\'' +
                ", doituongKM='" + getDoituongKM() + '\'' +
                '}';
    }
}
