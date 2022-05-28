/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ManageItem.ManagerPanel;

import BUS.BusAccessor.NhanVienBUS;
import BUS.BusAccessor.PhieuHuyBUS;
import BUS.BusAccessor.PhieuNhapBUS;
import DTO.PhieuHuy;
import DTO.PhieuNhap;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.HuyHangSanPham;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.NhapHangSanPham;
import GUI.ManageGroup.ManageItem.ManageFrame.ManageFrame;
import GUI.ManageGroup.Theme.NhapHuyPanel;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ACER
 */
public class NhapXuatPanel extends javax.swing.JPanel {
    private final PhieuNhapBUS nhapBus;
    private final NhanVienBUS nvBus;
    private final PhieuHuyBUS huyBus;
    private final DefaultTableModel nhapModel;
    private final DefaultTableModel huyModel;
    public static int maNhanVien;
    /**
     * Creates new form NhapXuatPanel
     */
    public NhapXuatPanel() {
        NhapHuyPanel.setup();
        initComponents();
        nhapModel = (DefaultTableModel) jTable1.getModel();
        huyModel = (DefaultTableModel) jTable2.getModel();
        nhapBus = new PhieuNhapBUS();
        nvBus = new NhanVienBUS();
        huyBus = new PhieuHuyBUS();
        setUpPanel();
        loadPhieuNhapFromDB();
        loadPhieuHuyFromDB();
    }

    private void setUpPanel() {
        // Thêm pop up cho table phieu nhap
        JMenuItem itemNhap1 = new JMenuItem("Xem/Sửa thông tin");
        JMenuItem itemNhap2 = new JMenuItem("Xóa phiếu nhập");
        itemNhap1.addActionListener((ActionEvent e) -> {
            int row = jTable1.getSelectedRow();
            int maPN = Integer.parseInt(nhapModel.getValueAt(row, 0) + "");
            int maNV = Integer.parseInt(nhapModel.getValueAt(row, 1) + "");
            new NhapHangSanPham(maPN, maNV, false).setVisible(true);
        });

        itemNhap2.addActionListener((ActionEvent e) -> {
            int[] rows = jTable1.getSelectedRows();
            for (int i = rows.length - 1; i >= 0; i--) {
                nhapBus.remove(Integer.parseInt(nhapModel.getValueAt(rows[i], 0)+""));
                nhapModel.removeRow(rows[i]);
            }
        });
 
        JPopupMenu nhapPopUp = new JPopupMenu();
        nhapPopUp.add(itemNhap1);
        nhapPopUp.add(itemNhap2);
        jTable1.setComponentPopupMenu(nhapPopUp);
        
        // Thêm pop up cho table phieu huy
        JMenuItem itemHuy1 = new JMenuItem("Xem/Sửa thông tin");
        JMenuItem itemHuy2 = new JMenuItem("Xóa phiếu hủy");
        itemHuy1.addActionListener((ActionEvent e) -> {
            int row = jTable2.getSelectedRow();
            int maPN = Integer.parseInt(huyModel.getValueAt(row, 0) + "");
            int maNV = Integer.parseInt(huyModel.getValueAt(row, 1) + "");
            new HuyHangSanPham(maPN, maNV, false).setVisible(true);
        });

        itemHuy2.addActionListener((ActionEvent e) -> {
            int[] rows = jTable2.getSelectedRows();
            for (int i = rows.length - 1; i >= 0; i--) {
                huyBus.remove(Integer.parseInt(huyModel.getValueAt(rows[i], 0)+""));
                huyModel.removeRow(rows[i]);
            }
        });

        JPopupMenu huyPopup = new JPopupMenu();
        huyPopup.add(itemHuy1);
        huyPopup.add(itemHuy2);
        jTable2.setComponentPopupMenu(huyPopup);
        
        
        dateChooserNhapBd = new DateChooser();
        dateChooserNhapBd.setForeground(Color.decode("#59ABE3"));
        dateChooserNhapKt = new DateChooser();
        dateChooserNhapKt.setForeground(Color.decode("#59ABE3"));
        dateChooserHuyBd = new DateChooser();
        dateChooserHuyBd.setForeground(Color.decode("#59ABE3"));
        dateChooserHuyKt = new DateChooser();
        dateChooserHuyKt.setForeground(Color.decode("#59ABE3"));
        dateChooserNhapBd.setTextRefernce(jTextField5);
        dateChooserNhapKt.setTextRefernce(jTextField17);
        dateChooserHuyBd.setTextRefernce(jTextField6);
        dateChooserHuyKt.setTextRefernce(jTextField14);
        
        TableColumn column = null;
        for (int i = 0; i < nhapModel.getColumnCount(); i++) {
            column = jTable1.getColumnModel().getColumn(i);
            switch (i) {
                case 0 -> column.setPreferredWidth(30);
                case 1 -> column.setPreferredWidth(30);
                case 2 -> column.setPreferredWidth(100);
                case 3 -> column.setPreferredWidth(100);
                default -> {
                }
            }
        }
        
        TableColumn column2 = null;
        for (int i = 0; i < huyModel.getColumnCount(); i++) {
            column2 = jTable2.getColumnModel().getColumn(i);
            switch (i) {
                case 0 -> column2.setPreferredWidth(30);
                case 1 -> column2.setPreferredWidth(30);
                case 2 -> column2.setPreferredWidth(100);
                case 3 -> column2.setPreferredWidth(100);
                default -> {
                }
            }
        }
    }
    
