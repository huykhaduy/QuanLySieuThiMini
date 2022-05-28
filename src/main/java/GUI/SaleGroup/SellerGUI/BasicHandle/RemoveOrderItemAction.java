/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DTO.ChiTietHoaDon;
import DTO.SanPham;
import GUI.SaleGroup.SellerGUI.Component.OrderItem;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author huykh
 */
public class RemoveOrderItemAction implements ActionListener{
//    private SanPham sp;
    private OrderPanel orderpanel;
    private OrderItem orderItem;

//    public RemoveOrderItemAction(SanPham sp, OrderPanel orderpanel) {
//        this.sp = sp;
//        this.orderpanel = orderpanel;
//    }
    
     public RemoveOrderItemAction(OrderItem orderItem, OrderPanel orderpanel) {
        this.orderItem = orderItem;
        this.orderpanel = orderpanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        orderpanel.removeOrderItem(orderItem);
        //đếm số lượng sản phẩm trong panel order
        orderpanel.checkButtonThanhToan();

    }
    
}
