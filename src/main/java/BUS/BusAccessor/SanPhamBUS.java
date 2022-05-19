/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.SanPham;
import java.util.List;

/**
 *
 * @author ACER
 */
public class SanPhamBUS implements  IBussAccess<SanPham>{
     private final SanPhamDAO spDAO = new SanPhamDAO();

    @Override
    public SanPham get(int maSP) {
         return spDAO.select(maSP);
    }

    @Override
    public List<SanPham> getAll() {
       return spDAO.selectAll();
    }

    @Override
    public boolean add(SanPham data) {
      return spDAO.insert(data);
    }

    @Override
    public boolean edit(int key, SanPham data) {
       return spDAO.update(key, data);
    }

    @Override
    public boolean remove(int key) {
       return spDAO.delete(key);
    }

    @Override
    public SanPham getNewest() {
        List<SanPham> list = spDAO.selectAll();
        return list== null ? null:list.get(list.size()-1);
    }
}
