/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataModels.ChiTietPhieuHuy;
import java.util.List;

/**
 *
 * @author huykh
 */
public class BUSTest {
    public static void main(String[] args){
     int Tong = 0 ;
    
    CTHoaDonBUS bUS = new CTHoaDonBUS();
     for(int i = 0 ; i< bUS.getByKey2(62).size();i++)
         {
       Tong =Tong+bUS.getByKey2(62).get(i).getSoLuong() ;
        System.out.println(  bUS.getByKey2(62).get(i).getSoLuong());
    }
        System.out.println("Tong="+Tong);
    }    
}
