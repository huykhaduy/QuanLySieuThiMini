/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DTO.ChiTietPhieuHuy;
import DTO.SanPham;
import java.util.List;

/**
 *
 * @author huykh
 */
public class BUSTest {
    public static void main(String[] args){
        SanPhamBUS spBus = new SanPhamBUS();
        List<SanPham> list = spBus.advancedFilter("nuoc giai khat", "5000", "100000", 1, "Co");
        for (SanPham sp:list){
            System.out.println(sp);
        }
    }    
}
