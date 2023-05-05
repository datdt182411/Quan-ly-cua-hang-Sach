/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlycuahang;

import com.mycompany.quanlycuahang.helper.SharedData;
import com.mycompany.quanlycuahang.threading.ClockThread;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MainForm extends javax.swing.JFrame {
     private CustomerManagementPanel mCustomerPanel;                        // Form management customer information 
     private ProductManagementPanel mProductPanel;
     private CategoryManagementPanel mCategoryPanel;
     private BillManagementPanel mBillPanel;
//     private EmployeeManagementPanel mEmployeePanel;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        setLocationRelativeTo(null);                      //Set for Form Display Center  
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH );          
        
        initClock();
        
    }
    
//     The method create clock display Form
    private void initClock() {
        ClockThread th = new ClockThread(jLabel1);
        th.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        tbrDangXuat = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        tbrGioiThieu = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblLoginName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFile_Logout = new javax.swing.JMenuItem();
        menuFile_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuManageCustomer = new javax.swing.JMenuItem();
        menuManageEmployee = new javax.swing.JMenuItem();
        menuManageBook = new javax.swing.JMenuItem();
        menuManageCategory = new javax.swing.JMenuItem();
        menuManageBill = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuGioiThieu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar2.setRollover(true);

        tbrDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/logout-icon-32.png"))); // NOI18N
        tbrDangXuat.setText("Đăng Xuất");
        tbrDangXuat.setFocusable(false);
        tbrDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrDangXuatActionPerformed(evt);
            }
        });
        jToolBar2.add(tbrDangXuat);
        jToolBar2.add(jSeparator6);
        jToolBar2.add(jSeparator7);

        tbrGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/Actions-help-about-icon-32.png"))); // NOI18N
        tbrGioiThieu.setText("Giới Thiệu");
        tbrGioiThieu.setFocusable(false);
        tbrGioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrGioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrGioiThieuActionPerformed(evt);
            }
        });
        jToolBar2.add(tbrGioiThieu);

        lblLoginName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLoginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRole.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(lblLoginName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("8:8:8 AM");

        jMenu1.setText("Hệ Thống");

        menuFile_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/logout-icon-16.png"))); // NOI18N
        menuFile_Logout.setText("Đăng Xuất");
        menuFile_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile_LogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuFile_Logout);

        menuFile_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/Button-Close-icon-16.png"))); // NOI18N
        menuFile_Exit.setText("Thoát");
        menuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuFile_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        menuManageCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/customer16.png"))); // NOI18N
        menuManageCustomer.setText("Quản Lý Khách Hàng");
        menuManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageCustomerActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageCustomer);

        menuManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/employee16.png"))); // NOI18N
        menuManageEmployee.setText("Quản Lý Nhân Viên");
        menuManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageEmployee);

        menuManageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/book_16.png"))); // NOI18N
        menuManageBook.setText("Quản Lý Sách");
        menuManageBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageBookActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageBook);

        menuManageCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/options16.png"))); // NOI18N
        menuManageCategory.setText("Quản Lý Loại Sách");
        menuManageCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageCategoryActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageCategory);

        menuManageBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/bill16.png"))); // NOI18N
        menuManageBill.setText("Quản Lý Đơn Hàng");
        menuManageBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageBillActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageBill);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/Actions-help-about-icon-16.png"))); // NOI18N
        jMenuItem5.setText("Nội Dung");
        jMenu3.add(jMenuItem5);

        menuGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/Help-icon-16.png"))); // NOI18N
        menuGioiThieu.setText("Giới Thiệu");
        menuGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGioiThieuActionPerformed(evt);
            }
        });
        jMenu3.add(menuGioiThieu);
        jMenu3.add(jSeparator3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tplMainBoard)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menuFile_ExitActionPerformed
//    Make click icon will go to ManageCustomer form
    private void menuManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageCustomerActionPerformed

        if(mCustomerPanel == null){
        mCustomerPanel = new CustomerManagementPanel();
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/com/mycompany/quanlycuahang/icons/customer16.png"));
        tplMainBoard.addTab("Quản Lý Khách Hàng", icon, mCustomerPanel,"Quản Lý Khách Hàng");           //Use the method addTab add "QL Khách Hàng" into JTabPane
      }
      tplMainBoard.setSelectedComponent(mCustomerPanel);
    }//GEN-LAST:event_menuManageCustomerActionPerformed

    
//    Make click icon will go to ManageBook form
    private void menuManageBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageBookActionPerformed
        if(mProductPanel == null){
        mProductPanel = new ProductManagementPanel();
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/com/mycompany/quanlycuahang/icons/book_16.png"));
        tplMainBoard.addTab("Quản Lý Sách", icon, mProductPanel,"Quản Lý Sách ");           //Use the method addTab add "QL Khách Hàng" into JTabPane
      }
      tplMainBoard.setSelectedComponent(mProductPanel);
    }//GEN-LAST:event_menuManageBookActionPerformed
           

