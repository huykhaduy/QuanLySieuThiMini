/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.HoaDonDAO;
import DAL.DataModels.HoaDon;
import java.util.List;

/**
 *
 * @author tiend
 */
public class HoaDonBUS implements IBussAccess<HoaDon, Integer>{
    private final HoaDonDAO HoaDonDAO=new HoaDonDAO();
    @Override
    public HoaDon get(Integer maHoaDon) {
        return HoaDonDAO.select(maHoaDon);
    }

    @Override
    public List<HoaDon> getAll() {
        return HoaDonDAO.selectAll();
    }

    @Override
    public boolean add(HoaDon hoadon) {
        return HoaDonDAO.insert(hoadon);
    }

    @Override
    public boolean edit(Integer maHoaDon, HoaDon hoadon) {
        return HoaDonDAO.update(maHoaDon, hoadon);
    }

    @Override
    public boolean remove(Integer maHoaDon) {
        return HoaDonDAO.delete(maHoaDon);
    }

    @Override
    public HoaDon getNewest() {
       List<HoaDon> list=getAll();
       return list== null ? null : list.get(list.size()-1);
    }
    
    public List<HoaDon> getHoaDonFromTo(String start, String end){
        return HoaDonDAO.selectHoaDonTrongKhoang(start, end);
    }
    
}
