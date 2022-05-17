/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import DAL.DataAcessObject.PhieuHuyDAO;
import DAL.DataModels.PhieuHuy;

/**
 *
 * @author huykh
 */
public class PhieuHuyBUS extends AbstractBUSAccessor<PhieuHuy, Integer, PhieuHuyDAO>{
    public PhieuHuyBUS(){
        setDao(new PhieuHuyDAO());
    }
}
