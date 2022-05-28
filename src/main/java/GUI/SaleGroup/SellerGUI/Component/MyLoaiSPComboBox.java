/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import BUS.BusAccessor.LoaiSanPhamBUS;
import DAL.DataAcessObject.LoaiSanPhamDAO;
import DTO.LoaiSanPham;
import GUI.SaleGroup.SellerGUI.BasicHandle.ComboBoxLoaiSPAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.ComboboxLoaiSanPhamRender;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author huykh
 */
public class MyLoaiSPComboBox extends JComboBox<LoaiSanPham>{
    private final LoaiSanPhamBUS loaispBUS = new LoaiSanPhamBUS();
    
    public MyLoaiSPComboBox() {
        this.setRenderer(new ComboboxLoaiSanPhamRender());
//        getLoaiSPFromDatabase();
    }
    
    @Override
    public LoaiSanPham getSelectedItem(){
        return ((LoaiSanPham) super.getSelectedItem());
    }
    
    public int getSelectedMaLoai(){
        return this.getSelectedItem().getMaLoai();
    }

    public void getLoaiSPFromDatabase(){
        List<LoaiSanPham> list = loaispBUS.getAll();
        for (LoaiSanPham loaisp:list){
            this.addItem(loaisp);
        }
    }
     public void getLoaiSPexAll(){
        List<LoaiSanPham> list = loaispBUS.getAll();
        for (int i = 0 ; i< list.size();i++){
            if(!list.get(i).getTenLoai().equals("Tất cả"))
                 this.addItem(list.get(i));
        }
    }
     
    public void setSelectedLoai(int maLoai){
        for (int i =0 ;i<this.getItemCount();i++){
            if (this.getItemAt(i).getMaLoai() == maLoai){
                this.setSelectedIndex(i);
                break;
            }
        }
    }
    
}
