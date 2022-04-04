package DAL.DataModels;

public class ChiTietPhieuNhap extends ChiTietPhieu {

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int maPhieu, int maSP, int soLuong, boolean isDeleted) {
        super(maPhieu, maSP, soLuong, isDeleted);
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" +
                "maPhieu=" + maPhieu +
                ", maSP=" + maSP +
                ", soLuong=" + soLuong +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
