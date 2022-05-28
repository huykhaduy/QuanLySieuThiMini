/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ComponentPanel;

import BUS.BusAccessor.NhaCungCapBUS;
import DTO.SanPham;

/**
 *
 * @author huykh
 */
public class ProductDetailPanel extends PanelAdd {
    private SanPham sanpham;
    private static final NhaCungCapBUS nhaccBus = new NhaCungCapBUS();
//    private static final MaLoai
    
    /**
     * Creates new form ProductDetailPanel
     */
    public ProductDetailPanel() {
        initComponents();
    }

    public ProductDetailPanel(SanPham sanpham) {
        initComponents();
        this.sanpham = sanpham;
        initInfo();
    }

    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
        initInfo();
        System.out.println("Show sanpham: "+sanpham.getTenSP());
    }
    
    private void initInfo(){
        String tenNhaCC = nhaccBus.get(sanpham.getMaNCC()).getTenNCC();
        imagePanel.setImagePath(sanpham.getHinhAnh());
        lbName.setText("<html>"+sanpham.getTenSP());
        lbMaSp.setText(Integer.toString(sanpham.getMaSP()));
        lbDonGia.setText(Long.toString(sanpham.getGiaTien()));
        lbLoai.setText(sanpham.getMaLoai()+"");
        lbSoLuong.setText(sanpham.getSoLuong()+"");
        lbNhaCC.setText(tenNhaCC);
        String mota = sanpham.getMoTa();
        if (mota.length()>270){
            mota = "<html>" +sanpham.getMoTa().substring(0, 268);
            mota += "...";
        } else {
            mota = "<html>"+sanpham.getMoTa();
        }
        lbMoTa.setText(mota);
        imagePanel.setToolTipText("<html> <div style='width:200px'>"+sanpham.getMoTa());
        this.revalidate();
        this.repaint();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lbMoTa = new javax.swing.JLabel();
        lbMaSp = new javax.swing.JLabel();
        lbDonGia = new javax.swing.JLabel();
        lbLoai = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbNhaCC = new javax.swing.JLabel();
        imagePanel = new GUI.ManageGroup.ComponentPanel.ImagePanel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Tên sản phẩm");
        add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 740, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Mã loại:");
        add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 60, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Mã sản phẩm:");
        add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 60, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Đơn giá:");
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 100, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Số lượng:");
        add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Nhà cung cấp:");
        add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 100, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Mô tả:");
        add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 140, -1, -1));

        lbMoTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMoTa.setForeground(new java.awt.Color(17, 86, 125));
        lbMoTa.setText("<html> ");
        lbMoTa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lbMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 140, 610, 60));

        lbMaSp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMaSp.setForeground(new java.awt.Color(17, 86, 125));
        add(lbMaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 60, -1, -1));

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(17, 86, 125));
        add(lbDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 100, -1, -1));

        lbLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbLoai.setForeground(new java.awt.Color(17, 86, 125));
        add(lbLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSoLuong.setForeground(new java.awt.Color(17, 86, 125));
        add(lbSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        lbNhaCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNhaCC.setForeground(new java.awt.Color(17, 86, 125));
        add(lbNhaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 100, -1, -1));

        imagePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 42, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoai;
    private javax.swing.JLabel lbMaSp;
    private javax.swing.JLabel lbMoTa;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNhaCC;
    private javax.swing.JLabel lbSoLuong;
    // End of variables declaration//GEN-END:variables
}
