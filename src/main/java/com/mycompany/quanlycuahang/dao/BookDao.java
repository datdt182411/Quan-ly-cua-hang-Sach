/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.Book;
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
public class BookDao {

    private Book createSach(ResultSet rs) throws SQLException {
        Book book = new Book();
        book.setMaSach(rs.getString("masach"));
        book.setTenSach(rs.getString("tensach"));
        book.setGiaTien(rs.getInt("giatien"));
        book.setSoLuong(rs.getInt("soluong"));
        book.setMaLoaiSach(rs.getString("maloaisach").trim());
        return book;
    }

    //   The method make insert data into datatable
    public boolean insert(Book book) throws Exception {
        String sql = "insert into  sach(masach, tensach, giatien, soluong, maloaisach) values(?,?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, book.getMaSach());
            pstmt.setString(2, book.getTenSach());
            pstmt.setInt(3, book.getGiaTien());
            pstmt.setInt(4, book.getSoLuong());
            pstmt.setString(5, book.getMaLoaiSach());

//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }

//The method Find user by Id
    public Book findById(String maSach) throws Exception {
        String sql = "select * from sach where masach = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maSach);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Book book = createSach(rs);

                return book;

            }

            return null;    //null: Not found object
        }
    }

//Create the method help read all data in table
    public List< Book> findAll() throws Exception {
        String sql = "select * from sach";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                List< Book> list = new ArrayList<>();
                while (rs.next()) {
                    Book book = createSach(rs);
                    list.add(book);
                }
                return list;
            }
        }
    }

//   The method make update data into datatable
    public boolean update(Book book) throws Exception {
        String sql = "update sach"
                + " SET tensach = ?, giatien = ?, soluong = ?, maloaisach = ? "
                + " where masach = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(5, book.getMaSach());
            pstmt.setString(1, book.getTenSach());
            pstmt.setInt(2, book.getGiaTien());
            pstmt.setInt(3, book.getSoLuong());
            pstmt.setString(4, book.getMaLoaiSach());

//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }

    public void updateQuantity(int soLuong, String maSach) throws Exception {
        String sql = "update sach"
                + " SET soluong = ?"
                + " where masach = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(2, maSach);
            pstmt.setInt(1, soLuong);

//Use the method executeUpdate return value number row insert success (if > 0)
             pstmt.executeUpdate();
        }
    }
//    The method make delete infomation booktomer

    public boolean delete(String maSach) throws Exception {
        String sql = "delete from sach where masach = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maSach);

//Use the method executeUpdate return value number row insert success (if > 0)
            return pstmt.executeUpdate() > 0;
        }
    }
}
