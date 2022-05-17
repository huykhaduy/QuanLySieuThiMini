/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataAcessObject.PhieuNhapDAO;
import DAL.DataModels.PhieuNhap;

/**
 *
 * @author huykh
 */
public class PhieuNhapBUS extends AbstractBUSAccessor<PhieuNhap, Integer, PhieuNhapDAO>{
    public PhieuNhapBUS(){
        setDao(new PhieuNhapDAO());
    }
}
