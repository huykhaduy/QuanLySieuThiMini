package DAL.DataModels;

public class ChiTietKhuyenMaiChoNCC {
    private int soKM;
    private int maNCC;

    public ChiTietKhuyenMaiChoNCC() {
    }

    public ChiTietKhuyenMaiChoNCC(int soKM, int maNCC) {
        this.soKM = soKM;
        this.maNCC = maNCC;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMaiChoNCC{" +
                "soKM=" + soKM +
                ", maNCC=" + maNCC +
                '}';
    }
}
