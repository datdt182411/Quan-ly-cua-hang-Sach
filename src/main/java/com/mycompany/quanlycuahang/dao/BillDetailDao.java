/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.BillDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungn
 */
public class BillDetailDao {

    private BillDetail createChiTietDonHang(ResultSet rs) throws SQLException {
        BillDetail billDetail = new BillDetail();

        billDetail.setMaDH(rs.getInt("madh"));
        billDetail.setMaSach(rs.getString("masach"));
        billDetail.setMaChiTietDonHang(rs.getString("mactdh"));
        billDetail.setSoLuongThemVao(rs.getInt("soluong"));
        return billDetail;
    }


    public boolean insert(BillDetail billDetail) throws Exception {
        String sql = "insert into  chitietdonhang(mactdh,madh,masach,soluong) values(?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, billDetail.getMaChiTietDonHang());
            pstmt.setInt(2, billDetail.getMaDH());
            pstmt.setString(3, billDetail.getMaSach());
            pstmt.setInt(4, billDetail.getSoLuongThemVao());


            return pstmt.executeUpdate() > 0;
        }
    }


    public BillDetail findById(int madonhang) throws Exception {
        String sql = "select * from chitietdonhang where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, madonhang);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                BillDetail billDetail = createChiTietDonHang(rs);

                return billDetail;

            }

            return null;    //null: Not found object
        }
    }

    public BillDetail findByIdDetail(String mactdh) throws Exception {
        String sql = "select * from chitietdonhang where mactdh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, mactdh);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                BillDetail billDetail = createChiTietDonHang(rs);

                return billDetail;

            }

            return null;    //null: Not found object
        }
    }


    public List< BillDetail> findAll() throws Exception {
        String sql = "select * from chitietdonhang";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                List< BillDetail> list = new ArrayList<>();
                while (rs.next()) {
                    BillDetail billDetail = createChiTietDonHang(rs);
                    list.add(billDetail);
                }
                return list;
            }
        }
    }


    public boolean update(BillDetail billDetail) throws Exception {
        String sql = "update chitietdonhang"
                + " SET mactdh = ?, masach = ?, soluong = ? "
                + " where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(4, billDetail.getMaDH());
            pstmt.setString(2, billDetail.getMaSach());
            pstmt.setInt(3, billDetail.getSoLuongThemVao());
            pstmt.setString(1, billDetail.getMaChiTietDonHang());


            return pstmt.executeUpdate() > 0;
        }
    }


    public boolean delete(String mactdh) throws Exception {
        String sql = "delete from chitietdonhang where mactdh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, mactdh);


            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean deleteByBillId(int madh) throws Exception {
        String sql = "delete from chitietdonhang where madh = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, madh);


           return pstmt.executeUpdate()>0;
        }
    }
}
