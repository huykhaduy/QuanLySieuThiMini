/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ManageItem.ManagerPanel;

import BUS.BusAccessor.LoaiSanPhamBUS;
import BUS.BusAccessor.SanPhamBUS;
import DAL.DataModels.LoaiSanPham;
import DAL.DataModels.SanPham;
import GUI.ManageGroup.ComponentPanel.ProductDetailPanel;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.SanPhamAdd;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;


public class SanPhamPanel extends javax.swing.JPanel {
      SanPhamBUS spBUS =new SanPhamBUS();
        SanPham sp = new SanPham();
         LoaiSanPhamBUS maloaiBUS = new LoaiSanPhamBUS();
       DefaultTableModel tableModel;
     

    /**
     * Creates new form SanPhamPanel
     */
    public SanPhamPanel() {
        initComponents();
        loadTable();
        LoadComboBox();
       
        
    }
    // Tạo Item Combobox
    public void LoadComboBox(){
         List <LoaiSanPham> iSP =maloaiBUS.getAll();
         jComboBox1.addItem("None");
        for(int i=0;i< iSP.size()-1;i++){
        jComboBox1.addItem(GetLoai(iSP.get(i).getMaLoai()));
        }
       
    }
    // Search Text Field
    public void FilterTF (String a){
        tableModel=(DefaultTableModel) jTable1.getModel();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tableRowSorter);
        int index =  jComboBox2.getSelectedIndex();
        tableRowSorter.setRowFilter(RowFilter.regexFilter(a,index));
    }     
   // Search Combobox
    public void FilterComboBox (String a){
      
        tableModel=(DefaultTableModel) jTable1.getModel();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tableRowSorter);
        if(a != "None"){
           tableRowSorter.setRowFilter(RowFilter.regexFilter(a,4));
        }
        else {
            jTable1.setRowSorter(tableRowSorter);
        }  
    } 
    // Get tên loại
    public String GetLoai(int maloai){
       
        return  maloaiBUS.get(maloai).getTenLoai();
    }
    // Load Table
    public void loadTable(){
         tableModel =(DefaultTableModel) jTable1.getModel();
        List<SanPham> sp=  spBUS.getAll();
        for( int i = 0 ; i < sp.size();i++)
        {
         Object[] sanpham ={sp.get(i).getMaSP(),sp.get(i).getTenSP(),sp.get(i).getSoLuong(),sp.get(i).getGiaTien(),GetLoai(sp.get(i).getMaLoai())};
         tableModel.addRow(sanpham);
        }
     
        TableColumn column = null;
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            column = jTable1.getColumnModel().getColumn(i);
            switch (i) {
                case 0 -> column.setPreferredWidth(30);
                case 1 -> column.setPreferredWidth(50);
                case 2 -> column.setPreferredWidth(50);
                case 3 -> column.setPreferredWidth(50);
                default -> {
                }
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel81 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        button8 = new GUI.SaleGroup.LoginGui.Component.Button();
        button5 = new GUI.SaleGroup.LoginGui.Component.Button();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        button6 = new GUI.SaleGroup.LoginGui.Component.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        productDetailPanel1 = new GUI.ManageGroup.ComponentPanel.ProductDetailPanel();
        jTextField1 = new javax.swing.JTextField();
        button2 = new GUI.SaleGroup.LoginGui.Component.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(42, 148, 208));
        jLabel81.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 50));

        jPanel6.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 30));

        button8.setBackground(new java.awt.Color(118, 199, 150));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("NHẬP EXCEL");
        button8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        button5.setBackground(new java.awt.Color(118, 199, 150));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("XUẤT EXCEL");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(42, 148, 208));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel47.setText("Thông tin chi tiết");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(42, 148, 208));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/list-icon.png"))); // NOI18N
        jLabel48.setText("Danh sách sản phẩm");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        button6.setBackground(new java.awt.Color(118, 199, 150));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("+THÊM SẢN PHẨM");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });
        add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 30));

        jTable1.setBackground(new java.awt.Color(119, 176, 210));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lương", "Đơn giá", "Loại sản phẩm", "Đã bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 270));
        add(productDetailPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 950, -1));

        jTextField1.setText("SREACH HERE!");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 240, 30));

        button2.setBackground(new java.awt.Color(118, 199, 150));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("LOAD TABLE");
        button2.setContentAreaFilled(false);
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, 30));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Tên sản phẩm", " " }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 140, 30));
    }// </editor-fold>//GEN-END:initComponents
// Click Table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        tableModel = (DefaultTableModel) jTable1.getModel();
        int maSP= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0)+"");
        sp =  spBUS.get(maSP);
        System.out.println(sp.toString());
        productDetailPanel1.setSanpham(sp);
     
    }//GEN-LAST:event_jTable1MouseClicked
// Turn on Frame Add
    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
       SanPhamAdd spAdd = new SanPhamAdd();
       spAdd.setVisible(true);
       spAdd.setLocationRelativeTo(this);
    }//GEN-LAST:event_button6MouseClicked

// Load Again Table
    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        tableModel =(DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        List<SanPham> sp=  spBUS.getAll();
        for( int i = 0 ; i < sp.size();i++)
        {
         Object[] sanpham ={sp.get(i).getMaSP(),sp.get(i).getTenSP(),sp.get(i).getSoLuong(),sp.get(i).getGiaTien(),GetLoai(sp.get(i).getMaLoai())};
         tableModel.addRow(sanpham);
        }
        jTable1.setModel(tableModel);
        TableColumn column = null;
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            column = jTable1.getColumnModel().getColumn(i);
            switch (i) {
                case 0 -> column.setPreferredWidth(30);
                case 1 -> column.setPreferredWidth(50);
                case 2 -> column.setPreferredWidth(50);
                case 3 -> column.setPreferredWidth(50);
                default -> {
                }
            }
        }

    }//GEN-LAST:event_button2MouseClicked
// Search Combobox
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String a = jComboBox1.getSelectedItem().toString();
        FilterComboBox(a);
    
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String a = jTextField1.getText();
        FilterTF(a);
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button2;
    private GUI.SaleGroup.LoginGui.Component.Button button5;
    private GUI.SaleGroup.LoginGui.Component.Button button6;
    private GUI.SaleGroup.LoginGui.Component.Button button8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private GUI.ManageGroup.ComponentPanel.ProductDetailPanel productDetailPanel1;
    // End of variables declaration//GEN-END:variables
}
