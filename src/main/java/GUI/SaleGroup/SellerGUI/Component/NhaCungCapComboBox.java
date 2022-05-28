/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import BUS.BusAccessor.NhaCungCapBUS;
import DTO.LoaiSanPham;
import DTO.NhaCungCap;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author huykh
 */
public class NhaCungCapComboBox extends JComboBox<NhaCungCap>{
    private NhaCungCapBUS nccBus = new NhaCungCapBUS();
    
    public NhaCungCapComboBox() {
        this.setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof NhaCungCap nhaCungCap) {
                    value = nhaCungCap.getTenNCC();
                }
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                return this;
            }
        });
    }
    
    @Override
    public NhaCungCap getSelectedItem(){
        return ((NhaCungCap) super.getSelectedItem());
    }
    
    public int getSelectedMaNCC(){
        return this.getSelectedItem().getMaNCC();
    }
    
    public void setSelectedItem(int maNCC){
        for (int i=0;i<this.getItemCount();i++){
            if (getItemAt(i).getMaNCC() == maNCC){
                this.setSelectedIndex(i);
//                System.out.println(this.getSelectedItem().getTenNCC());
                break;
            }
        }
    }

//    NhaCungCap(int maNCC, String tenNCC, String diaChi, String sdt, String email, boolean isDeleted)
    public void getNCCFromDatabase(){
        List<NhaCungCap> list = nccBus.getAll();
        this.addItem(new NhaCungCap(0,"Trống","Trống","Trống","Trống",false));
        for (NhaCungCap ncc:list){
            this.addItem(ncc);
        }
    }
    
}
