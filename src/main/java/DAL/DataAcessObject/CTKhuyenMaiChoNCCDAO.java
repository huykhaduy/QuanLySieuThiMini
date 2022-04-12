package DAL.DataAcessObject;

import DAL.DataModels.ChiTietKhuyenMaiChoNCC;

import java.util.List;

public class CTKhuyenMaiChoNCCDAO extends AbtractAccessDatabase<ChiTietKhuyenMaiChoNCC> implements ISimpleAccessDetail<ChiTietKhuyenMaiChoNCC,Integer,Integer> {
    {
        setClazz(ChiTietKhuyenMaiChoNCC.class);
    }


    @Override
    public ChiTietKhuyenMaiChoNCC select(Integer soKhuyenMai, Integer maNhaCungCap) {
        return executeQuery("SELECT * FROM CHITIETKM_NCC WHERE SOKM = ? AND MANCC = ?",soKhuyenMai,maNhaCungCap);
    }

    @Override
    public boolean insert(ChiTietKhuyenMaiChoNCC chiTietKhuyenMaiChoNCC) {
        return executeUpdate("INSERT INTO CHITIETKM_NCC(SOKM,MANCC) VALUES(?,?)",chiTietKhuyenMaiChoNCC.getSoKM(),chiTietKhuyenMaiChoNCC.getMaNCC());
    }

    @Override
    public boolean update(Integer soKhuyenMai, Integer maNhaCungCap, ChiTietKhuyenMaiChoNCC chiTietKhuyenMaiChoNCC) {
        return executeUpdate("UPDATE CHITIETKM_NCC SET SOKM = ?, MANCC = ? WHERE SOKM = ? AND MANCC = ?",chiTietKhuyenMaiChoNCC.getSoKM(),chiTietKhuyenMaiChoNCC.getMaNCC(),soKhuyenMai,maNhaCungCap);
    }

    @Override
    public boolean delete(Integer soKhuyenMai, Integer maNhaCungCap) {
        return executeUpdate("DELETE FROM CHITIETKM_NCC WHERE SOKM = ? AND MANCC = ?",soKhuyenMai,maNhaCungCap);
    }

    @Override
    public List<ChiTietKhuyenMaiChoNCC> selectAllById1(Integer soKhuyenMai) {
        return executeQueryList("SELECT * FROM CHITIETKM_NCC WHERE SOKM = ?",soKhuyenMai);
    }

    @Override
    public List<ChiTietKhuyenMaiChoNCC> selectAllById2(Integer maNhaCungCap) {
        return executeQueryList("SELECT * FROM CHITIETKM_NCC WHERE MANCC = ?",maNhaCungCap);
    }

    @Override
    public List<ChiTietKhuyenMaiChoNCC> selectAll() {
        return executeQueryList("SELECT * FROM CHITIETKM_NCC");
    }
}
