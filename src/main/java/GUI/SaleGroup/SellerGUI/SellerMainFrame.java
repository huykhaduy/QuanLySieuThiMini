package GUI.SaleGroup.SellerGUI;

import BUS.AccountServices.LoginAction;
import BUS.AccountServices.LogoutAction;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import GUI.SaleGroup.SellerGUI.BasicHandle.AddCustomerAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.ChangePaymentInfo;
import GUI.SaleGroup.SellerGUI.BasicHandle.ClearAllAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.ComboBoxLoaiSPAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.DiscountTextFieldListener;
import GUI.SaleGroup.SellerGUI.BasicHandle.PayActionListener;
import GUI.SaleGroup.SellerGUI.BasicHandle.SearchMenuListener;
import GUI.SaleGroup.SellerGUI.Component.MenuPanel;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import GUI.SaleGroup.SellerGUI.Component.SearchAndFilter;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;


public class SellerMainFrame extends javax.swing.JFrame {
    private final JLabel maNV1 = new JLabel();
    public static int maNV;
    private LoginAction logAct;
    private LoginGui loginGui;

    /**
     * Creates new form SellerMainFrame
     * @param logAct
     * @param loginGui
     */
    public SellerMainFrame(LoginAction logAct, LoginGui loginGui) {
        this.loginGui = loginGui;
        this.logAct = logAct;
        initComponents();
        init();
        this.getContentPane().setBackground(Color.decode("#189AB4"));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        addEventFilterAndSearch();
    }

    public LoginAction getLogAct() {
        return logAct;
    }

