/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Componentt;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ACER
 */
public class miniMartIcon extends javax.swing.JPanel {
    static Image image;
  
    public miniMartIcon() {
        initComponents();
    }

     protected void paintComponent(Graphics g){
         Graphics2D g2d = (Graphics2D) g.create();
        
        
image = Toolkit.getDefaultToolkit().getImage( "C:\\Users\\ACER\\Documents\\NetBeansProjects\\BaiTapChinh\\src\\main\\java\\Componentt\\miniMarticon.png");
        g2d.drawImage(image, 0, 0,  this);     
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
