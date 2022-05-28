/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManageGroup.Handle.SanPhamHandle;

import BUS.BusAccessor.LoaiSanPhamBUS;
import BUS.BusAccessor.NhaCungCapBUS;
import DTO.SanPham;
import DTO.Voucher;
import javax.swing.JOptionPane;


public class SanPhamValidate {
    private SanPham validatedsanPham ;

    public SanPham getValidatedsanPham() {
        return validatedsanPham;
    }

    public void setValidatedsanPham(SanPham validatedsanPham) {
        this.validatedsanPham = validatedsanPham;
    }
  
    private boolean CheckGia(String Gia){
        try{
            long gia = Long.valueOf(Gia);
        } catch (NumberFormatException e){
           return false;
        }
         return true;
      
}
    private boolean CheckHinhAnh (String url){
        if(url ==null) return false;
         return url.length()>0;
     }
     private boolean CheckTen (String Ten){
         return Ten.length()>0;
     }

  
     private boolean CheckMota (String Mota){
         return Mota.length()>20;
     }

    public boolean AllValidate(String Gia,String Ten,String Mota,String url) {
       return CheckGia(Gia)&&CheckTen(Ten)&&CheckMota(Mota)&&CheckHinhAnh(url);
    }

  
             
}
