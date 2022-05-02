/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DAL.DataModels.SanPham;
import GUI.SaleGroup.SellerGUI.Component.OrderItem;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author huykh
 */
public class HandleClickAddEvent implements ActionListener{
    private SanPham sp;
    private OrderPanel orderpanel;

    public HandleClickAddEvent(SanPham sp, OrderPanel orderpanel) {
        this.sp = sp;
        this.orderpanel = orderpanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        orderpanel.addOrderItemOrIncrementByOne(sp);
    }
    
}
