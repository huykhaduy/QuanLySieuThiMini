package DAL.DataModels;

public class ChiTietKhuyenMaiChoSP {
    private int soKM;
    private int maSP;

    public ChiTietKhuyenMaiChoSP() {
    }

    public ChiTietKhuyenMaiChoSP(int soKM, int maSP) {
        this.soKM = soKM;
        this.maSP = maSP;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMaiChoSP{" +
                "soKM=" + soKM +
                ", maSP=" + maSP +
                '}';
    }
}
