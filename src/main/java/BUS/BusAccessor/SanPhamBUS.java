/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.SanPham;
import java.util.List;

/**
 *
 * @author tiend
 */
public class SanPhamBUS implements IBussAccess<SanPham,Integer>{
      private final SanPhamDAO spDAO = new SanPhamDAO();

    @Override
    public SanPham get(Integer maSanPham) {
         return spDAO.select(maSanPham);
    }

    @Override
    public List<SanPham> getAll() {
        return spDAO.selectAll();
    }

    @Override
    public boolean add(SanPham sp) {
        return spDAO.insert(sp);
    }

    @Override
    public boolean edit(Integer maSanPham, SanPham sp) {
        return spDAO.update(maSanPham, sp);
    }

    @Override
    public boolean remove(Integer maSanPham) {
        return spDAO.delete(maSanPham);
    }

    @Override
    public SanPham getNewest() {
        List<SanPham> list=getAll();
        return list== null ? null : list.get(list.size()-1);
        
    }
    
}
