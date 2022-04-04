/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Componentt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;


public class triangleShape1 extends javax.swing.JPanel {

    
    public triangleShape1() {
        initComponents();
    }
    {
        setOpaque(false);
    }


    protected void paintComponent(Graphics g){
         Graphics2D g2d = (Graphics2D) g.create();
         
        setSize(1080, 660);
        Color xanhNhat =  Color.decode("#E0FCE5");
        Color xanhDam =  Color.decode("#C3FFCD");
       int polyX[]={0,getWidth(),0};
       int polyY[]={0,0,getHeight()};
       int polyX2[]={getWidth(),getWidth(),0};
       int polyY2[]={0,getHeight(),getHeight()};
       
        g2d.setColor(xanhNhat);
        g2d.fillPolygon(polyX,polyY,3);
         g2d.setColor(xanhDam);
        g2d.fillPolygon(polyX2,polyY2,3);
        g2d.dispose();
        super.paintComponent(g);
        

     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconUser1 = new Componentt.IconUser();
        shape13 = new Componentt.Shape1();
        shape12 = new Componentt.Shape1();

        javax.swing.GroupLayout iconUser1Layout = new javax.swing.GroupLayout(iconUser1);
        iconUser1.setLayout(iconUser1Layout);
        iconUser1Layout.setHorizontalGroup(
            iconUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        iconUser1Layout.setVerticalGroup(
            iconUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        shape13.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout shape13Layout = new javax.swing.GroupLayout(shape13);
        shape13.setLayout(shape13Layout);
        shape13Layout.setHorizontalGroup(
            shape13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        shape13Layout.setVerticalGroup(
            shape13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        shape12.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout shape12Layout = new javax.swing.GroupLayout(shape12);
        shape12.setLayout(shape12Layout);
        shape12Layout.setHorizontalGroup(
            shape12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        shape12Layout.setVerticalGroup(
            shape12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1906, 1906, 1906)
                .addComponent(shape13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(shape12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shape12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shape13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentt.IconUser iconUser1;
    private Componentt.Shape1 shape12;
    private Componentt.Shape1 shape13;
    // End of variables declaration//GEN-END:variables
}
