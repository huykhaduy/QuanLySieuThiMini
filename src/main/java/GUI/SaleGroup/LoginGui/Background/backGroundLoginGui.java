/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SaleGroup.LoginGui.Background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class backGroundLoginGui extends javax.swing.JPanel {

    /**
     * Creates new form backGroundLoginGui
     */
    public backGroundLoginGui() {
        initComponents();
    }
     {
        setOpaque(false);
    }
   protected void paintComponent(Graphics g){
         
  
         Graphics2D g2d = (Graphics2D) g.create();
  
        setSize(1080, 660);
        Color xanh =  Color.decode("#66D9FF");
        Color trang =  Color.decode("#FFFFFF");
       int polyX[]={0,getWidth()/2,getWidth()/2,0};
       int polyY[]={0,0,getHeight(),getHeight()};
       int polyX2[]={getWidth()/2,getWidth(),getWidth(),getWidth()/2};
       int polyY2[]={0,0,getHeight(),getHeight()};

        g2d.setColor(xanh);
        g2d.fillPolygon(polyX,polyY,4);
         g2d.setColor(trang);
        g2d.fillPolygon(polyX2,polyY2,4);
        g2d.dispose();

        super.paintComponent(g);
        

     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
