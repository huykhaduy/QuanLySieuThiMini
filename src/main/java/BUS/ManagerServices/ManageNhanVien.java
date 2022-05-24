/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.ManagerServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.NhanVien;
import DAL.DataModels.SanPham;
import GUI.ManageGroup.ManageItem.ManageFrame.ManageFrame;

import java.util.List;

/**
 *
 * @author ACER
 */
public class ManageNhanVien {
         private final NhanVienDAO nhanVienDAO;
         private final SanPhamDAO sanPhamDAO;
         public ManageNhanVien(){
               nhanVienDAO = new NhanVienDAO();
               sanPhamDAO = new SanPhamDAO();
        }
             public void ts(){
              List<SanPham> SP =  sanPhamDAO.selectAll();
       
             for (SanPham N : SP) 
                 {
                     System.out.println(N);
                     int maSanPham = N.getMaSP();
                  
                      N.getGiaTien();
                     
                      N.getSoLuong();
                      N.getTenSP();
                  }
             
          
             
            
}
         public static void main(String[] args) {
              ManageNhanVien mnv = new ManageNhanVien();
              mnv.ts();
        
    }
     
}
