package DAL.DataAcessObject;

import DAL.DataModels.SanPham;

import java.util.List;

public class SanPhamDAO extends AbtractAccessDatabase<SanPham> implements ISimpleAccess<SanPham> {

    @Override
    public boolean insert(SanPham sanPham) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean update(Integer id, SanPham sanPham) {
        return false;
    }

    @Override
    public SanPham select(Integer id) {
        return null;
    }

    @Override
    public List<SanPham> selectAll() {
        return null;
    }
}
