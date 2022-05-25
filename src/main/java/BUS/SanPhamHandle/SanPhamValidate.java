/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.SanPhamHandle;

import BUS.BusAccessor.NhaCungCapBUS;
import DAL.DataModels.SanPham;
import DAL.DataModels.Voucher;


public class SanPhamValidate {
    private SanPham validatedsanPham ;

    public SanPham getValidatedsanPham() {
        return validatedsanPham;
    }

    public void setValidatedsanPham(SanPham validatedsanPham) {
        this.validatedsanPham = validatedsanPham;
    }
  
    private boolean CheckGia(String Gia){
        long gia = Long.valueOf(Gia);
        System.out.println(gia);
        if(gia<0)
            return false;
        
         return true;
      
}
     private boolean CheckTen (String Ten){
         return Ten.length()>0;
     }
     private boolean CheckNCC (String nhaCungCap){
       
         return Integer.valueOf(nhaCungCap) > 0; 
     }
     private boolean CheckLoai (String Loai)
     {
        return Integer.valueOf(Loai) > 0; 
     }
     private boolean CheckMota (String Mota){
         return Mota.length()>20;
     }

    public boolean AllValidate(String Gia,String Ten,String nhaCungCap,String Loai,String Mota) {
       return CheckGia(Gia)&&CheckTen(Ten)&&CheckMota(Mota)&&CheckNCC(nhaCungCap)&&CheckLoai(Loai);
    }

  
             
}
