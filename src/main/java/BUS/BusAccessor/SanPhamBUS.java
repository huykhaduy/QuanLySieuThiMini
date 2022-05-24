package BUS.BusAccessor;

import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.NhanVien;
import DAL.DataModels.SanPham;
import java.util.List;

public  class SanPhamBUS implements IBussAccess<SanPham, Integer>{
    private final SanPhamDAO sanPhamDAO =new  SanPhamDAO();
    @Override
    public SanPham get(Integer maSanPham) {
        return sanPhamDAO.select(maSanPham);
    }

    @Override
    public List<SanPham> getAll() {
       return sanPhamDAO.selectAll();
    }

    @Override
    public boolean add(SanPham sanpham) {
        return  sanPhamDAO.insert(sanpham);
    }

    @Override
    public boolean edit(Integer maSanPham, SanPham sanpham) {
       return sanPhamDAO.update(maSanPham, sanpham);
    }

    @Override
    public boolean remove(Integer maSanPham) {
      return sanPhamDAO.delete(maSanPham);
    }
 

    @Override
    public SanPham getNewest() {
       List<SanPham> list=getAll();
       return list== null ? null : list.get(list.size()-1);
    }
}

   