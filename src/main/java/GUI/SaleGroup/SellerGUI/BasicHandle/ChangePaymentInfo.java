/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.Money;
import BUS.SaleServices.PayActionBus;
import DTO.ChiTietHoaDon;
import GUI.SaleGroup.SellerGUI.SellerMainFrame;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author TUANMINH
 */
public class ChangePaymentInfo {
    
    private final PayActionBus pay = new PayActionBus();
    private JTextField txtVoucher;
    private JTextField txtPhoneNumber;
    private JLabel lbTextTotal;
    private JLabel lbTextDiscount;
    private JLabel lbTextMoney;
    private long total;
    private String sdt;
    
    public ChangePaymentInfo(){
        
    }
    
    public ChangePaymentInfo(JTextField txtPhoneNumber, JTextField txtVoucher, JLabel lbTextTotal, JLabel lbTextDiscount, JLabel lbTextMoney){
        this.txtPhoneNumber = txtPhoneNumber;
        this.txtVoucher = txtVoucher;
        this.lbTextTotal = lbTextTotal;
        this.lbTextDiscount = lbTextDiscount;
        this.lbTextMoney = lbTextMoney;
        
    }
    
    public void calculatePayment(List<ChiTietHoaDon> ListCTHD){
        total = pay.totalBill(ListCTHD);
        sdt = txtPhoneNumber.isEnabled() ? txtPhoneNumber.getText() : "";
        this.lbTextTotal.setText(pay.totalBill(ListCTHD)+"");
        this.lbTextDiscount.setText((pay.discountBillByPoint(sdt, total) + pay.discountBillByVoucher(txtVoucher.getText(),total))+"");
        this.lbTextMoney.setText((pay.payForBillAfterDiscount(txtVoucher.getText(), sdt, total))+"");

    }
}
