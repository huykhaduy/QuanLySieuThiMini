/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ChiTietHoaDonDAO;
import DAL.DataModels.ChiTietHoaDon;
import java.util.List;

/**
 *
 * @author huykh
 */
public class CTHoaDonBUS implements IBusAccessDetail<ChiTietHoaDon>{
    private ChiTietHoaDonDAO dao = new ChiTietHoaDonDAO();
    
    //Key 1 là mã hóa don, maSP là mã sp
    @Override
    public ChiTietHoaDon get(int maHoaDon, int maSP) {
        return dao.select(maHoaDon, maSP);
    }

    @Override
    public List<ChiTietHoaDon> getByKey1(int maHoaDon) {
        return dao.selectAllById1(maHoaDon);
    }

    @Override
    public List<ChiTietHoaDon> getByKey2(int maSP) {
        return dao.selectAllById2(maSP);
    }

    @Override
    public List<ChiTietHoaDon> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(ChiTietHoaDon data) {
        return dao.insert(data);
    }

    @Override
    public boolean edit(int maHoaDon, int maSP, ChiTietHoaDon data) {
        return dao.update(maHoaDon, maSP, data);
    }

    @Override
    public boolean remove(int maHoaDon, int maSP) {
        return dao.delete(maHoaDon, maSP);
    }
    
}
