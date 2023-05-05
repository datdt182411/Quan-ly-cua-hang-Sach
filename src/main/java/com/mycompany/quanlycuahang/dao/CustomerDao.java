/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.Customer;
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
public class CustomerDao {
     private Customer createKhachHang (ResultSet rs) throws SQLException {
        Customer cs = new Customer();
        cs.setMaKH(rs.getString("makh"));
        cs.setHoTen(rs.getString("hoten"));
        cs.setEmail(rs.getString("email"));
        cs.setSoDT(rs.getString("sodt"));
        cs.setGioiTinh(rs.getInt("gioitinh"));
        cs.setDiaChi(rs.getString("diachi"));
        return cs;
    }

    public boolean insert(Customer cus) throws Exception{
        String sql = "insert into khachhang(makh, hoten, email, sodt, gioitinh, diachi) values(?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, cus.getMaKH());
            pstmt.setString(2, cus.getHoTen());
            pstmt.setString(3, cus.getEmail()); 
            pstmt.setString(4, cus.getSoDT());
            pstmt.setInt(5, cus.getGioiTinh());
            pstmt.setString(6, cus.getDiaChi());
            

            return pstmt.executeUpdate() > 0;
        }
    }

    public Customer findById(String maKH) throws Exception{
        String sql = "select * from khachhang where makh = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maKH);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                Customer cs = createKhachHang (rs);
                
                return cs;
                 
            }
           
            return null;    //null: Not found object
        }
    }
    

    public List< Customer > findAll() throws Exception{
        String sql = "select * from khachhang";
        try(
             Connection con = DatabaseHelper.opConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            try(ResultSet rs = pstmt.executeQuery();){
                List< Customer > list = new ArrayList<>();
                while (rs.next()){
                    Customer cs = createKhachHang (rs);
                    list.add(cs);
                }
            return list;
        } 
    }
}
    
    public boolean update(Customer cus) throws Exception{
        String sql = "update khachhang"+
                " SET hoten = ?, email = ?, sodt = ?, gioitinh = ?, diachi = ? "
                + " where makh = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(6, cus.getMaKH());
            pstmt.setString(1, cus.getHoTen());
            pstmt.setString(2, cus.getEmail()); 
            pstmt.setString(3, cus.getSoDT());
            pstmt.setInt(4, cus.getGioiTinh());
            pstmt.setString(5, cus.getDiaChi());
            

            return pstmt.executeUpdate() > 0;
        }
    }

     public boolean delete(String maKH) throws Exception{
        String sql = "delete from khachhang where makh = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maKH);
          
            
            return pstmt.executeUpdate() > 0;
        }
    }
}
