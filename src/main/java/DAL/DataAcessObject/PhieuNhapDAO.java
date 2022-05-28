package DAL.DataAcessObject;

import DTO.PhieuNhap;

import java.util.List;

public class PhieuNhapDAO extends AbtractAccessDatabase<PhieuNhap> implements ISimpleAccess<PhieuNhap,Integer> {
    {
        setClazz(PhieuNhap.class);
    }

    @Override
    public boolean insert(PhieuNhap phieuNhap) {
        return executeUpdate("INSERT INTO PHIEUNHAP(NGAYLAP,MANV,IS_DELETED) VALUES(?,?,?)",
                phieuNhap.getNgayLap(),phieuNhap.getMaNV(),phieuNhap.isDeleted());
    }

    @Override
    public boolean delete(Integer maPhieuNhap) {
        return executeUpdate("UPDATE PHIEUNHAP SET IS_DELETED = 1 WHERE MAPHIEU = ?",maPhieuNhap);
    }

    @Override
    public boolean update(Integer maPhieuNhap, PhieuNhap phieuNhap) {
        return executeUpdate("UPDATE PHIEUNHAP SET NGAYLAP = ?, MANV = ?, IS_DELETED = ? WHERE MAPHIEU = ?",
                phieuNhap.getNgayLap(),phieuNhap.getMaNV(),phieuNhap.isDeleted(),maPhieuNhap);
    }

    @Override
    public PhieuNhap select(Integer maPhieuNhap) {
        return executeQuery("SELECT * FROM PHIEUNHAP WHERE MAPHIEU = ? AND IS_DELETED = 0",maPhieuNhap);
    }

    @Override
    public List<PhieuNhap> selectAll() {
        return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0");
    }
    
    public PhieuNhap selectNewest(){
        return executeQuery("SELECT * FROM PHIEUNHAP ORDER BY MAPHIEU DESC LIMIT 1");
    }
    
    public List<PhieuNhap> selectAndFilter(String maNV, String maPN, String ngayBD, String ngayKT){
        if (maNV.isEmpty() && maPN.isEmpty()){
            return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0 AND (NGAYLAP >= ? AND NGAYLAP <= ?)",
                ngayBD, ngayKT);
        }
        else if (maNV.isEmpty()){
            return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0 AND (MAPHIEU = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                maPN, ngayBD, ngayKT);
        }   
        else if (maPN.isEmpty()){
            int maNVConvert = 0;
            try{
                maNVConvert = Integer.parseInt(maNV);
            } catch (NumberFormatException e){
                String tenNV = "%"+maNV+"%";
                return executeQueryList("SELECT PHIEUNHAP.* FROM PHIEUNHAP, NHANVIEN " +
                                " WHERE PHIEUNHAP.IS_DELETED = 0 AND (PHIEUNHAP.NGAYLAP >= ? AND PHIEUNHAP.NGAYLAP <= ?)" +
                                " AND NHANVIEN.MANV = PHIEUNHAP.MANV" +
                                " AND NHANVIEN.TENNV LIKE ?",
                        ngayBD, ngayKT, tenNV);
            }
            return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0 AND (MANV = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                    maNVConvert, ngayBD, ngayKT);

        }
        return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0 AND (MANV = ? AND MAPHIEU = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                maNV, maPN, ngayBD, ngayKT);
    }
}
