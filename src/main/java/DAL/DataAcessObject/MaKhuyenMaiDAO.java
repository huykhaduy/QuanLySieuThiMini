package DAL.DataAcessObject;

import DAL.DataModels.MaKhuyenMai;

import java.util.List;

public class MaKhuyenMaiDAO extends AbtractAccessDatabase<MaKhuyenMai> implements ISimpleAccess<MaKhuyenMai> {
    {
        setClazz(MaKhuyenMai.class);
    }

    @Override
    public boolean insert(MaKhuyenMai maKhuyenMai) {
//        return executeUpdate("INSERT INTO MAKHUYENMAI(LOAIKM, MOTA, NGAYBD, NGAYKT, GIATRITOITHIEU, KMTOITHIEU, KMTOIDA, PTGIAM, SOLUOTSD, IS_DELETED) VALUES(?,?,?,?,?)",
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean update(Integer id, MaKhuyenMai maKhuyenMai) {
        return false;
    }

    @Override
    public MaKhuyenMai select(Integer id) {
        return null;
    }

    @Override
    public List<MaKhuyenMai> selectAll() {
        return null;
    }
}
