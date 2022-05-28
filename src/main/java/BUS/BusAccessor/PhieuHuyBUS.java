/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataAcessObject.PhieuHuyDAO;
import DTO.ChiTietPhieuHuy;
import DTO.PhieuHuy;
import java.util.List;

/**
 *
 * @author huykh
 */
public class PhieuHuyBUS extends AbstractBUSAccessor<PhieuHuy, Integer, PhieuHuyDAO>{
    public PhieuHuyBUS(){
        setDao(new PhieuHuyDAO());
    }
    
    public List<PhieuHuy> getFilter(String maNV, String maPN, String ngayBD, String ngayKT) {
        return dao.selectAndFilter(maNV, maPN, ngayBD, ngayKT);
    }
    
    public List<PhieuHuy> getPhieuHuyInTime(String ngayBD, String ngayKT) {
        return dao.selectAndFilter("", "", ngayBD, ngayKT);
    }
    
    @Override
    public boolean remove(Integer key) {
        CTPhieuHuyBUS ctHuy = new CTPhieuHuyBUS();
        List<ChiTietPhieuHuy> list = ctHuy.getByKey1(key);
        SanPhamBUS spBus = new SanPhamBUS();
        if (list != null && !list.isEmpty()){
            for (ChiTietPhieuHuy ph: list){
               int maSP = ph.getMaSP();
               spBus.thayDoiSoLuong(maSP, ph.getSoLuong());
            }
        }
        return dao.delete(key);
    }
    
    @Override
    public PhieuHuy getNewest(){
        return dao.selectNewest();
    }
    
}
