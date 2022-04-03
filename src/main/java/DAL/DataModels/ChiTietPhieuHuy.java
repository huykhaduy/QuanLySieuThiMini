package DAL.DataModels;

public class ChiTietPhieuHuy extends ChiTietPhieu {

    public ChiTietPhieuHuy() {
    }

    public ChiTietPhieuHuy(int maPhieu, int maSP, int soLuong, boolean isDeleted) {
        super(maPhieu, maSP, soLuong, isDeleted);
    }

    @Override
    public String toString() {
        return "ChiTietPhieuHuy{" +
                "maPhieu=" + maPhieu +
                ", maSP=" + maSP +
                ", soLuong=" + soLuong +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
