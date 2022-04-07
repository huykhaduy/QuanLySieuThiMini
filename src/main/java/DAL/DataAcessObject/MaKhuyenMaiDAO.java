package DAL.DataAcessObject;

import DAL.DataModels.MaKhuyenMai;

import java.util.List;

public class MaKhuyenMaiDAO extends AbtractAccessDatabase<MaKhuyenMai> implements ISimpleAccess<MaKhuyenMai,String> {
    {
        setClazz(MaKhuyenMai.class);
    }

    @Override
    public boolean insert(MaKhuyenMai maKhuyenMai) {
        return executeUpdate("INSERT INTO MAKHUYENMAI(MAKM,LOAIKM,MOTA,NGAYBD,NGAYKT,GIATRITOITHIEU,KMTOITHIEU,KMTOIDA,PTGIAM,SOLUOTSD,IS_DELETED) VALUES(?,?,?,?,?,?,?,?,?,?,?)",
                maKhuyenMai.getMaKM(),maKhuyenMai.getLoaiKM(),maKhuyenMai.getMoTa(),maKhuyenMai.getNgayBD(),maKhuyenMai.getNgayKT(),maKhuyenMai.getGiaTriToiThieu(),maKhuyenMai.getGiaTriToiThieu(),maKhuyenMai.getKmToiDa(),maKhuyenMai.getPtGiam(),maKhuyenMai.getSoLuotSD(),maKhuyenMai.isDeleted());
    }

    @Override
    public boolean delete(String maKM) {
        return executeUpdate("UPDATE MAKHUYENMAI SET IS_DELETED = 1 WHERE MAKM = ?",maKM);
    }

    @Override
    public boolean update(String maKM, MaKhuyenMai maKhuyenMai) {
        return executeUpdate("UPDATE MAKHUYENMAI SET LOAIKM = ?, MOTA = ?, NGAYBD = ?, NGAYKT = ?, GIATRITOITHIEU = ?, KMTOITHIEU = ?, KMTOIDA = ?, PTGIAM = ?, SOLUOTSD = ?, IS_DELETED = ? WHERE MAKM = ?",
                maKhuyenMai.getLoaiKM(),maKhuyenMai.getMoTa(),maKhuyenMai.getNgayBD(),maKhuyenMai.getNgayKT(),maKhuyenMai.getGiaTriToiThieu(),maKhuyenMai.getGiaTriToiThieu(),maKhuyenMai.getKmToiDa(),maKhuyenMai.getPtGiam(),maKhuyenMai.getSoLuotSD(),maKhuyenMai.isDeleted(),maKM);
    }

    @Override
    public MaKhuyenMai select(String maKM) {
        return executeQuery("SELECT * FROM MAKHUYENMAI WHERE MAKM = ? AND IS_DELETED = 0",maKM);
    }

    @Override
    public List<MaKhuyenMai> selectAll() {
        return executeQueryList("SELECT * FROM MAKHUYENMAI WHERE IS_DELETED = 0");
    }
}