//      The method make to display information Gioi Thieu
    private void tbrGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrGioiThieuActionPerformed
       AboutUsDialog aboutUsDialog = new AboutUsDialog(this, true);
       
       aboutUsDialog.setVisible(true);
    }//GEN-LAST:event_tbrGioiThieuActionPerformed


    private void menuGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGioiThieuActionPerformed
     AboutUsDialog aboutUsDialog = new AboutUsDialog(this, true);
       
       aboutUsDialog.setVisible(true);
    }//GEN-LAST:event_menuGioiThieuActionPerformed

    private void tbrDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrDangXuatActionPerformed
       
        LoginDialog loginDialog = new LoginDialog(this, true);
       
        loginDialog.setVisible(true);
       
        processLoginSuccessful();
    }//GEN-LAST:event_tbrDangXuatActionPerformed

//  The method help to make display Window Login on MainForm
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);                //The method setVisible help display(If false not display)
        
        processLoginSuccessful();
    }//GEN-LAST:event_formWindowOpened

//  The method help to display: LoginName, Role.
    private void processLoginSuccessful(){
        lblLoginName.setText(SharedData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(SharedData.nguoiDangNhap.getVaiTro());
        tplMainBoard.removeAll();
        mBillPanel = null;
        mCategoryPanel = null;
        mProductPanel = null;
        mCustomerPanel = null;
        
//  Help to decentralization use function with Role      
        if (SharedData.nguoiDangNhap.getVaiTro().equals("Nhân viên")){
            menuManageBook.setEnabled(true);
            menuManageCategory.setEnabled(true);
            menuManageCustomer.setEnabled(false);
            menuManageBill.setEnabled(false);
            menuManageEmployee.setEnabled(false);
        }else if (SharedData.nguoiDangNhap.getVaiTro().equals("Quản lý")){
            menuManageBook.setEnabled(true);
            menuManageCategory.setEnabled(true);
            menuManageCustomer.setEnabled(true);
            menuManageBill.setEnabled(true);
            menuManageEmployee.setEnabled(true);
        }
    }
    private void menuManageCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageCategoryActionPerformed
       if(mCategoryPanel == null){
       mCategoryPanel = new CategoryManagementPanel();
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/com/mycompany/quanlycuahang/icons/options16.png"));
        tplMainBoard.addTab("Quản Lý Loại Sách", icon, mCategoryPanel,"Quản Lý Loại Sách ");           //Use the method addTab add "QL Khách Hàng" into JTabPane
      }
      tplMainBoard.setSelectedComponent(mCategoryPanel);
    }//GEN-LAST:event_menuManageCategoryActionPerformed

    private void menuManageBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageBillActionPerformed
      if(mBillPanel == null){
      mBillPanel = new BillManagementPanel();
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/com/mycompany/quanlycuahang/icons/bill16.png"));
        tplMainBoard.addTab("Quản Lý Đơn Hàng", icon, mBillPanel,"Quản Lý Đơn Hàng");           //Use the method addTab add "QL Khách Hàng" into JTabPane
      }
      tplMainBoard.setSelectedComponent(mBillPanel);
    }//GEN-LAST:event_menuManageBillActionPerformed

    private void menuFile_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile_LogoutActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);
       
        loginDialog.setVisible(true);
       
        processLoginSuccessful();
    }//GEN-LAST:event_menuFile_LogoutActionPerformed

    private void menuManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageEmployeeActionPerformed
//        if(mEmployeePanel == null){
//            mEmployeePanel = new EmployeeManagementPanel();
//            ImageIcon icon = new ImageIcon(getClass()
//                .getResource("/com/mycompany/quanlycuahang/icons/employee16.png"));
//            tplMainBoard.addTab("Quản Lý Nhân Viên", icon, mEmployeePanel,"Quản Lý Nhân Viên");           //Use the method addTab add "QL Khách Hàng" into JTabPane
//        }
//        tplMainBoard.setSelectedComponent(mEmployeePanel);
    }//GEN-LAST:event_menuManageEmployeeActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JMenuItem menuFile_Exit;
    private javax.swing.JMenuItem menuFile_Logout;
    private javax.swing.JMenuItem menuGioiThieu;
    private javax.swing.JMenuItem menuManageBill;
    private javax.swing.JMenuItem menuManageBook;
    private javax.swing.JMenuItem menuManageCategory;
    private javax.swing.JMenuItem menuManageCustomer;
    private javax.swing.JMenuItem menuManageEmployee;
    private javax.swing.JButton tbrDangXuat;
    private javax.swing.JButton tbrGioiThieu;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables

    private void tbrGioiThieu(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}