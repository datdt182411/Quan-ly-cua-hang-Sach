/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.quanlycuahang;

import com.mycompany.quanlycuahang.dao.BookDao;
import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.helper.MessageDialogHelper;
import com.mycompany.quanlycuahang.helper.Validator;
import com.mycompany.quanlycuahang.model.Book;
import com.mycompany.quanlycuahang.model.Category;
import com.mycompany.quanlycuahang.threading.ClockThread;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ProductManagementPanel extends javax.swing.JPanel {
    private DefaultTableModel tableModel;

    /**
     * Creates new form ProductManagementPanel
     */
    public ProductManagementPanel() {
        initComponents();
        
        initTable();
        
        loadDataToTable();
        
        initComboBoxMaLoaiSach();
       
        
    }
    
     //  The method create name colum of data table   
    private void initTable(){
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Mã Sách", "Tên Sách", "Giá Tiền", "Số Lượng", "Mã Loại Sách"});
        tblBooks.setModel(tableModel);
        
    }
    
     private void loadDataToTable(){
        try{
            BookDao dao = new BookDao();
            List<Book> list = dao.findAll();
            tableModel.setRowCount(0);
            for(Book Book : list){
                tableModel.addRow(new Object[]{
                    Book.getMaSach(), Book.getTenSach(), Book.getGiaTien(), Book.getSoLuong(), Book.getMaLoaiSach()
                });
            }
            tableModel.fireTableDataChanged();
        }catch (Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }
     
     //The method create data help choose data in box
     private void initComboBoxMaLoaiSach() {
        try {
            Connection connection = DatabaseHelper.opConnection();
            String sql = "select maloaisach from loaisach";
            PreparedStatement pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            cbxMaLoaiSach.removeAllItems();
            while (rs.next()) {
                cbxMaLoaiSach.addItem(rs.getString("maloaisach"));
            }
            rs.close();
            pstm.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSachTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cbxMaLoaiSach = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnNhapMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Sách");

        jLabel2.setText("Mã Sách");

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
                .addGap(73, 73, 73)
                .addComponent(txtMaSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Mã Sách:");

        jLabel4.setText("Tên Sách:");

        jLabel5.setText("Giá Tiền:");

        jLabel6.setText("Số lượng:");

        jLabel10.setText("Mô tả:");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane3.setViewportView(txtMoTa);

        jLabel8.setText("Mã Loại Sách:");

        cbxMaLoaiSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSach)
                    .addComponent(txtTenSach)
                    .addComponent(txtGiaTien)
                    .addComponent(txtSoLuong)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMaLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbxMaLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapMoi)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNhapMoi)
                .addGap(30, 30, 30)
                .addComponent(btnLuu)
                .addGap(31, 31, 31)
                .addComponent(btnCapNhat)
                .addGap(31, 31, 31)
                .addComponent(btnXoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBooks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         if(txtMaSachTimKiem.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Mã sách cần phải nhập để tìm kiếm");
            return;
        }
        
        try{
            BookDao dao = new BookDao();
            
            Book Book = dao.findById(txtMaSachTimKiem.getText());
            
            if(Book != null){
                txtMaSach.setText(Book.getMaSach());
                txtTenSach.setText(Book.getTenSach());
                txtGiaTien.setText(String.valueOf(Book.getGiaTien()));
                txtSoLuong.setText(""+Book.getSoLuong());               
                txtMaSachTimKiem.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin sách");
            }
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
       txtMaSach.setText("");
       txtTenSach.setText("");
       txtGiaTien.setText("");
       txtSoLuong.setText("");
       txtMoTa.setText("");
      
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
       StringBuilder sb = new StringBuilder();     
        Validator.checkEmpty(txtMaSach, sb, "Mã sách chưa nhập");
        Validator.checkEmpty(txtTenSach, sb, "Tên sách chưa nhập");
        Validator.checkEmpty(txtGiaTien, sb, "Giá tiền chưa nhập");
        Validator.checkEmpty(txtSoLuong, sb, "Số lượng chưa nhập");
        Validator.checkEmpty(txtMoTa, sb, "Mô tả sách chưa nhập");

        
      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       
       try{
           Book Book = new Book();
           Book.setMaSach(txtMaSach.getText());
           Book.setTenSach(txtTenSach.getText());
           Book.setGiaTien(Integer.parseInt(txtGiaTien.getText()));
           Book.setSoLuong(Integer.parseInt(txtSoLuong.getText()));            
   
           
           
           BookDao dao = new BookDao();
           if(dao.insert(Book)){   
                JOptionPane.showMessageDialog(this,"Thông tin sách mới đã được lưu vào CSDL");
                 btnNhapMoiActionPerformed(evt);
                loadDataToTable();
            }else{
              JOptionPane.showMessageDialog(this,"Thông tin sách chưa được lưu vào CSDL");
           }
       } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          e.printStackTrace();
       } 
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
         StringBuilder sb = new StringBuilder();       
        Validator.checkEmpty(txtMaSach, sb, "Mã sách chưa nhập");
        Validator.checkEmpty(txtTenSach, sb, "Tên sách chưa nhập");
        Validator.checkEmpty(txtGiaTien, sb, "Giá tiền chưa nhập");
        Validator.checkEmpty(txtSoLuong, sb, "Số lượng chưa nhập");
        Validator.checkEmpty(txtMoTa, sb, "Mô tả sách chưa nhập");

      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       
       if(JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thông tin sách không ?", 
               "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
           return;
       }
       
       try{
           Book Book = new Book();
           Book.setMaSach(txtMaSach.getText());
           Book.setTenSach(txtTenSach.getText());
           Book.setGiaTien(Integer.parseInt(txtGiaTien.getText()));
           Book.setSoLuong(Integer.parseInt(txtSoLuong.getText()));            

           
           BookDao dao = new BookDao();
           if( dao.update(Book)){
               JOptionPane.showMessageDialog(this,"Thông tin sách đã được cập nhật được lưu vào CSDL");
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
        StringBuilder sb = new StringBuilder();         
        Validator.checkEmpty(txtMaSach, sb, "Mã sách chưa nhập");
      
       if(sb.length() > 0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       if(JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa thông tin sách không ?",
                       "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
           return;
       }
       
       try{
           BookDao dao = new BookDao();
           if( dao.delete(txtMaSach.getText())){
                JOptionPane.showMessageDialog(this, "Thông tin sách đã được xóa khỏi CSDL"); 
                btnNhapMoiActionPerformed(evt);
                loadDataToTable();
           }
           else{
               JOptionPane.showMessageDialog(this, "Mã sách không tồn tại ");
           }
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
          try{
            int row = tblBooks.getSelectedRow();
      
      if(row >= 0){
          String id = (String) tblBooks.getValueAt(row, 0);             
          BookDao dao = new BookDao();
          Book Book = dao.findById(id);
          
          if(Book != null){
              txtMaSach.setText(Book.getMaSach());
              txtTenSach.setText(Book.getTenSach());
              txtGiaTien.setText(String.valueOf(Book.getGiaTien()));
              txtSoLuong.setText(""+Book.getSoLuong());

                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
            
      }
    }//GEN-LAST:event_tblBooksMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxMaLoaiSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaSachTimKiem;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}