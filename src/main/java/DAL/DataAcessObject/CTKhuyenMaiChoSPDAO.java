package DAL.DataAcessObject;

import DAL.DataModels.ChiTietKhuyenMaiChoSP;

import java.util.List;

public class CTKhuyenMaiChoSPDAO extends AbtractAccessDatabase<ChiTietKhuyenMaiChoSP> implements ISimpleAccessDetail<ChiTietKhuyenMaiChoSP,Integer,Integer> {
    {
        setClazz(ChiTietKhuyenMaiChoSP.class);
    }

    @Override
    public ChiTietKhuyenMaiChoSP select(Integer soKhuyenMai, Integer maSanPham) {
        return executeQuery("SELECT * FROM CHITIETKM_SP WHERE SOKM = ? AND MASP = ?",soKhuyenMai,maSanPham);
    }

    @Override
    public boolean insert(ChiTietKhuyenMaiChoSP chiTietKhuyenMaiChoSP) {
        return executeUpdate("INSERT INTO CHITIETKM_SP(SOKM,MASP) VALUES(?,?)",chiTietKhuyenMaiChoSP.getSoKM(),chiTietKhuyenMaiChoSP.getMaSP());
    }

    @Override
    public boolean update(Integer soKhuyenMai, Integer maSanPham, ChiTietKhuyenMaiChoSP chiTietKhuyenMaiChoSP) {
        return executeUpdate("UPDATE CHITIETKM_SP SET SOKM = ?, MASP = ? WHERE SOKM = ? AND MASP = ?",chiTietKhuyenMaiChoSP.getSoKM(),chiTietKhuyenMaiChoSP.getMaSP(),soKhuyenMai,maSanPham);
    }

    @Override
    public boolean delete(Integer soKhuyenMai, Integer maSanPham) {
        return executeUpdate("DELETE FROM CHITIETKM_SP WHERE SOKM = ? AND MASP = ?",soKhuyenMai,maSanPham);
    }

    @Override
    public List<ChiTietKhuyenMaiChoSP> selectAllById1(Integer soKhuyenMai) {
        return executeQueryList("SELECT * FROM CHITIETKM_SP WHERE SOKM = ?",soKhuyenMai);
    }

    @Override
    public List<ChiTietKhuyenMaiChoSP> selectAllById2(Integer maSanPham) {
        return executeQueryList("SELECT * FROM CHITIETKM_SP WHERE MASP = ?",maSanPham);
    }

    @Override
    public List<ChiTietKhuyenMaiChoSP> selectAll() {
        return executeQueryList("SELECT * FROM CHITIETKM_SP");
    }
}
