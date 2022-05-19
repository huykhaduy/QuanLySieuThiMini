/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.CTPhieuHuyDAO;
import DAL.DataModels.ChiTietPhieuHuy;
import java.util.List;

/**
 *
 * @author huykh
 */
public class CTPhieuHuyBUS implements IBusAccessDetail<ChiTietPhieuHuy>{
    private CTPhieuHuyDAO dao = new CTPhieuHuyDAO();

    @Override
    public ChiTietPhieuHuy get(int key1, int key2) {
        return dao.select(key1, key2);
    }

    @Override
    public List<ChiTietPhieuHuy> getByKey1(int key1) {
        return dao.selectAllById1(key1);
    }

    @Override
    public List<ChiTietPhieuHuy> getByKey2(int key2) {
        return dao.selectAllById2(key2);
    }

    @Override
    public List<ChiTietPhieuHuy> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(ChiTietPhieuHuy data) {
        return dao.insert(data);
    }

    @Override
    public boolean edit(int key1, int key2, ChiTietPhieuHuy data) {
        return dao.update(key1, key2, data);
    }

    @Override
    public boolean remove(int key1, int key2) {
        return dao.delete(key1, key2);
    }

    
    
}
