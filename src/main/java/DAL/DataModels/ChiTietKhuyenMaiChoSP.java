package DAL.DataModels;

public class ChiTietKhuyenMaiChoSP extends ChiTietKhuyenMai<Integer> {

    public ChiTietKhuyenMaiChoSP() {
    }

    public ChiTietKhuyenMaiChoSP(String maKM, int doituongKM) {
        super(maKM, doituongKM);
    }
    
    @Override
    public String toString() {
        return "chiTietKhuyenMaiChoSP{" +
                "maKM='" + getMaKM() + '\'' +
                ", doituongKM=" + getDoituongKM() +
                "}";
    }
    
}
