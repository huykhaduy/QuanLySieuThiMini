package BUS.BusAccessor;

import DAL.DataAcessObject.CTPhieuNhapDAO;
import DAL.DataAcessObject.ISimpleAccess;
import DTO.ChiTietPhieuNhap;
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
    private SanPhamBUS spBUS = new SanPhamBUS();

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
        spBUS.thayDoiSoLuong(data.getMaSP(), data.getSoLuong());
        return dao.insert(data);
    }

    @Override
    public boolean edit(int key1, int key2, ChiTietPhieuNhap data) {
        ChiTietPhieuNhap ct = this.get(key1, key2);
        spBUS.thayDoiSoLuong(key2, data.getSoLuong()-ct.getSoLuong());
        return dao.update(key1, key2, data);
    }

    @Override
    public boolean remove(int key1, int key2) {
        ChiTietPhieuNhap ct = this.get(key1, key2);
        spBUS.thayDoiSoLuong(key2, -ct.getSoLuong());
        return dao.delete(key1, key2);
    }
    
}