    private void loadPhieuNhapFromDB(){
        List<PhieuNhap> list = nhapBus.getAll();
        nhapModel.setRowCount(0);
        if (list == null || list.isEmpty()) return;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (PhieuNhap item: list){
            model.addRow(new Object[]{item.getMaPhieu(),item.getMaNV(),nvBus.get(item.getMaNV()).getTenNV(),item.getNgayLap()});
        }
    }
    
    private void loadPhieuHuyFromDB(){
        List<PhieuHuy> list = huyBus.getAll();
        huyModel.setRowCount(0);
        if (list == null || list.isEmpty()) return;
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for (PhieuHuy item: list){
            model.addRow(new Object[]{item.getMaPhieu(),item.getMaNV(),nvBus.get(item.getMaNV()).getTenNV(),item.getNgayLap()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        button15 = new GUI.SaleGroup.LoginGui.Component.Button();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        button17 = new GUI.SaleGroup.LoginGui.Component.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        roundPanel2 = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        roundPanel3 = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(42, 148, 208));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel101.setText("Thông tin phiếu hủy");
        add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 180, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(42, 148, 208));
        jLabel103.setText("QUẢN LÝ PHIẾU HỦY");
        jLabel103.setToolTipText("");
        add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 50));

        jPanel20.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 30));

        button15.setBackground(new java.awt.Color(118, 199, 150));
        button15.setForeground(new java.awt.Color(255, 255, 255));
        button15.setText("+TẠO PHIẾU HỦY");
        button15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });
        add(button15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 150, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jPanel13.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 10, 30));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(42, 148, 208));
        jLabel120.setText("QUẢN LÝ PHIẾU NHẬP");
        add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(42, 148, 208));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel102.setText("Thông tin phiếu nhập");
        add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 190, -1));

        button17.setBackground(new java.awt.Color(118, 199, 150));
        button17.setForeground(new java.awt.Color(255, 255, 255));
        button17.setText("+TẠO PHIẾU NHẬP");
        button17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });
        add(button17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 150, 30));

        jTable1.setBackground(new java.awt.Color(119, 176, 210));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Mã nhân viên", "Tên nhân viên", "Ngày lập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 490, 330));

        jTable2.setBackground(new java.awt.Color(119, 176, 210));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu xuất", "Mã nhân viên", "Tên nhân viên", "Ngày lập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 490, 320));

        roundPanel2.setBackground(new java.awt.Color(246, 247, 249));
        roundPanel2.setRadius(70);
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("jTextField1");
        roundPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 40));

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Xóa lọc kết quả");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, 40));

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Tìm kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 40));

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("LỌC PHIẾU NHẬP");
        jLabel9.setToolTipText("");
        roundPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 20));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Từ ngày:");
        roundPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Đến ngày:");
        roundPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 70, -1));
        roundPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 40));

        jLabel13.setBackground(new java.awt.Color(0, 204, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("Mã nhân viên");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        jLabel14.setBackground(new java.awt.Color(0, 204, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("Mã phiếu nhập");
        roundPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));

        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setText("jTextField1");
        roundPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 210, 40));
        roundPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 40));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, 290));

        roundPanel3.setBackground(new java.awt.Color(246, 247, 249));
        roundPanel3.setRadius(70);
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("jTextField1");
        roundPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 40));

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setText("jTextField1");
        roundPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 210, 40));
        roundPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 40));

        jButton7.setBackground(new java.awt.Color(255, 153, 153));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Xóa lọc kết quả");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        roundPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, 40));

        jButton8.setBackground(new java.awt.Color(0, 153, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Tìm kiếm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        roundPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 40));

        jLabel11.setBackground(new java.awt.Color(0, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("LỌC PHIẾU HỦY");
        jLabel11.setToolTipText("");
        roundPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 20));

        jLabel12.setBackground(new java.awt.Color(0, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("Mã nhân viên");
        roundPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Từ ngày:");
        roundPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Đến ngày:");
        roundPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 70, -1));

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Mã phiếu nhập");
        roundPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));
        roundPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 40));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 470, 290));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Tim kiem cua phieu nhap
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SelectedDate nhapStart = dateChooserNhapBd.getSelectedDate();
        SelectedDate endDate = dateChooserNhapKt.getSelectedDate();
        String bd = nhapStart.getYear() +"-"+nhapStart.getMonth()+"-"+nhapStart.getDay();
        String kt = endDate.getYear()+"-"+endDate.getMonth()+"-"+endDate.getDay();
        Timestamp bdTs = Timestamp.valueOf(bd+" 00:00:00");
        Timestamp ktTs = Timestamp.valueOf(kt+" 00:00:00");
        if (bdTs.compareTo(ktTs)>0) JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu","Thời gian lọc sai",JOptionPane.OK_OPTION);
        List<PhieuNhap> list = nhapBus.getFilter(jTextField16.getText(), jTextField18.getText(), bd, kt);
        nhapModel.setRowCount(0);
        if (list == null || list.isEmpty()) 
            return;
        for (PhieuNhap item: list){
            nhapModel.addRow(new Object[]{item.getMaPhieu(),item.getMaNV(),nvBus.get(item.getMaNV()).getTenNV(),item.getNgayLap()});
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    // Xoa loc ket qua phieu nhap
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField16.setText("");
        jTextField18.setText("");
        nhapModel.setRowCount(0);
        loadPhieuNhapFromDB();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Them phieu nhap
    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        int maPNMoiNhat = nhapBus.getNewest().getMaPhieu()+1;
        new NhapHangSanPham(maPNMoiNhat,this.maNhanVien, true).setVisible(true);
    }//GEN-LAST:event_button17ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
        int maPHMoiNhat = huyBus.getNewest().getMaPhieu()+1;
        new HuyHangSanPham(maPHMoiNhat,this.maNhanVien, true).setVisible(true);
    }//GEN-LAST:event_button15ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SelectedDate huyBd = dateChooserHuyBd.getSelectedDate();
        SelectedDate huyKt = dateChooserHuyKt.getSelectedDate();
        String bd = huyBd.getYear() +"-"+huyBd.getMonth()+"-"+huyBd.getDay();
        String kt = huyKt.getYear()+"-"+huyKt.getMonth()+"-"+huyKt.getDay();
        Timestamp bdTs = Timestamp.valueOf(bd+" 00:00:00");
        Timestamp ktTs = Timestamp.valueOf(kt+" 00:00:00");
        if (bdTs.compareTo(ktTs)>0) JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu","Thời gian lọc sai",JOptionPane.OK_OPTION);
        List<PhieuHuy> list = huyBus.getFilter(jTextField15.getText(), jTextField13.getText(), bd, kt);
        huyModel.setRowCount(0);
        if (list == null || list.isEmpty()) 
            return;
        for (PhieuHuy item: list){
            huyModel.addRow(new Object[]{item.getMaPhieu(),item.getMaNV(),nvBus.get(item.getMaNV()).getTenNV(),item.getNgayLap()});
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField15.setText("");
        jTextField13.setText("");
        huyModel.setRowCount(0);
        loadPhieuHuyFromDB();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton5ActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton7ActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button15;
    private GUI.SaleGroup.LoginGui.Component.Button button17;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel roundPanel2;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
    private DateChooser dateChooserNhapBd;
    private DateChooser dateChooserNhapKt;
    private DateChooser dateChooserHuyBd;
    private DateChooser dateChooserHuyKt;

}
