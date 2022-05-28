package DAL.DataAcessObject;

import DTO.PhieuHuy;
import java.util.List;

public class PhieuHuyDAO extends AbtractAccessDatabase<PhieuHuy> implements ISimpleAccess<PhieuHuy,Integer> {
    {
        setClazz(PhieuHuy.class);
    }

    @Override
    public boolean insert(PhieuHuy PhieuHuy) {
        return executeUpdate("INSERT INTO PhieuHuy(NGAYLAP,MANV,IS_DELETED) VALUES(?,?,?)",
                PhieuHuy.getNgayLap(),PhieuHuy.getMaNV(),PhieuHuy.isDeleted());
    }

    @Override
    public boolean delete(Integer maPhieuHuy) {
        return executeUpdate("UPDATE PhieuHuy SET IS_DELETED = 1 WHERE MAPHIEU = ?",maPhieuHuy);
    }

    @Override
    public boolean update(Integer maPhieuHuy, PhieuHuy PhieuHuy) {
        return executeUpdate("UPDATE PhieuHuy SET NGAYLAP = ?, MANV = ?, IS_DELETED = ? WHERE MAPHIEU = ?",
                PhieuHuy.getNgayLap(),PhieuHuy.getMaNV(),PhieuHuy.isDeleted(),maPhieuHuy);
    }

    @Override
    public PhieuHuy select(Integer maPhieuHuy) {
        return executeQuery("SELECT * FROM PhieuHuy WHERE MAPHIEU = ? AND IS_DELETED = 0",maPhieuHuy);
    }

    @Override
    public List<PhieuHuy> selectAll() {
        return executeQueryList("SELECT * FROM PhieuHuy WHERE IS_DELETED = 0");
    }
    
    public PhieuHuy selectNewest(){
        return executeQuery("SELECT * FROM PhieuHuy ORDER BY MAPHIEU DESC LIMIT 1");
    }
    
    public List<PhieuHuy> selectAndFilter(String maNV, String maPN, String ngayBD, String ngayKT){
        if (maNV.isEmpty() && maPN.isEmpty()){
            return executeQueryList("SELECT * FROM PHIEUHUY WHERE IS_DELETED = 0 AND (NGAYLAP >= ? AND NGAYLAP <= ?)",
                ngayBD, ngayKT);
        }
        else if (maNV.isEmpty()){
            return executeQueryList("SELECT * FROM PHIEUHUY WHERE IS_DELETED = 0 AND (MAPHIEU = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                maPN, ngayBD, ngayKT);
        }   
        else if (maPN.isEmpty()){
            int maNVConvert = 0;
            try{
                maNVConvert = Integer.parseInt(maNV);
            } catch (NumberFormatException e){
                String tenNV = "%"+maNV+"%";
                return executeQueryList("SELECT PHIEUHUY.* FROM PHIEUHUY, NHANVIEN " +
                                " WHERE PHIEUHUY.IS_DELETED = 0 AND (PHIEUHUY.NGAYLAP >= ? AND PHIEUHUY.NGAYLAP <= ?)" +
                                " AND NHANVIEN.MANV = PHIEUHUY.MANV" +
                                " AND NHANVIEN.TENNV LIKE ?",
                        ngayBD, ngayKT, tenNV);
            }
            return executeQueryList("SELECT * FROM PHIEUHUY WHERE IS_DELETED = 0 AND (MANV = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                    maNVConvert, ngayBD, ngayKT);

        }
        return executeQueryList("SELECT * FROM PHIEUHUY WHERE IS_DELETED = 0 AND (MANV = ? AND MAPHIEU = ? AND NGAYLAP >= ? AND NGAYLAP <= ?)",
                maNV, maPN, ngayBD, ngayKT);
    }
}
