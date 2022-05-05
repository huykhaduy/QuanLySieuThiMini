/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.PayAction;
import DAL.DataModels.ChiTietHoaDon;
import GUI.SaleGroup.SellerGUI.Component.OptionPaneBill;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author TUANMINH
 */
public class PayActionListener implements java.awt.event.ActionListener{
    
    private int maNV;
    private JTextField txtVoucher;
    private JTextField txtPhoneNumber;
    private JLabel lbTotal;
    private JLabel lbDiscount;
    private OrderPanel orderPanel;
    private final PayAction pay = new PayAction();
    
    public PayActionListener(int maNV, JTextField txtVoucher, JTextField txtPhoneNumber, JLabel lbTotal,JLabel lbDiscount, OrderPanel orderPanel){
        this.maNV = maNV;
        this.txtVoucher = txtVoucher;
        this.txtPhoneNumber = txtPhoneNumber;
        this.lbTotal = lbTotal;
        this.lbDiscount = lbDiscount;
        this.orderPanel = orderPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int size = orderPanel.getListChiTietHoaDon(0).size();
        long total = Long.valueOf(lbTotal.getText());
        long discount = Long.valueOf(lbDiscount.getText());
        String tenKH;
        List<String> data = new ArrayList<>();
        String[][] datas = new String[size][];
        tenKH = pay.getNameFromPhoneNumber(txtPhoneNumber.getText());
        
        
        if(pay.storeBill("Tiền mặt", total, maNV, txtPhoneNumber.getText(), txtVoucher.getText()))
            if(pay.storeBillDetail(orderPanel.getListChiTietHoaDon(0))){
                
                //To show Bill
                int i = 0;
                for(ChiTietHoaDon item : orderPanel.getListChiTietHoaDon(pay.getMaHD())){
                    data.clear();
                    data.add(pay.getNameSPFromID(item.getMaSP()));
                    data.add(String.valueOf(item.getSoLuong()));
                    data.add(String.valueOf(item.getGiaTien()));
                    datas[i] = data.toArray(String[]::new);
                    i++;
                }
                
                OptionPaneBill.showBillPane("Tiền mặt", total, maNV, tenKH, discount, pay.getMaHD(), datas);
   
            }
    }
    
}
