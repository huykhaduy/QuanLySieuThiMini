/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.CheckInfoSale;
import BUS.SaleServices.PayAction;
import DAL.DataModels.ChiTietHoaDon;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import GUI.SaleGroup.SellerGUI.SellerMainFrame;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class ChangePaymentInfo {
    
//    private JLabel lbTong;
//    private JLabel lbGiam;
//    private JLabel lbThanhToan;
//    
//    private final CheckInfoSale check = new CheckInfoSale();
    private final PayAction pay = new PayAction();
//    private OrderPanel orderPanel;
    private String SDT;
    private String maVoucher;
    
    public ChangePaymentInfo(){
        
    }
    
    public ChangePaymentInfo(String SDT, String maVoucher){
//        this.orderPanel = orderPanel;
        this.SDT = SDT;
        this.maVoucher = maVoucher;
//        this.lbTong = lbTong;
//        this.lbGiam = lbGiam;
//        this.lbThanhToan = lbThanhToan;
    }
    
    public void calculatePayment(List<ChiTietHoaDon> ListCTHD){
//        List<ChiTietHoaDon> CTHD = this.orderPanel.getListChiTietHoaDon(0);
        SellerMainFrame.lbTextTotal.setText(pay.totalBill(ListCTHD) + "");
        SellerMainFrame.lbTextDiscount.setText((pay.discountBillByPoint(this.SDT) + pay.discountBillByVoucher(maVoucher)) + "");
        SellerMainFrame.lbTextMoney.setText(pay.payForBillAfterDiscount(maVoucher, SDT) + "");
    }
}