    public void setLogAct(LoginAction logAct) {
        this.logAct = logAct;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        itemContainer = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        filterPanel = new javax.swing.JPanel();
        textFieldIcon1 = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        myLoaiSPComboBox1 = new GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        mainContainer = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        spaceBottom = new javax.swing.JPanel();
        paymentPanel = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbClearAll = new javax.swing.JLabel();
        paymentInfo = new javax.swing.JPanel();
        lbTotalMoney = new javax.swing.JLabel();
        lbDiscount = new javax.swing.JLabel();
        lbMoney = new javax.swing.JLabel();
        lbTextTotal = new javax.swing.JLabel();
        lbTextDiscount = new javax.swing.JLabel();
        lbTextMoney = new javax.swing.JLabel();
        txtPhoneNumber = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        txtVoucher = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        lbVoucher = new javax.swing.JLabel();
        lbsoDt = new javax.swing.JLabel();
        btnAddCustomer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        orderContainer = new javax.swing.JPanel();
        leftPanel = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagePanel1 = new GUI.SaleGroup.SellerGUI.Component.ImagePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1083, 630));
        getContentPane().setLayout(new java.awt.BorderLayout(15, 0));

        itemContainer.setBackground(new java.awt.Color(24, 154, 180));
        itemContainer.setPreferredSize(new java.awt.Dimension(300, 300));
        itemContainer.setRadius(0);
        itemContainer.setLayout(new java.awt.BorderLayout(15, 15));

        filterPanel.setBackground(new java.awt.Color(24, 154, 180));
        filterPanel.setPreferredSize(new java.awt.Dimension(650, 55));
        filterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldIcon1.setTextHeadIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/search.png"))); // NOI18N
        textFieldIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIcon1ActionPerformed(evt);
            }
        });
        filterPanel.add(textFieldIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 14, 369, 37));
        filterPanel.add(myLoaiSPComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 121, 37));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/remove.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        filterPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 14, 40, 37));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/advanced.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        filterPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 14, 50, 37));

        itemContainer.add(filterPanel, java.awt.BorderLayout.NORTH);

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));
        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 1));
        mainContainer.setRadius(0);
        mainContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
        itemContainer.add(mainContainer, java.awt.BorderLayout.CENTER);

        spaceBottom.setPreferredSize(new java.awt.Dimension(648, 0));

        javax.swing.GroupLayout spaceBottomLayout = new javax.swing.GroupLayout(spaceBottom);
        spaceBottom.setLayout(spaceBottomLayout);
        spaceBottomLayout.setHorizontalGroup(
            spaceBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        spaceBottomLayout.setVerticalGroup(
            spaceBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        itemContainer.add(spaceBottom, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(itemContainer, java.awt.BorderLayout.CENTER);

        paymentPanel.setBackground(new java.awt.Color(43, 133, 161));
        paymentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        paymentPanel.setForeground(new java.awt.Color(51, 255, 51));
        paymentPanel.setPreferredSize(new java.awt.Dimension(293, 600));
        paymentPanel.setRadius(0);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ĐƠN HÀNG");

        lbClearAll.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbClearAll.setForeground(new java.awt.Color(255, 255, 255));
        lbClearAll.setText("XÓA HẾT");

        paymentInfo.setBackground(new java.awt.Color(43, 133, 161));

        lbTotalMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTotalMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalMoney.setText("TỔNG TIỀN:");

        lbDiscount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lbDiscount.setText("GIẢM GIÁ:");

        lbMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbMoney.setText("TIỀN PHẢI THU:");

        lbTextTotal.setBackground(new java.awt.Color(255, 255, 255));
        lbTextTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTextTotal.setText("0");

        lbTextDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lbTextDiscount.setText("0");

        lbTextMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTextMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbTextMoney.setText("0");

        lbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbVoucher.setText("MÃ VOUCHER:");

        lbsoDt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbsoDt.setForeground(new java.awt.Color(255, 255, 255));
        lbsoDt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbsoDt.setText("SỐ ĐT:");
        lbsoDt.setToolTipText("");

        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddCustomer.setText("+");
        btnAddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paymentInfoLayout = new javax.swing.GroupLayout(paymentInfo);
        paymentInfo.setLayout(paymentInfoLayout);
        paymentInfoLayout.setHorizontalGroup(
            paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentInfoLayout.createSequentialGroup()
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMoney)
                                    .addComponent(lbTotalMoney)))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTextDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTextTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTextMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbVoucher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbsoDt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        paymentInfoLayout.setVerticalGroup(
            paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentInfoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCustomer)
                    .addComponent(lbsoDt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addComponent(lbTextMoney)
                        .addGap(3, 3, 3))
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbTextTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTextDiscount)
                            .addComponent(lbDiscount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMoney))))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(43, 133, 161));
        jButton2.setText("THANH TOÁN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        orderContainer.setPreferredSize(new java.awt.Dimension(271, 350));

        javax.swing.GroupLayout orderContainerLayout = new javax.swing.GroupLayout(orderContainer);
        orderContainer.setLayout(orderContainerLayout);
        orderContainerLayout.setHorizontalGroup(
            orderContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        orderContainerLayout.setVerticalGroup(
            orderContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbClearAll)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lbClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(paymentPanel, java.awt.BorderLayout.EAST);

        leftPanel.setBackground(new java.awt.Color(43, 133, 161));
        leftPanel.setPreferredSize(new java.awt.Dimension(80, 631));
        leftPanel.setRadius(0);

        jButton3.setBackground(new java.awt.Color(43, 133, 161));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/logout.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐĂNG XUẤT");

        imagePanel1.setBackground(new java.awt.Color(43, 133, 161));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/storeiconwhite.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BÁN HÀNG");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIcon1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LogoutAction.logout();
        LogoutAction.storeLogoutTime(logAct.getLoginDetail());
//        System.out.println("Login detail: " + logAct.getLoginDetail());
        this.setVisible(false);
        this.loginGui.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new SearchAndFilter(scrollPanelMenu).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       myLoaiSPComboBox1.setSelectedIndex(0);
       textFieldIcon1.setText("");
       scrollPanelMenu.showProducts();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerMainFrame(null, null).setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JPanel filterPanel;
    private GUI.SaleGroup.SellerGUI.Component.ImagePanel imagePanel1;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel itemContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbClearAll;
    private javax.swing.JLabel lbDiscount;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JLabel lbTextDiscount;
    private javax.swing.JLabel lbTextMoney;
    private javax.swing.JLabel lbTextTotal;
    private javax.swing.JLabel lbTotalMoney;
    private javax.swing.JLabel lbVoucher;
    private javax.swing.JLabel lbsoDt;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel leftPanel;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel mainContainer;
    private GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox myLoaiSPComboBox1;
    private javax.swing.JPanel orderContainer;
    private javax.swing.JPanel paymentInfo;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel paymentPanel;
    private javax.swing.JPanel spaceBottom;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon textFieldIcon1;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon txtPhoneNumber;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon txtVoucher;
    // End of variables declaration//GEN-END:variables
    private MenuPanel scrollPanelMenu;
    private OrderPanel scrollPanelOrder;
       
    private void init() {  
        
        this.scrollPanelOrder = new OrderPanel(271, 350, new ChangePaymentInfo(this.txtPhoneNumber, this.txtVoucher, this.lbTextTotal,this.lbTextDiscount, this.lbTextMoney), jButton2);
        orderContainer.setLayout(null);
        orderContainer.add(this.scrollPanelOrder);
        //Get list loai sp
        myLoaiSPComboBox1.getLoaiSPFromDatabase();
        
        mainContainer.setLayout(null);
        this.scrollPanelMenu = new MenuPanel(665, 505, scrollPanelOrder);
        mainContainer.add(this.scrollPanelMenu);
        this.scrollPanelMenu.showProducts();
        addActionEvent();
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                
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
    
    private void addEventFilterAndSearch(){
        myLoaiSPComboBox1.addActionListener(new ComboBoxLoaiSPAction(myLoaiSPComboBox1, scrollPanelMenu, textFieldIcon1));
        textFieldIcon1.getDocument().addDocumentListener(new SearchMenuListener(scrollPanelMenu, myLoaiSPComboBox1, textFieldIcon1));
    }
    
    private void addActionEvent(){
        txtVoucher.getDocument().addDocumentListener(new DiscountTextFieldListener(scrollPanelOrder));
        jButton2.addActionListener(new PayActionListener(this.txtVoucher, this.txtPhoneNumber, this.lbTextTotal,this.lbTextDiscount,this.lbTextMoney, jButton2, scrollPanelOrder));
        lbClearAll.addMouseListener(new ClearAllAction(scrollPanelOrder));
        btnAddCustomer.addActionListener(new AddCustomerAction(scrollPanelOrder, txtPhoneNumber));
    }
     
}
