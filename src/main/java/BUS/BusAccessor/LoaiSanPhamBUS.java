/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataAcessObject.LoaiSanPhamDAO;
import DAL.DataModels.LoaiSanPham;

/**
 *
 * @author huykh
 */
public class LoaiSanPhamBUS extends AbstractBUSAccessor<LoaiSanPham, LoaiSanPhamDAO>{
    public LoaiSanPhamBUS(){
        setClazz(LoaiSanPhamDAO.class);
        createDAO(clazz);
    }
}
