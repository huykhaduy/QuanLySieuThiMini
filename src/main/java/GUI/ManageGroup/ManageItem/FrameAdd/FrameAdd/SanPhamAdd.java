/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd;
import BUS.BusAccessor.LoaiSanPhamBUS;
import BUS.BusAccessor.NhaCungCapBUS;
import BUS.BusAccessor.SanPhamBUS;
import GUI.ManageGroup.Handle.SanPhamHandle.SanPhamToData;
import GUI.ManageGroup.Handle.SanPhamHandle.SanPhamValidate;
import DTO.LoaiSanPham;
import DTO.NhaCungCap;
import DTO.SanPham;
import GUI.ManageGroup.ManageItem.ManagerPanel.SanPhamPanel;
import java.awt.Color;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ACER
 */
public class SanPhamAdd extends javax.swing.JFrame {
      private String url;
      SanPhamBUS sanphamBUS = new SanPhamBUS();
      SanPhamValidate spVali = new SanPhamValidate();
      SanPhamToData spData =new SanPhamToData();
      SanPhamPanel spPanel = new SanPhamPanel();
     LoaiSanPhamBUS maloaiBUS = new LoaiSanPhamBUS();
     NhaCungCapBUS  nccBUS = new NhaCungCapBUS();
     
      

    public SanPhamAdd() {
        initComponents();
        this.setDefaultCloseOperation(0);
        Loadcb();
       // Tạo mã sản phẩm mới
        tfMaSanPham.setText(String.valueOf(sanphamBUS.getNewest().getMaSP()+1));
    }
    // reset Text
    public void setNullText(){
              tfSanPham.setText("");
              tfGia.setText("");
              tfMoTa.setText("");
              imagePanel2.setImage(null);
              imagePanel2.setBackground(Color.decode("#3C3F41"));
    }
    public void Loadcb(){
         List <NhaCungCap> iNCC =nccBUS.getAll();
         if (iNCC == null || iNCC.isEmpty()) return;
        for(int i=0;i< iNCC.size();i++){
        cbNCC.addItem(GetLoai(iNCC.get(i).getMaNCC()));
        }
       cbLoai.getLoaiSPexAll();
}
      public String GetLoai(int NCC){
        return  nccBUS.get(NCC).getTenNCC();
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shape1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        sanPhamAddBackground1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfSanPham = new javax.swing.JTextField();
        tfMaSanPham = new javax.swing.JTextField();
        tfGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfMoTa = new javax.swing.JTextArea();
        button1 = new GUI.SaleGroup.LoginGui.Component.Button();
        button2 = new GUI.SaleGroup.LoginGui.Component.Button();
        imagePanel2 = new GUI.ManageGroup.ComponentPanel.ImagePanel();
        cbLoai = new GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox();
        cbNCC = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sanPhamAddBackground1.setBackground(new java.awt.Color(246, 158, 24));
        sanPhamAddBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tên sản phẩm");
        sanPhamAddBackground1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 111, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhà cung cấp");
        sanPhamAddBackground1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Giá");
        sanPhamAddBackground1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 37, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã sản phẩm");
        sanPhamAddBackground1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Loại");
        sanPhamAddBackground1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 37, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mô tả");
        sanPhamAddBackground1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 427, 91, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Thêm sản phẩm");
        sanPhamAddBackground1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 6, 157, -1));

        tfSanPham.setBackground(new java.awt.Color(255, 255, 255));
        sanPhamAddBackground1.add(tfSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 299, -1));

        tfMaSanPham.setBackground(new java.awt.Color(255, 255, 255));
        tfMaSanPham.setFocusable(false);
        sanPhamAddBackground1.add(tfMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 299, -1));

        tfGia.setBackground(new java.awt.Color(255, 255, 255));
        sanPhamAddBackground1.add(tfGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, -1));

        tfMoTa.setColumns(20);
        tfMoTa.setLineWrap(true);
        tfMoTa.setRows(5);
        tfMoTa.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tfMoTa);

        sanPhamAddBackground1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 463, 299, 96));

        button1.setBackground(new java.awt.Color(246, 158, 24));
        button1.setText("Hủy");
        button1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        sanPhamAddBackground1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 110, 40));

        button2.setBackground(new java.awt.Color(246, 158, 24));
        button2.setText("Xác Nhận");
        button2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        sanPhamAddBackground1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 100, 40));

        imagePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel2Layout.setVerticalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sanPhamAddBackground1.add(imagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 100));
        sanPhamAddBackground1.add(cbLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 130, 30));

        sanPhamAddBackground1.add(cbNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamAddBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamAddBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked

        String maSanPham = tfMaSanPham.getText();
        int maNhaCC = cbNCC.getSelectedIndex()+1;
        String tenSanPham =tfSanPham.getText();
        int loai = cbLoai.getSelectedMaLoai();
        String gia = tfGia.getText();
        String moTa =tfMoTa.getText();
        if(!spVali.AllValidate(gia,tenSanPham,moTa,url)) {
            JOptionPane.showMessageDialog(this, "The voucher already exists or illegal");
        }
        else {
              spData.AddSanPham(gia, tenSanPham, maNhaCC, loai, moTa,url);
              JOptionPane.showMessageDialog(this, "Success");
              tfMaSanPham.setText(String.valueOf(sanphamBUS.getNewest().getMaSP()+1));
              setNullText();
              }
    }//GEN-LAST:event_button2MouseClicked

    private void imagePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel2MouseClicked
       JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("anh", "jpg","png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chon file");
        if(x == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
           
           String[] parts = file.getName().split("\\.");
            url = parts[0];
            imagePanel2.setImagePathSanPham(file.getAbsolutePath());
            imagePanel2.setBackground(Color.decode("#F69E18"));
        }
    }//GEN-LAST:event_imagePanel2MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_button1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button1;
    private GUI.SaleGroup.LoginGui.Component.Button button2;
    private GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox cbLoai;
    private javax.swing.JComboBox<String> cbNCC;
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground sanPhamAddBackground1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape1;
    private javax.swing.JTextField tfGia;
    private javax.swing.JTextField tfMaSanPham;
    private javax.swing.JTextArea tfMoTa;
    private javax.swing.JTextField tfSanPham;
    // End of variables declaration//GEN-END:variables
}
