/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.Bill;
import com.mycompany.quanlycuahang.model.BillDetail;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class BillDao {

    private Bill createDonHang(ResultSet rs) throws SQLException {
        Bill bill = new Bill();

        bill.setMaDonHang(rs.getInt("madh"));
        bill.setMaKH(rs.getString("makh"));
        bill.setTenDangNhap(rs.getString("tendangnhap"));
        bill.setNgayTaoDon(rs.getDate("ngaytaodon"));
        bill.setTongTien(rs.getInt("tongtien"));
        bill.setTrangThai(rs.getInt("trangthai"));

        return bill;
    }


    public boolean insert(Bill bill) throws Exception {
        String sql = "insert into  donhang(madh, makh, tendangnhap, ngaytaodon, tongtien, trangthai) values(?,?,?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, bill.getMaDonHang());
            pstmt.setString(2, bill.getMaKH());
            pstmt.setString(3, bill.getTenDangNhap());
            pstmt.setDate(4, bill.getNgayTaoDon());
            pstmt.setInt(5, bill.getTongTien());
            pstmt.setInt(6, bill.getTrangThai());


            return pstmt.executeUpdate() > 0;
        }
    }


    public Bill findById(int madonhang) throws Exception {
        String sql = "select * from donhang where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, madonhang);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Bill bill = createDonHang(rs);

                return bill;

            }

            return null;    //null: Not found object
        }
    }

    public Bill IdMax() throws Exception {
        String sql = "select * from donhang where madh = (select max(madh) from donhang)";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Bill bill = createDonHang(rs);

                return bill;

            }
        }
        return null;
    }


    public List< Bill> findAll() throws Exception {
        String sql = "select * from donhang";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                List< Bill> list = new ArrayList<>();
                while (rs.next()) {
                    Bill bill = createDonHang(rs);
                    list.add(bill);
                }
                return list;
            }
        }
    }


    public boolean update(Bill bill) throws Exception {
        String sql = "update donhang"
                + " SET makh = ?, tendangnhap = ?, ngaytaodon = ?, tongtien = ? "
                + " where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(5, bill.getMaDonHang());
            pstmt.setString(1, bill.getMaKH());
            pstmt.setString(2, bill.getTenDangNhap());
            pstmt.setDate(3, bill.getNgayTaoDon());
            pstmt.setInt(4, bill.getTongTien());


            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean updateStatus(Bill bill, int trangThai) throws Exception {
        String sql = "update donhang"
                + " SET trangthai = ? "
                + " where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(2, bill.getMaDonHang());
            pstmt.setInt(1, trangThai);


            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean updateTotalMoney(Bill bill, int tongTien) throws Exception {
        String sql = "update donhang"
                + " SET tongtien = ? "
                + " where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(2, bill.getMaDonHang());
            pstmt.setInt(1, tongTien);


            return pstmt.executeUpdate() > 0;
        }
    }


    public boolean delete(int madonhang) throws Exception {
        String sql = "delete from donhang where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, madonhang);


            return pstmt.executeUpdate() > 0;
        }
    }
}
