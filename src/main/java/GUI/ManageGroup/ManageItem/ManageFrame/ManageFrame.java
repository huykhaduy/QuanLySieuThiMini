
package GUI.ManageGroup.ManageItem.ManageFrame;

import BUS.AccountServices.LoginAction;
import BUS.AccountServices.LogoutAction;
import GUI.ManageGroup.Theme.ManagerTheme;

import javax.swing.ImageIcon;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;

public class ManageFrame extends javax.swing.JFrame {
     public static int maNV;
     private LoginAction logAct;
     private LoginGui loginGui;

    public ManageFrame(LoginAction logAct, LoginGui loginGui) {
        this.loginGui = loginGui;
        this.logAct = logAct;
        ManagerTheme.setup();
        initComponents();
        customsizeTabbedPane();
        init();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public LoginAction getLogAct() {
        return logAct;
    }

    public void setLogAct(LoginAction logAct) {
        this.logAct = logAct;
    }
    
    
    
    private void customsizeTabbedPane(){
        TabbedPane.setIconAt(1, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/product-icon.png")));
        TabbedPane.setIconAt(2, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/employee-icon.png")));
        TabbedPane.setIconAt(3, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/order-icon.png")));
        TabbedPane.setIconAt(4, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/nhapxuat-icon.png")));
        TabbedPane.setIconAt(5, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/discount-icon.png")));
        TabbedPane.setIconAt(6, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/report-icon.png")));
        TabbedPane.setIconAt(8, new ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/signout-icon.png")));
        TabbedPane.setEnabledAt(0, false);
        TabbedPane.setEnabledAt(7, false);
        Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TabbedPane.setSelectedIndex(1);
             }
        });
        timer.setRepeats(false);
        timer.start();

        
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
        thongKePanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.ThongKePanel();
        shape1 = new GUI.ManageGroup.BackgroundShape.Shape();
        TabbedPane = new javax.swing.JTabbedPane();
        welcomPanel2 = new GUI.ManageGroup.ManageItem.ManagerPanel.WelcomPanel();
        sanPhamPanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.SanPhamPanel();
        nhanVienPanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.NhanVienPanel();
        hoaDonJPanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.HoaDonJPanel();
        nhapXuatPanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.NhapXuatPanel();
        khuyenMaiPanel1 = new GUI.ManageGroup.ManageItem.ManagerPanel.KhuyenMaiPanel();
        thongKePanel2 = new GUI.ManageGroup.ManageItem.ManagerPanel.ThongKePanel();
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
        TabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabbedPaneMouseClicked(evt);
            }
        });
        TabbedPane.addTab("<html><div id=\"title-quanly\" style=\"padding: 10 0px; text-align: center; width: 120px\"><b style=\"font-size: 13px\">Quản lý<br>MINI MART</b></div>", welcomPanel2);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Sản phẩm</div>", sanPhamPanel1);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Nhân viên</div>", nhanVienPanel1);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Hóa đơn</div>", hoaDonJPanel1);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Nhập xuất</div>", nhapXuatPanel1);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Khuyến mãi</div>", khuyenMaiPanel1);
        TabbedPane.addTab("<html><div style=\"padding: 5px 12px\">Thống kê</div>", thongKePanel2);

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

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

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
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, Short.MAX_VALUE)
                .addContainerGap())
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void TabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabbedPaneMouseClicked
        // TODO add your handling code here:
        if(TabbedPane.getSelectedIndex() == 8){
            LogoutAction.logout();
            LogoutAction.storeLogoutTime(logAct.getLoginDetail());
            this.setVisible(false);
            this.dispose();
            loginGui.setVisible(true);
        }
    }//GEN-LAST:event_TabbedPaneMouseClicked

    private void init(){
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                
                if(logAct == null) System.exit(0);
                
                if(!logAct.isRememberMe()){
                    System.out.println("No remember user!");
                    System.out.println("Login detail: " + logAct.getLoginDetail());
                    LogoutAction.storeLogoutTime(logAct.getLoginDetail());
                    System.out.println("Login detail: " + logAct.getLoginDetail());
                }
                System.exit(0);
            }
        });
    }

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
                new ManageFrame(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTabbedPane TabbedPane;
    private GUI.ManageGroup.ManageItem.ManagerPanel.HoaDonJPanel hoaDonJPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private GUI.ManageGroup.ManageItem.ManagerPanel.KhuyenMaiPanel khuyenMaiPanel1;
    private GUI.ManageGroup.ManageItem.ManagerPanel.NhanVienPanel nhanVienPanel1;
    private GUI.ManageGroup.ManageItem.ManagerPanel.NhapXuatPanel nhapXuatPanel1;
    private GUI.ManageGroup.ManageItem.ManagerPanel.SanPhamPanel sanPhamPanel1;
    private GUI.ManageGroup.BackgroundShape.Shape shape1;
    private GUI.ManageGroup.ComponentPanel.Table table1;
    private GUI.ManageGroup.ComponentPanel.Table table2;
    private GUI.ManageGroup.ComponentPanel.Table table3;
    private GUI.ManageGroup.ComponentPanel.Table table4;
    private GUI.ManageGroup.ComponentPanel.Table table5;
    private GUI.ManageGroup.ManageItem.ManagerPanel.ThongKePanel thongKePanel1;
    private GUI.ManageGroup.ManageItem.ManagerPanel.ThongKePanel thongKePanel2;
    private GUI.ManageGroup.ManageItem.ManagerPanel.WelcomPanel welcomPanel2;
    // End of variables declaration//GEN-END:variables
}
