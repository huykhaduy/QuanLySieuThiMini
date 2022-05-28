/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.NhaCungCapDAO;
import DTO.NhaCungCap;
import java.util.List;


public class NhaCungCapBUS implements IBussAccess<NhaCungCap, Integer>{
    private final NhaCungCapDAO dao = new NhaCungCapDAO();

    @Override
    public NhaCungCap get(Integer maNCC) {
        return dao.select(maNCC);
    }

    @Override
    public List<NhaCungCap> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(NhaCungCap data) {
        return dao.insert(data);
    }

    @Override
    public boolean edit(Integer maNhaCungCap, NhaCungCap ncc) {
       return dao.update(maNhaCungCap, ncc);
    }

    @Override
    public boolean remove(Integer key) {
        return dao.delete(key);
    }

    @Override
    public NhaCungCap getNewest() {
        List<NhaCungCap> list = dao.selectAll();
        return list == null ? null:list.get(list.size()-1);
    }
    
}
