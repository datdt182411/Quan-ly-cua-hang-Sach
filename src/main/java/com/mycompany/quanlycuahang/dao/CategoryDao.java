/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryDao {
        private Category createLoaiSach (ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setMaLoaiSach(rs.getString("maloaisach"));
        category.setTenLoaiSach(rs.getString("tenloaisach"));
        
        return category;
    }
    //   The method make insert data into datatable
    public boolean insert(Category category) throws Exception{
        String sql = "insert into loaisach(maloaisach, tenloaisach) values(?,?)";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, category.getMaLoaiSach());
            pstmt.setString(2, category.getTenLoaiSach());
            
            
//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }

//The method Find user by Id
    public Category findById(String maLoaiSach) throws Exception{
        String sql = "select * from loaisach where maloaisach = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maLoaiSach);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                Category category = createLoaiSach (rs);
                
                return category;
                 
            }
           
            return null;    //null: Not found object
        }
    }
    
//Create the method help read all data in table
    public List< Category > findAll() throws Exception{
        String sql = "select * from loaisach";
        try(
             Connection con = DatabaseHelper.opConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            try(ResultSet rs = pstmt.executeQuery();){
                List< Category > list = new ArrayList<>();
                while (rs.next()){
                    Category category = createLoaiSach (rs);
                    list.add(category);
                }
            return list;
        } 
    }
}
    
//   The method make update data into datatable
    public boolean update(Category category) throws Exception{
        String sql = "update loaisach"+
                " SET tenloaisach = ?"
                + " where maloaisach = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, category.getMaLoaiSach());
            pstmt.setString(1, category.getTenLoaiSach()); 
            
//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }
//    The method make delete infomation Category
     public boolean delete(String maLoaiSach) throws Exception{
        String sql = "delete from loaisach where maloaisach = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maLoaiSach);
          
            
//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }
}
