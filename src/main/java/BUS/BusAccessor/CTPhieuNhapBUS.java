package BUS.BusAccessor;

import DAL.DataAcessObject.CTPhieuNhapDAO;
import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataModels.ChiTietPhieuNhap;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huykh
 */
public class CTPhieuNhapBUS implements IBusAccessDetail<ChiTietPhieuNhap>{
    private CTPhieuNhapDAO dao = new CTPhieuNhapDAO();

    @Override
    public ChiTietPhieuNhap get(int key1, int key2) {
        return dao.select(key1, key2);
    }

    @Override
    public List<ChiTietPhieuNhap> getByKey1(int key1) {
        return dao.selectAllById1(key1);
    }

    @Override
    public List<ChiTietPhieuNhap> getByKey2(int key2) {
        return dao.selectAllById2(key2);
    }

    @Override
    public List<ChiTietPhieuNhap> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(ChiTietPhieuNhap data) {
        return dao.insert(data);
    }

    @Override
    public boolean edit(int key1, int key2, ChiTietPhieuNhap data) {
        return dao.update(key1, key2, data);
    }

    @Override
    public boolean remove(int key1, int key2) {
        return dao.delete(key1, key2);
    }
    
}
