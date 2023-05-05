/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.quanlycuahang;


import com.mycompany.quanlycuahang.dao.CategoryDao;
import com.mycompany.quanlycuahang.helper.MessageDialogHelper;
import com.mycompany.quanlycuahang.helper.Validator;
import com.mycompany.quanlycuahang.model.Category;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CategoryManagementPanel extends javax.swing.JPanel {
    private DefaultTableModel tableModel;

    /**
     * Creates new form CategoryManagementPanel
     */
    public CategoryManagementPanel() {
        initComponents();
        
        initTable();
        
        loadDataToTable();
    }

    
    private void initTable(){
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Mã Loại Sách", "Tên Loại Sách"});
        tblCategory.setModel(tableModel);
        
    }
    
     private void loadDataToTable(){
        try{
            CategoryDao dao = new CategoryDao();
            List<Category> list = dao.findAll();
            tableModel.setRowCount(0);
            for(Category category : list){
                tableModel.addRow(new Object[]{
                    category.getMaLoaiSach(), category.getTenLoaiSach()
                });
            }
            tableModel.fireTableDataChanged();
        }catch (Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLoaiSachTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaLoaiSach = new javax.swing.JTextField();
        txtTenLoaiSach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnNhapMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Loại Sách");

        jLabel2.setText("Mã Loại Sách:");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(txtMaLoaiSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaLoaiSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Mã Loại Sách:");

        jLabel4.setText("Tên Loại Sách");

        jLabel5.setText("Mô Tả:");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaLoaiSach)
                    .addComponent(txtTenLoaiSach)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/new-document.png"))); // NOI18N
        btnNhapMoi.setText("Nhập Mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/edit.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlycuahang/icons/remove.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNhapMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNhapMoi)
                .addGap(18, 18, 18)
                .addComponent(btnLuu)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCategory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
             if(txtMaLoaiSachTimKiem.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Mã loại sách cần phải nhập để tìm kiếm");
            return;
        }
        
        try{
            CategoryDao dao = new CategoryDao();
            
            Category category = dao.findById(txtMaLoaiSachTimKiem.getText());
            
            if(category != null){
                txtMaLoaiSach.setText(category.getMaLoaiSach());
                txtTenLoaiSach.setText(category.getTenLoaiSach());
                txtMaLoaiSachTimKiem.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin loại sách");
            }
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
       txtMaLoaiSach.setText("");
       txtTenLoaiSach.setText("");
       txtMoTa.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        StringBuilder sb = new StringBuilder();     //  Create obj sb use check data    
        Validator.checkEmpty(txtMaLoaiSach, sb, "Mã loại sách chưa nhập");
        Validator.checkEmpty(txtTenLoaiSach, sb, "Tên loại sách chưa nhập");
        Validator.checkEmpty(txtMoTa, sb, "Mô tả loại sách chưa nhập");
      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       
       try{
           Category category = new Category();
           category.setMaLoaiSach(txtMaLoaiSach.getText());
           category.setTenLoaiSach(txtTenLoaiSach.getText());
           
           
           CategoryDao dao = new CategoryDao();
           if(dao.insert(category)){   
                JOptionPane.showMessageDialog(this,"Thông tin loại sách mới đã được lưu vào CSDL");
                btnNhapMoiActionPerformed(evt);
                loadDataToTable();
            }else{
              JOptionPane.showMessageDialog(this,"Thông tin loại sách chưa được lưu vào CSDL");
           }
       } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          e.printStackTrace();
       }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        StringBuilder sb = new StringBuilder();         //  Create obj sb use check data  
        Validator.checkEmpty(txtMaLoaiSach, sb, "Mã loại sách chưa nhập");
        Validator.checkEmpty(txtTenLoaiSach, sb, "Tên loại sách chưa nhập");
        Validator.checkEmpty(txtMoTa, sb, "Mô tả loại sách chưa nhập");
      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       
       if(JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thông tin loại sách không ?", 
               "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
           return;
       }
       
       try{
           Category category = new Category();
           category.setMaLoaiSach(txtMaLoaiSach.getText());
           category.setTenLoaiSach(txtTenLoaiSach.getText());
           
           CategoryDao dao = new CategoryDao();
           if( dao.update(category)){
               JOptionPane.showMessageDialog(this,"Thông tin loại sách đã được cập nhật được lưu vào CSDL");
               btnNhapMoiActionPerformed(evt);
               loadDataToTable();
               
                }
           else{
               JOptionPane.showMessageDialog(this, "Cập nhật không thành công");
           }
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();         //  Create obj sb use check data  
        Validator.checkEmpty(txtMaLoaiSach, sb, "Mã loại sách chưa nhập");
      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       if(JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa thông tin loại sách không ?",
                       "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
           return;
       }
       
       try{
           CategoryDao dao = new CategoryDao();
           if( dao.delete(txtMaLoaiSach.getText())){
                JOptionPane.showMessageDialog(this, "Thông tin loại sách đã được xóa khỏi CSDL"); 
                btnNhapMoiActionPerformed(evt);
                loadDataToTable();
           }
           else{
               JOptionPane.showMessageDialog(this, "Mã số loại sách không tồn tại ");
           }
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
           try{
            int row = tblCategory.getSelectedRow();
      
      if(row >= 0){
          String id = (String) tblCategory.getValueAt(row, 0);             
          CategoryDao dao = new CategoryDao();
          Category category = dao.findById(id);
          
          if(category != null){
              txtMaLoaiSach.setText(category.getMaLoaiSach());
              txtTenLoaiSach.setText(category.getTenLoaiSach());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
            
      }
    }//GEN-LAST:event_tblCategoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtMaLoaiSach;
    private javax.swing.JTextField txtMaLoaiSachTimKiem;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenLoaiSach;
    // End of variables declaration//GEN-END:variables
}
