/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd;

import BUS.BusAccessor.CTPhieuHuyBUS;
import BUS.BusAccessor.CTPhieuHuyBUS;
import BUS.BusAccessor.NhanVienBUS;
import BUS.BusAccessor.PhieuHuyBUS;
import BUS.BusAccessor.PhieuNhapBUS;
import BUS.BusAccessor.SanPhamBUS;
import DTO.ChiTietPhieuHuy;
import DTO.ChiTietPhieuNhap;
import DTO.PhieuHuy;
import DTO.PhieuNhap;
import DTO.SanPham;
import GUI.ManageGroup.Theme.NhapXuatTheme;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author ACER
 */
public class HuyHangSanPham extends javax.swing.JFrame {
    private final CTPhieuHuyBUS ctPhieuHuyBus;
    private final NhanVienBUS nhanvienBus;
    private final SanPhamBUS sanPhambus;
    private final boolean isAdd;
    private int maPhieuHuy;
    private final int maNhanVien;
    /**
     * Creates new form NhapHangSanPham
     */
    public HuyHangSanPham(int maPhieuHuy, int maNhanVien, boolean isAddFrame) {
        NhapXuatTheme.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.isAdd = isAddFrame;
        this.setTitle("Hủy sản phẩm khỏi kho hàng");
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10000, 1); 
        this.jSpinner1.setModel(model);
        ctPhieuHuyBus = new CTPhieuHuyBUS();
        nhanvienBus = new NhanVienBUS();
        sanPhambus = new SanPhamBUS();
        this.maPhieuHuy = maPhieuHuy;
        this.maNhanVien = maNhanVien;
        this.setThongTinPhieuNhap();
        this.addActionToTextSearch();
        this.loadFromDatabase();
    }
    
    private void setThongTinPhieuNhap(){
        this.lbmaHoaDon.setText(Integer.toString(this.maPhieuHuy));
        this.lbMaNV.setText(Integer.toString(this.maNhanVien));
        this.lbTenNV.setText("<html>"+nhanvienBus.get(this.maNhanVien).getTenNV());
        Timer myTimer = new Timer(1000, (ActionEvent e) -> {
            String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            String[] arr = timeStamp.split(" ");
            lbNgayNhap.setText(arr[0]);
            lbGioNhap.setText(arr[1]);
        });
        myTimer.start();
        JMenuItem item1 = new JMenuItem("Lấy mã");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = nhapTable.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) nhapTable.getModel();
                txtMaSP.setText(model.getValueAt(row, 0)+"");
                jSpinner1.setValue(model.getValueAt(row, 2));
            }
        });
        JMenuItem item2 = new JMenuItem("Xóa");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) nhapTable.getModel();
                int[] rows = nhapTable.getSelectedRows();
                for (int i=rows.length-1;i>=0;i--){
                    model.removeRow(rows[i]);
                }
            }
        });
        JPopupMenu popUp = new JPopupMenu();
        popUp.add(item1);
        popUp.add(item2);
        nhapTable.setComponentPopupMenu(popUp);
        nhapTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        nhapTable.getColumnModel().getColumn(1).setPreferredWidth(180);
        nhapTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        nhapTable.getTableHeader().setBackground(Color.decode("#3BACB6"));
        nhapTable.setShowGrid(false);
        nhapTable.setShowHorizontalLines(true);
        nhapTable.setGridColor(Color.decode("#3BACB6"));
    }
    
    private void addActionToTextSearch(){
        this.txtMaSP.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkAndChangeName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkAndChangeName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkAndChangeName();
            }
        });
    }
    
    protected int getNumberic(String text){
        int num = -1;
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e){
        }
        return num;
    }
    
    protected boolean checkAndChangeName(){
        int num = getNumberic(txtMaSP.getText());
        if (num >= 0 && num<=1000){
            SanPham sp = sanPhambus.getHide(num);
            if (sp != null){
                lbTenSP.setText(sp.getTenSP());
                return true;
            }
        }
        lbTenSP.setText("");
        return false;
    }
    
    private void loadFromDatabase(){
        List<ChiTietPhieuHuy> ctpn = ctPhieuHuyBus.getByKey1(this.maPhieuHuy);
        DefaultTableModel model = (DefaultTableModel)nhapTable.getModel();
        if (ctpn == null)
            return;
        for (ChiTietPhieuHuy ct : ctpn){
            model.addRow(new Object[]{ct.getMaSP(), sanPhambus.get(ct.getMaSP()).getTenSP(), ct.getSoLuong()});
        }
    }
    
    public void addToDatabase(int maSP, int soLuong) {
        ChiTietPhieuHuy ctpn = new ChiTietPhieuHuy(this.maPhieuHuy, maSP, soLuong);
        ctPhieuHuyBus.add(ctpn);
    }
    
    public void updateToDatabase(int maSP, int soLuong){
        ChiTietPhieuHuy ctpn = new ChiTietPhieuHuy(this.maPhieuHuy, maSP, soLuong);
        ctPhieuHuyBus.edit(maPhieuHuy, maSP, ctpn);
    }
    
    public void removeFromDatabase(int maSP){
         ctPhieuHuyBus.remove(this.maPhieuHuy, maSP);
    }
    
    public List<ChiTietPhieuHuy> convertToList(){
        List<ChiTietPhieuHuy> listNhap = new ArrayList<>();
        for (int i=0;i<nhapTable.getRowCount();i++){
            int maSP = getNumberic(nhapTable.getValueAt(i, 0)+"");
            int soLuong = getNumberic(nhapTable.getValueAt(i, 2)+"");
            if (soLuong <= 0) {
                JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ!", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            if (isAdd){
                if (sanPhambus.get(maSP).getSoLuong() < soLuong) {
                    JOptionPane.showMessageDialog(this, "Số lượng sản phẩm hủy nhiều hơn số lượng có trong kho", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            }
            else {
                if (sanPhambus.get(maSP).getSoLuong() + ctPhieuHuyBus.get(maPhieuHuy, maSP).getSoLuong() < soLuong) {
                    JOptionPane.showMessageDialog(this, "Số lượng sản phẩm hủy nhiều hơn số lượng có trong kho", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            }
            
            listNhap.add(new ChiTietPhieuHuy(this.maPhieuHuy, maSP, soLuong));
        }
        return listNhap;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        shape8 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        shape9 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        shape1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel10 = new javax.swing.JLabel();
        shape2 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel11 = new javax.swing.JLabel();
        shape3 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sanPhamAddBackground1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbTenNV = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nhapTable = new javax.swing.JTable();
        imagePanel1 = new GUI.ManageGroup.ComponentPanel.ImagePanel();
        jButton2 = new javax.swing.JButton();
        lbMaNV = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbmaHoaDon = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbGioNhap = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        lbTenSP = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbNgayNhap = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("getmaso");

        shape8.setBackground(new java.awt.Color(0, 204, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Xác nhận");

        javax.swing.GroupLayout shape8Layout = new javax.swing.GroupLayout(shape8);
        shape8.setLayout(shape8Layout);
        shape8Layout.setHorizontalGroup(
            shape8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(14, 14, 14))
        );
        shape8Layout.setVerticalGroup(
            shape8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("getMaphieu");

        shape9.setBackground(new java.awt.Color(0, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Hủy");

        javax.swing.GroupLayout shape9Layout = new javax.swing.GroupLayout(shape9);
        shape9.setLayout(shape9Layout);
        shape9Layout.setHorizontalGroup(
            shape9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape9Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        shape9Layout.setVerticalGroup(
            shape9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("getngaynhaphang");

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã sản phẩm");

        jTextField2.setBackground(new java.awt.Color(196, 196, 196));
        jTextField2.setText("jTextField2");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Số lượng");

        shape1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nhập");

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        shape2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Sửa");

        javax.swing.GroupLayout shape2Layout = new javax.swing.GroupLayout(shape2);
        shape2.setLayout(shape2Layout);
        shape2Layout.setHorizontalGroup(
            shape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
        );
        shape2Layout.setVerticalGroup(
            shape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        shape3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Xóa");

        javax.swing.GroupLayout shape3Layout = new javax.swing.GroupLayout(shape3);
        shape3.setLayout(shape3Layout);
        shape3Layout.setHorizontalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        shape3Layout.setVerticalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nhập hàng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Sản phẩm đã nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("getTen");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sanPhamAddBackground1.setBackground(new java.awt.Color(0, 153, 204));
        sanPhamAddBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Nhân viên");
        sanPhamAddBackground1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 150, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mã phiếu:");
        sanPhamAddBackground1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Ngày hủy");
        sanPhamAddBackground1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(txtMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(59, 172, 182));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Mã sản phẩm");
        sanPhamAddBackground1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(59, 172, 182));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Số lượng");
        sanPhamAddBackground1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HỦY HÀNG");
        sanPhamAddBackground1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(59, 172, 182));
        jLabel29.setText("Sản phẩm đã hủy");
        sanPhamAddBackground1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        lbTenNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTenNV.setForeground(new java.awt.Color(255, 255, 255));
        lbTenNV.setText("<html>Huỳnh Khánh Duy");
        lbTenNV.setToolTipText("");
        sanPhamAddBackground1.add(lbTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, -1));

        nhapTable.setBackground(new java.awt.Color(255, 255, 255));
        nhapTable.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        nhapTable.setForeground(new java.awt.Color(0, 153, 204));
        nhapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nhapTable.getTableHeader().setResizingAllowed(false);
        nhapTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(nhapTable);

        sanPhamAddBackground1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 480, 300));

        imagePanel1.setBackground(new java.awt.Color(0, 153, 204));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManageItem/FrameAdd/ComponentFrameAdd/icons8-box-256.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sanPhamAddBackground1.add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 90, 100));

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LƯU");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 110, 40));

        lbMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(255, 255, 255));
        lbMaNV.setText("1");
        sanPhamAddBackground1.add(lbMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 60, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbmaHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbmaHoaDon.setForeground(new java.awt.Color(0, 153, 204));
        lbmaHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmaHoaDon.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbmaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbmaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sanPhamAddBackground1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Mã số:");
        sanPhamAddBackground1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 50, 30));

        lbGioNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGioNhap.setForeground(new java.awt.Color(51, 51, 51));
        sanPhamAddBackground1.add(lbGioNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 70, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sanPhamAddBackground1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 67, 130, -1));
        sanPhamAddBackground1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 110, 30));
        sanPhamAddBackground1.add(lbTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 246, 390, 20));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 90, 30));

        jButton5.setBackground(new java.awt.Color(255, 230, 154));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("HỦY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 110, 40));

        lbNgayNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNgayNhap.setForeground(new java.awt.Color(51, 51, 51));
        lbNgayNhap.setText("16/05/2022");
        sanPhamAddBackground1.add(lbNgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamAddBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamAddBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean isExist = checkAndChangeName();
        if (!isExist){
            JOptionPane.showMessageDialog(this, "Sản phẩm không hợp lệ, vui lòng thêm trước khi nhập !", "Thêm thất bại", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int maSP = getNumberic(txtMaSP.getText());
            if (sanPhambus.get(maSP).getSoLuong() < getNumberic(jSpinner1.getValue()+"")){
                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm hủy nhiều hơn số lượng có trong kho","Thêm thất bại",JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel model = (DefaultTableModel) nhapTable.getModel();
            //Gop ket qua
            for (int i =0;i<model.getRowCount();i++){
                int value = getNumberic(model.getValueAt(i, 0)+"");
                if (maSP == value){
                    int tong = getNumberic(jSpinner1.getValue()+"")+getNumberic(model.getValueAt(i, 2)+"");
                    model.setValueAt(tong, i, 2);
                    return;
                }
            }
            model.addRow(new Object[]{txtMaSP.getText(),lbTenSP.getText(),jSpinner1.getValue()});
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (isAdd) {
            List<ChiTietPhieuHuy> convertedList = convertToList();
            if (convertedList != null && !convertedList.isEmpty()){
                PhieuHuyBUS huyBUS = new PhieuHuyBUS();
                PhieuHuy ph = new PhieuHuy(0, new Timestamp(System.currentTimeMillis()), this.maNhanVien, false);
                huyBUS.add(ph);
                this.maPhieuHuy = huyBUS.getNewest().getMaPhieu();
                for (ChiTietPhieuHuy ct : convertedList) {
                    addToDatabase(ct.getMaSP(), ct.getSoLuong());
                }
                this.setVisible(false);
                this.dispose();
                return;
            }
        }
       List<ChiTietPhieuHuy> ctpn = ctPhieuHuyBus.getByKey1(this.maPhieuHuy);
       List<ChiTietPhieuHuy> convertedList = convertToList();
       if (null != ctpn && convertedList != null){
           for (int i = ctpn.size()-1; i>=0 ;i--){
               for (int j = convertedList.size()-1;j>=0;j--){
                   if (ctpn.get(i).getMaSP() == convertedList.get(j).getMaSP()){
                       updateToDatabase(convertedList.get(j).getMaSP(), convertedList.get(j).getSoLuong());
                       ctpn.remove(i);
                       convertedList.remove(j);
                       j--;
                       i--;
                   }
               }
           }
           for (ChiTietPhieuHuy ct: ctpn)
               removeFromDatabase(ct.getMaSP());
           
           for (ChiTietPhieuHuy ct: convertedList)
               addToDatabase(ct.getMaSP(), ct.getSoLuong());
            this.setVisible(false);
            this.dispose();
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(HuyHangSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuyHangSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuyHangSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuyHangSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        NhapXuatTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuyHangSanPham(8,4, true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbGioNhap;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgayNhap;
    private javax.swing.JLabel lbTenNV;
    private javax.swing.JLabel lbTenSP;
    private javax.swing.JLabel lbmaHoaDon;
    private javax.swing.JTable nhapTable;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground sanPhamAddBackground1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape2;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape3;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape8;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape9;
    private javax.swing.JTextField txtMaSP;
    // End of variables declaration//GEN-END:variables
}
