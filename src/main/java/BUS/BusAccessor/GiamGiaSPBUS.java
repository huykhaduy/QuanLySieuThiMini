/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.GiamGiaSPDAO;
import DAL.DataModels.GiamGiaSP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiend
 */
public class GiamGiaSPBUS implements IBussAccess<GiamGiaSP, Integer>{
    private final GiamGiaSPDAO giamgiaSPDAO= new GiamGiaSPDAO();
    @Override
    public GiamGiaSP get(Integer soPhieu) {
        return giamgiaSPDAO.select(soPhieu);
    }

    @Override
    public List<GiamGiaSP> getAll() {
        return giamgiaSPDAO.selectAll();
    }

    @Override
    public boolean add(GiamGiaSP data) {
        return giamgiaSPDAO.insert(data);
    }

    @Override
    public boolean edit(Integer soPhieu, GiamGiaSP data) {
        return giamgiaSPDAO.update(soPhieu, data);
    }

    @Override
    public boolean remove(Integer soPhieu) {
        return giamgiaSPDAO.delete(soPhieu);
    }

    @Override
    public GiamGiaSP getNewest() {
        List<GiamGiaSP> list = getAll();
        return list == null ? null : list.get(list.size() - 1);
    }
 
    public String[][] convertToStringList(){
        List<GiamGiaSP> lsGiamGiaSP = getAll();
        if (lsGiamGiaSP == null || lsGiamGiaSP.isEmpty()) return null;
        String[][] datas = new String[lsGiamGiaSP.size()][];
        List<String> data = new ArrayList<>();
        
        int i = 0;
        for(GiamGiaSP giamGia : lsGiamGiaSP){
            data.clear();
            data.add(giamGia.getSoPhieu()+"");
            data.add(giamGia.getMaSP()+"");
            data.add(giamGia.getPtGiam()+"%");
            datas[i] = data.toArray(String[] :: new);
            i++;
        }
        return datas;
    }
}
