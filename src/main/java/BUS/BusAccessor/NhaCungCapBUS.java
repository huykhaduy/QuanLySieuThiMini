/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.NhaCungCapDAO;
import DAL.DataModels.NhaCungCap;
import java.util.List;

/**
 *
 * @author huykh
 */
public class NhaCungCapBUS implements IBussAccess<NhaCungCap, Integer>{
    private final NhaCungCapDAO dao = new NhaCungCapDAO();

    @Override
    public NhaCungCap get(Integer key) {
        return dao.select(key);
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
    public boolean edit(Integer key, NhaCungCap data) {
        return dao.update(key, data);
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
