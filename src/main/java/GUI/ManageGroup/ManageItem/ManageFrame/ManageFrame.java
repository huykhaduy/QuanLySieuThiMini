
package GUI.ManageGroup.ManageItem.ManageFrame;

import GUI.ManageGroup.Theme.ManagerTheme;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ManageFrame extends javax.swing.JFrame {


    public ManageFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        customsizeTabbedPane();
        
    }
    
    private void customsizeTabbedPane(){
        TabbedPane.setIconAt(1, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/product-icon.png")));
        TabbedPane.setIconAt(2, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/discount-icon.png")));
        TabbedPane.setIconAt(3, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/nhapxuat-icon.png")));
        TabbedPane.setIconAt(4, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/employee-icon.png")));
        TabbedPane.setIconAt(5, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/order-icon.png")));
        TabbedPane.setIconAt(6, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/report-icon.png")));
        TabbedPane.setIconAt(8, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/signout-icon.png")));
        TabbedPane.setEnabledAt(0, false);
        TabbedPane.setEnabledAt(7, false);
        TabbedPane.setSelectedIndex(1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new GUI.ManageGroup.ComponentPanel.Table();
        table2 = new GUI.ManageGroup.ComponentPanel.Table();
        table3 = new GUI.ManageGroup.ComponentPanel.Table();
        table4 = new GUI.ManageGroup.ComponentPanel.Table();
        table5 = new GUI.ManageGroup.ComponentPanel.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        shape1 = new GUI.ManageGroup.BackgroundShape.Shape();
        TabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        DiscountPanel = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelAdd3 = new GUI.ManageGroup.ComponentPanel.PanelAdd();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        shape6 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape7 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape8 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel18 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        button5 = new GUI.SaleGroup.LoginGui.Component.Button();
        button6 = new GUI.SaleGroup.LoginGui.Component.Button();
        button7 = new GUI.SaleGroup.LoginGui.Component.Button();
        button8 = new GUI.SaleGroup.LoginGui.Component.Button();
        ProductPanel = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        shape4 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape2 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape5 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shape32 = new GUI.ManageGroup.BackgroundShape.Shape();
        button1 = new GUI.SaleGroup.LoginGui.Component.Button();
        button2 = new GUI.SaleGroup.LoginGui.Component.Button();
        button3 = new GUI.SaleGroup.LoginGui.Component.Button();
        button4 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape9 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        shape31 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape33 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        shape34 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        button9 = new GUI.SaleGroup.LoginGui.Component.Button();
        AddRemoveProduct = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        shape14 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape15 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape16 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel107 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        shape35 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel99 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        button15 = new GUI.SaleGroup.LoginGui.Component.Button();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        shape18 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape19 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape44 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        shape20 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        shape28 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape29 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        shape30 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        shape21 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape22 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        shape23 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        shape24 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape25 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape26 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        shape17 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel102 = new javax.swing.JLabel();
        button17 = new GUI.SaleGroup.LoginGui.Component.Button();
        EmployeePanel = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        shape10 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape11 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape12 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        shape27 = new GUI.ManageGroup.BackgroundShape.Shape();
        button10 = new GUI.SaleGroup.LoginGui.Component.Button();
        button11 = new GUI.SaleGroup.LoginGui.Component.Button();
        button12 = new GUI.SaleGroup.LoginGui.Component.Button();
        button13 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape13 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        shape3 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel91 = new javax.swing.JLabel();
        OrderPanel = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        shape36 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape37 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        shape38 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        shape39 = new GUI.ManageGroup.BackgroundShape.Shape();
        button14 = new GUI.SaleGroup.LoginGui.Component.Button();
        button18 = new GUI.SaleGroup.LoginGui.Component.Button();
        button19 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape40 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel3 = new javax.swing.JLabel();
        shape42 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel90 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ReportPanel = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        button20 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape41 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape43 = new GUI.ManageGroup.BackgroundShape.Shape();
        jPanel7 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Itim", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Quản lý sản phẩm");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Thêm khuyến mãi");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shape1.setBackground(new java.awt.Color(42, 148, 208));
        shape1.setRadi(0);

        TabbedPane.setBackground(new java.awt.Color(42, 148, 208));
        TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TabbedPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        TabbedPane.addTab("<html><div id=\"title-quanly\" style=\"padding: 10 0px; text-align: center; width: 120px\"><b style=\"font-size: 13px\">Quản lý<br>MINI MART</b></div>", jPanel1);

        DiscountPanel.setBackground(new java.awt.Color(255, 255, 255));
        DiscountPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DiscountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(42, 148, 208));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel47.setText("Thông tin chi tiết");
        DiscountPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1020, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(42, 148, 208));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Danh sách sản phẩm");
        DiscountPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, 30));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        DiscountPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 30));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(42, 148, 208));
        jLabel81.setText("QUẢN LÝ SẢN PHẨM");
        DiscountPanel.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

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

        DiscountPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        panelAdd3.setForeground(new java.awt.Color(255, 255, 255));
        panelAdd3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CocaCoLa");
        panelAdd3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 750, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Mô tả :");
        panelAdd3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 50, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Giá tiền :");
        panelAdd3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        panelAdd3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Mã loại :");
        panelAdd3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Nhà cung cấp :");
        panelAdd3.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jTextPane1);

        panelAdd3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 240, 70));

        DiscountPanel.add(panelAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 950, 240));

        shape6.setBackground(new java.awt.Color(119, 176, 210));

        shape7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape8.setBackground(new java.awt.Color(119, 176, 210));
        shape8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MÃ SẢN PHẨM");
        shape8.add(jLabel18);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("TÊN SẢN PHẨM");
        shape8.add(jLabel32);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ĐƠN GIÁ");
        shape8.add(jLabel33);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("SỐ LƯỢNG");
        shape8.add(jLabel34);

        javax.swing.GroupLayout shape6Layout = new javax.swing.GroupLayout(shape6);
        shape6.setLayout(shape6Layout);
        shape6Layout.setHorizontalGroup(
            shape6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(shape7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(shape8, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        shape6Layout.setVerticalGroup(
            shape6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape6Layout.createSequentialGroup()
                .addComponent(shape7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shape8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 240, Short.MAX_VALUE))
        );

        DiscountPanel.add(shape6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 950, 280));

        button5.setBackground(new java.awt.Color(118, 199, 150));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("XUẤT EXCEL");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiscountPanel.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        button6.setBackground(new java.awt.Color(118, 199, 150));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("+THÊM SẢN PHẨM");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiscountPanel.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 150, 30));

        button7.setBackground(new java.awt.Color(118, 199, 150));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("SEARCH");
        button7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiscountPanel.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 90, 30));

        button8.setBackground(new java.awt.Color(118, 199, 150));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("NHẬP EXCEL");
        button8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiscountPanel.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Sản phẩm</div>", DiscountPanel);

        ProductPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(42, 148, 208));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel45.setText("Thông tin chi tiết");
        ProductPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1020, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(42, 148, 208));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Danh sách khuyến mãi");
        ProductPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 210, 60));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        ProductPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 330, 30));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(42, 148, 208));
        jLabel80.setText("QUẢN LÝ KHUYẾN MÃI");
        ProductPanel.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel4.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ProductPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        shape4.setBackground(new java.awt.Color(119, 176, 210));
        shape4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        shape4.add(shape2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        shape5.setBackground(new java.awt.Color(119, 176, 210));
        shape5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MÃ VOUCHER");
        shape5.add(jLabel7);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SỐ VOUCHER");
        shape5.add(jLabel8);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("% GIẢM");
        shape5.add(jLabel12);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SỐ LƯỢNG");
        shape5.add(jLabel10);

        shape4.add(shape5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 447, 34));

        shape32.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape32Layout = new javax.swing.GroupLayout(shape32);
        shape32.setLayout(shape32Layout);
        shape32Layout.setHorizontalGroup(
            shape32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape32Layout.setVerticalGroup(
            shape32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        shape4.add(shape32, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, 447, 34));

        ProductPanel.add(shape4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 460, 280));

        button1.setBackground(new java.awt.Color(118, 199, 150));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("XUẤT EXCEL");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProductPanel.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        button2.setBackground(new java.awt.Color(118, 199, 150));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("+THÊM KHUYẾN MÃI");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProductPanel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 160, 30));

        button3.setBackground(new java.awt.Color(118, 199, 150));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("SEARCH");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProductPanel.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 90, 30));

        button4.setBackground(new java.awt.Color(118, 199, 150));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("NHẬP EXCEL");
        button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProductPanel.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        shape9.setBackground(new java.awt.Color(119, 176, 210));
        shape9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("MÃ VOUCHER");
        shape9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Số voucher");
        shape9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ngày bắt đầu :");
        shape9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Ngày kết thúc :");
        shape9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 120, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Giá trị tối thiểu :");
        shape9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 120, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Khuyến mãi tối thiểu :");
        shape9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 160, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape9.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 122, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Khuyến mãi tối đa :");
        shape9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 140, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("% Giảm :");
        shape9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 70, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Số lần sử dụng :");
        shape9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 110, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Mô tả");
        shape9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        shape9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 3));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        shape9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, -1));

        ProductPanel.add(shape9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 960, 240));

        shape31.setBackground(new java.awt.Color(119, 176, 210));
        shape31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape33.setBackground(new java.awt.Color(119, 176, 210));
        shape33.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MÃ SẢN PHẨM");
        shape33.add(jLabel14);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("TÊN SẢN PHẨM");
        shape33.add(jLabel30);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("% GIẢM");
        shape33.add(jLabel31);

        shape31.add(shape33, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 447, 44));

        shape34.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape34Layout = new javax.swing.GroupLayout(shape34);
        shape34.setLayout(shape34Layout);
        shape34Layout.setHorizontalGroup(
            shape34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape34Layout.setVerticalGroup(
            shape34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        shape31.add(shape34, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 62, 447, 34));

        ProductPanel.add(shape31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 460, 280));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 148, 208));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Danh sách sản phẩm giảm giá");
        ProductPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 360, 270, 60));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        ProductPanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 330, 30));

        button9.setBackground(new java.awt.Color(118, 199, 150));
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("SEARCH");
        button9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProductPanel.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 90, 30));

        TabbedPane.addTab("<html><div style=\"padding: 5px 8px\">Khuyến mãi</div>", ProductPanel);

        AddRemoveProduct.setBackground(new java.awt.Color(255, 255, 255));
        AddRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        AddRemoveProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(42, 148, 208));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel101.setText("Thông tin chi tiết");
        AddRemoveProduct.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 460, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(42, 148, 208));
        jLabel103.setText("QUẢN LÝ PHIẾU XUẤT");
        AddRemoveProduct.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 50));

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

        AddRemoveProduct.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        shape14.setBackground(new java.awt.Color(119, 176, 210));
        shape14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        shape14.add(shape15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        shape16.setBackground(new java.awt.Color(119, 176, 210));
        shape16.setLayout(new java.awt.GridLayout(1, 0));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("MÃ NHÂN VIÊN");
        shape16.add(jLabel107);

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("MÃ PHIẾU");
        shape16.add(jLabel105);

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("NGÀY LẬP");
        shape16.add(jLabel106);

        shape14.add(shape16, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 12, 500, 34));

        shape35.setBackground(new java.awt.Color(255, 255, 255));
        shape35.setLayout(new java.awt.GridLayout());

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("3120560051");
        shape35.add(jLabel99);

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("111");
        shape35.add(jLabel123);

        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("12/12/2003");
        shape35.add(jLabel124);

        shape14.add(shape35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 43));

        AddRemoveProduct.add(shape14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 510, 310));

        button15.setBackground(new java.awt.Color(118, 199, 150));
        button15.setForeground(new java.awt.Color(255, 255, 255));
        button15.setText("+TẠO PHIẾU XUẤT");
        button15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddRemoveProduct.add(button15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 150, 30));

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

        AddRemoveProduct.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

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

        AddRemoveProduct.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 10, 30));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(42, 148, 208));
        jLabel120.setText("QUẢN LÝ PHIẾU NHẬP");
        AddRemoveProduct.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 50));

        shape18.setBackground(new java.awt.Color(110, 163, 210));
        shape18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape19.setBackground(new java.awt.Color(255, 255, 255));

        shape44.setBackground(new java.awt.Color(110, 163, 210));
        shape44.setLayout(new java.awt.GridLayout());

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("0001");
        shape44.add(jLabel125);

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Cocacola");
        shape44.add(jLabel126);

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("4");
        shape44.add(jLabel127);

        javax.swing.GroupLayout shape19Layout = new javax.swing.GroupLayout(shape19);
        shape19.setLayout(shape19Layout);
        shape19Layout.setHorizontalGroup(
            shape19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shape44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        shape19Layout.setVerticalGroup(
            shape19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shape44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        shape18.add(shape19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 448, 160));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ngày lập");
        shape18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mã nhân viên");
        shape18.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mã phiếu");
        shape18.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        shape20.setBackground(new java.awt.Color(110, 163, 210));
        shape20.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mã sản phẩm");
        shape20.add(jLabel13);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tên sản phẩm");
        shape20.add(jLabel15);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Số lượng");
        shape20.add(jLabel17);

        shape18.add(shape20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, 30));

        shape28.setBackground(new java.awt.Color(126, 186, 239));
        shape28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape29.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape29Layout = new javax.swing.GroupLayout(shape29);
        shape29.setLayout(shape29Layout);
        shape29Layout.setHorizontalGroup(
            shape29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape29Layout.setVerticalGroup(
            shape29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape28.add(shape29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 448, 160));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Ngày lập");
        shape28.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Mã nhân viên");
        shape28.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Mã phiếu");
        shape28.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        shape30.setBackground(new java.awt.Color(126, 186, 239));
        shape30.setLayout(new java.awt.GridLayout(1, 0));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Mã sản phẩm");
        shape30.add(jLabel27);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tên sản phẩm");
        shape30.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Số lượng");
        shape30.add(jLabel29);

        shape28.add(shape30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, 30));

        shape18.add(shape28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 460, 310));

        AddRemoveProduct.add(shape18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 460, 310));

        shape21.setBackground(new java.awt.Color(110, 163, 210));
        shape21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape22Layout = new javax.swing.GroupLayout(shape22);
        shape22.setLayout(shape22Layout);
        shape22Layout.setHorizontalGroup(
            shape22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape22Layout.setVerticalGroup(
            shape22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape21.add(shape22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 448, 160));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ngày lập");
        shape21.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mã nhân viên");
        shape21.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Mã phiếu");
        shape21.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        shape23.setBackground(new java.awt.Color(110, 163, 210));
        shape23.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Mã sản phẩm");
        shape23.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Tên sản phẩm");
        shape23.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Số lượng");
        shape23.add(jLabel22);

        shape21.add(shape23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, 30));

        AddRemoveProduct.add(shape21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 460, 310));

        shape24.setBackground(new java.awt.Color(119, 176, 210));
        shape24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        shape24.add(shape25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        shape26.setBackground(new java.awt.Color(119, 176, 210));
        shape26.setLayout(new java.awt.GridLayout(1, 0));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("MÃ NHÂN VIÊN");
        shape26.add(jLabel110);

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("MÃ PHIẾU");
        shape26.add(jLabel111);

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("NGÀY LẬP");
        shape26.add(jLabel112);

        shape24.add(shape26, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 12, 500, 34));

        shape17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape17Layout = new javax.swing.GroupLayout(shape17);
        shape17.setLayout(shape17Layout);
        shape17Layout.setHorizontalGroup(
            shape17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        shape17Layout.setVerticalGroup(
            shape17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        shape24.add(shape17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 43));

        AddRemoveProduct.add(shape24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 510, 310));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(42, 148, 208));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel102.setText("Thông tin chi tiết");
        AddRemoveProduct.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 460, -1));

        button17.setBackground(new java.awt.Color(118, 199, 150));
        button17.setForeground(new java.awt.Color(255, 255, 255));
        button17.setText("+TẠO PHIẾU NHẬP");
        button17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddRemoveProduct.add(button17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, 30));

        TabbedPane.addTab("<html><div style=\"padding: 5px 9px\">Nhập / xuất</div>", AddRemoveProduct);

        EmployeePanel.setBackground(new java.awt.Color(255, 255, 255));
        EmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(42, 148, 208));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel82.setText("Thông tin chi tiết");
        EmployeePanel.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1030, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(42, 148, 208));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Danh sách nhân viên");
        EmployeePanel.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, 30));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        EmployeePanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 30));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(42, 148, 208));
        jLabel84.setText("QUẢN LÝ NHÂN VIÊN");
        EmployeePanel.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel19.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        EmployeePanel.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        shape10.setBackground(new java.awt.Color(119, 176, 210));
        shape10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        shape10.add(shape11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        shape12.setBackground(new java.awt.Color(119, 176, 210));
        shape12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("MÃ NHÂN VIÊN");
        shape12.add(jLabel85);

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("TÊN NHÂN VIÊN");
        shape12.add(jLabel86);

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("SỐ ĐIỆN THOẠI");
        shape12.add(jLabel87);

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("GIỚI TÍNH");
        shape12.add(jLabel88);

        shape10.add(shape12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 950, 34));

        shape27.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape27Layout = new javax.swing.GroupLayout(shape27);
        shape27.setLayout(shape27Layout);
        shape27Layout.setHorizontalGroup(
            shape27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        shape27Layout.setVerticalGroup(
            shape27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        shape10.add(shape27, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 46, 950, 43));

        EmployeePanel.add(shape10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 280));

        button10.setBackground(new java.awt.Color(118, 199, 150));
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("XUẤT EXCEL");
        button10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeePanel.add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        button11.setBackground(new java.awt.Color(118, 199, 150));
        button11.setForeground(new java.awt.Color(255, 255, 255));
        button11.setText("+THÊM NHÂN VIÊN");
        button11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeePanel.add(button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 150, 30));

        button12.setBackground(new java.awt.Color(118, 199, 150));
        button12.setForeground(new java.awt.Color(255, 255, 255));
        button12.setText("SEARCH");
        button12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeePanel.add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 90, 30));

        button13.setBackground(new java.awt.Color(118, 199, 150));
        button13.setForeground(new java.awt.Color(255, 255, 255));
        button13.setText("NHẬP EXCEL");
        button13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeePanel.add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        shape13.setBackground(new java.awt.Color(119, 176, 210));
        shape13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Mã nhân viên");
        shape13.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 220, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Giới tính :");
        shape13.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Địa chỉ :");
        shape13.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 120, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("E-Mail :");
        shape13.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 120, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("CMND :");
        shape13.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, -1));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape13.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 122, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Ngày tham gia :");
        shape13.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 120, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Ngày sinh :");
        shape13.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 80, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("CHỨC VỤ");
        shape13.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, -1));

        jPanel23.setBackground(new java.awt.Color(119, 176, 210));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape13.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 3));

        shape3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel91.setBackground(new java.awt.Color(0, 0, 0));
        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("TÊN NHÂN VIÊN");

        javax.swing.GroupLayout shape3Layout = new javax.swing.GroupLayout(shape3);
        shape3.setLayout(shape3Layout);
        shape3Layout.setHorizontalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        shape3Layout.setVerticalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel91)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shape13.add(shape3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 200));

        EmployeePanel.add(shape13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 960, 240));

        TabbedPane.addTab("<html><div style=\"padding: 5px 11px\">Nhân viên</div>", EmployeePanel);

        OrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        OrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        OrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(42, 148, 208));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel104.setText("Thông tin chi tiết");
        OrderPanel.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1030, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(42, 148, 208));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Danh sách hóa đơn");
        OrderPanel.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 300, 30));

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        OrderPanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 30));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(42, 148, 208));
        jLabel109.setText("QUẢN LÝ HÓA ĐƠN");
        OrderPanel.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel21.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        OrderPanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        shape36.setBackground(new java.awt.Color(126, 187, 222));
        shape36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        shape36.add(shape37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        shape38.setBackground(new java.awt.Color(126, 187, 222));
        shape38.setLayout(new java.awt.GridLayout(1, 0));

        jLabel113.setBackground(new java.awt.Color(255, 255, 255));
        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("MÃ NHÂN VIÊN");
        shape38.add(jLabel113);

        jLabel114.setBackground(new java.awt.Color(255, 255, 255));
        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("MÃ KHÁCH HÀNG");
        shape38.add(jLabel114);

        jLabel115.setBackground(new java.awt.Color(255, 255, 255));
        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("MÃ HÓA ĐƠN");
        shape38.add(jLabel115);

        jLabel116.setBackground(new java.awt.Color(255, 255, 255));
        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("NGÀY HÓA ĐƠN");
        shape38.add(jLabel116);

        shape36.add(shape38, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 950, 34));

        shape39.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout shape39Layout = new javax.swing.GroupLayout(shape39);
        shape39.setLayout(shape39Layout);
        shape39Layout.setHorizontalGroup(
            shape39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        shape39Layout.setVerticalGroup(
            shape39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        shape36.add(shape39, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 46, 950, 43));

        OrderPanel.add(shape36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 290));

        button14.setBackground(new java.awt.Color(118, 199, 150));
        button14.setForeground(new java.awt.Color(255, 255, 255));
        button14.setText("XUẤT EXCEL");
        button14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OrderPanel.add(button14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        button18.setBackground(new java.awt.Color(118, 199, 150));
        button18.setForeground(new java.awt.Color(255, 255, 255));
        button18.setText("SEARCH");
        button18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OrderPanel.add(button18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 90, 30));

        button19.setBackground(new java.awt.Color(118, 199, 150));
        button19.setForeground(new java.awt.Color(255, 255, 255));
        button19.setText("NHẬP EXCEL");
        button19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OrderPanel.add(button19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        shape40.setBackground(new java.awt.Color(119, 176, 210));
        shape40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHI TIẾT HÓA ĐƠN");
        shape40.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        shape42.setBackground(new java.awt.Color(255, 255, 255));
        shape42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setBackground(new java.awt.Color(0, 0, 0));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("GIÁ TRỊ HÓA ĐƠN");
        shape42.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 6, -1, 27));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("Giá trị đơn hàng :");
        shape42.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 45, -1, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setText("Số tiền giảm :");
        shape42.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("TỔNG :");
        shape42.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 0));
        jLabel121.setText("Tổng số lượng :");
        shape42.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("jLabel4");
        shape42.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        shape40.add(shape42, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 290, 230));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        shape40.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 200));

        OrderPanel.add(shape40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 960, 240));

        TabbedPane.addTab("<html><div style=\"padding: 5px 14px\">Hóa đơn</div>", OrderPanel);

        ReportPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(119, 176, 210));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(43, 133, 161));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jLabel57.setBackground(new java.awt.Color(119, 176, 210));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("NHÂN VIÊN");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("NHÂN VIÊN MỚI");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("jLabel60");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("TỔNG NHÂN VIÊN");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("jLabel62");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel61)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ReportPanel.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 136, -1, -1));

        jPanel34.setBackground(new java.awt.Color(119, 176, 210));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jPanel32.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("HÓA ĐƠN");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Tổng số lượng hóa đơn");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Số lượng hóa đơn tháng");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("jLabel65");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("jLabel66");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ReportPanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 156, -1, -1));

        jPanel28.setBackground(new java.awt.Color(119, 176, 210));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jPanel35.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jLabel55.setBackground(new java.awt.Color(153, 153, 153));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Doanh Thu Tháng");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("DOANH THU THÁNG");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("jLabel68");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("SẢN PHẨM BÁN ĐƯỢC");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("jLabel70");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("TỔNG DOANH THU NĂM");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("jLabel72");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel55)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ReportPanel.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 185, -1, -1));

        jPanel36.setBackground(new java.awt.Color(119, 176, 210));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jPanel39.setBackground(new java.awt.Color(255, 255, 0));
        jPanel39.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Khuyến mãi");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText(" SỐ LƯỢNG KHUYẾN MÃI");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("jLabel74");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("CÒN HIỆU LỰC");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("jLabel76");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("TỔNG KHUYẾN MÃI NĂM");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("jLabel78");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ReportPanel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 209, 265, -1));

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(42, 148, 208));
        jLabel122.setText("THỐNG KÊ");
        ReportPanel.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel24.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ReportPanel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        button20.setBackground(new java.awt.Color(118, 199, 150));
        button20.setForeground(new java.awt.Color(255, 255, 255));
        button20.setText("XUẤT EXCEL");
        button20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReportPanel.add(button20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 30));

        javax.swing.GroupLayout shape41Layout = new javax.swing.GroupLayout(shape41);
        shape41.setLayout(shape41Layout);
        shape41Layout.setHorizontalGroup(
            shape41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape41Layout.setVerticalGroup(
            shape41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ReportPanel.add(shape41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        javax.swing.GroupLayout shape43Layout = new javax.swing.GroupLayout(shape43);
        shape43.setLayout(shape43Layout);
        shape43Layout.setHorizontalGroup(
            shape43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shape43Layout.setVerticalGroup(
            shape43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ReportPanel.add(shape43, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ReportPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ReportPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Tháng :");
        ReportPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(-63, 0, -1, 40));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Tháng :");
        ReportPanel.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Thống kê</div>", ReportPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        TabbedPane.addTab("<html><div style=\"height:200px\"></div>", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        TabbedPane.addTab("<html><div style=\"padding: 5px 11px\">Đăng xuất</div>", jPanel3);

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane))
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed


    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
        ManagerTheme.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddRemoveProduct;
    private javax.swing.JPanel DiscountPanel;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JPanel ProductPanel;
    private javax.swing.JPanel ReportPanel;
    javax.swing.JTabbedPane TabbedPane;
    private GUI.SaleGroup.LoginGui.Component.Button button1;
    private GUI.SaleGroup.LoginGui.Component.Button button10;
    private GUI.SaleGroup.LoginGui.Component.Button button11;
    private GUI.SaleGroup.LoginGui.Component.Button button12;
    private GUI.SaleGroup.LoginGui.Component.Button button13;
    private GUI.SaleGroup.LoginGui.Component.Button button14;
    private GUI.SaleGroup.LoginGui.Component.Button button15;
    private GUI.SaleGroup.LoginGui.Component.Button button17;
    private GUI.SaleGroup.LoginGui.Component.Button button18;
    private GUI.SaleGroup.LoginGui.Component.Button button19;
    private GUI.SaleGroup.LoginGui.Component.Button button2;
    private GUI.SaleGroup.LoginGui.Component.Button button20;
    private GUI.SaleGroup.LoginGui.Component.Button button3;
    private GUI.SaleGroup.LoginGui.Component.Button button4;
    private GUI.SaleGroup.LoginGui.Component.Button button5;
    private GUI.SaleGroup.LoginGui.Component.Button button6;
    private GUI.SaleGroup.LoginGui.Component.Button button7;
    private GUI.SaleGroup.LoginGui.Component.Button button8;
    private GUI.SaleGroup.LoginGui.Component.Button button9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private GUI.ManageGroup.ComponentPanel.PanelAdd panelAdd3;
    private GUI.ManageGroup.BackgroundShape.Shape shape1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape10;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape11;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape12;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape13;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape14;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape15;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape16;
    private GUI.ManageGroup.BackgroundShape.Shape shape17;
    private GUI.ManageGroup.BackgroundShape.Shape shape18;
    private GUI.ManageGroup.BackgroundShape.Shape shape19;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape2;
    private GUI.ManageGroup.BackgroundShape.Shape shape20;
    private GUI.ManageGroup.BackgroundShape.Shape shape21;
    private GUI.ManageGroup.BackgroundShape.Shape shape22;
    private GUI.ManageGroup.BackgroundShape.Shape shape23;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape24;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape25;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape26;
    private GUI.ManageGroup.BackgroundShape.Shape shape27;
    private GUI.ManageGroup.BackgroundShape.Shape shape28;
    private GUI.ManageGroup.BackgroundShape.Shape shape29;
    private GUI.ManageGroup.BackgroundShape.Shape shape3;
    private GUI.ManageGroup.BackgroundShape.Shape shape30;
    private GUI.ManageGroup.BackgroundShape.Shape shape31;
    private GUI.ManageGroup.BackgroundShape.Shape shape32;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape33;
    private GUI.ManageGroup.BackgroundShape.Shape shape34;
    private GUI.ManageGroup.BackgroundShape.Shape shape35;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape36;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape37;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape38;
    private GUI.ManageGroup.BackgroundShape.Shape shape39;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape4;
    private GUI.ManageGroup.BackgroundShape.Shape shape40;
    private GUI.ManageGroup.BackgroundShape.Shape shape41;
    private GUI.ManageGroup.BackgroundShape.Shape shape42;
    private GUI.ManageGroup.BackgroundShape.Shape shape43;
    private GUI.ManageGroup.BackgroundShape.Shape shape44;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape5;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape6;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape7;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape8;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape9;
    private GUI.ManageGroup.ComponentPanel.Table table1;
    private GUI.ManageGroup.ComponentPanel.Table table2;
    private GUI.ManageGroup.ComponentPanel.Table table3;
    private GUI.ManageGroup.ComponentPanel.Table table4;
    private GUI.ManageGroup.ComponentPanel.Table table5;
    // End of variables declaration//GEN-END:variables
}
