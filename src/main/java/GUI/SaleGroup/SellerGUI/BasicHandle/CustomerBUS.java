/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DAL.DataAcessObject.KhachHangDAO;
import DTO.KhachHang;

/**
 *
 * @author MY ACER
 */
public class CustomerBUS {
     KhachHangDAO khachHangDao = new KhachHangDAO();

   

    public boolean AddCustomer(String name, boolean sex, String numberPhone, String email, String address ) {
        KhachHang khachHang = new KhachHang();
        khachHang.setTenKH(name);
        khachHang.setEmail(email);
        khachHang.setSoDienThoai(numberPhone);
        khachHang.setDiaChi(address);
        khachHang.setGioiTinh(sex);
        return khachHangDao.insert(khachHang);
    }
    
    public boolean DeleteCustomer (int maKhachHang){
        return khachHangDao.delete(maKhachHang);
    }
    
    public boolean EditCustomer(int maKhachHang, String name, boolean sex, String numberPhone, String email, String address){
         KhachHang khachHang = new KhachHang();
        khachHang.setEmail(email);
        khachHang.setSoDienThoai(numberPhone);
        khachHang.setDiaChi(address);
        khachHang.setGioiTinh(sex);
         return khachHangDao.update(maKhachHang, khachHang);
    }
        
//    public boolean Remove(int maKhachHang)
    
}
