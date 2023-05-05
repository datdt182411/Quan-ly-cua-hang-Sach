/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.dao;

import com.mycompany.quanlycuahang.helper.DatabaseHelper;
import com.mycompany.quanlycuahang.model.NguoiDung;
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
public class NguoiDungDao {
// employee:

    private NguoiDung createNhanVien(ResultSet rs) throws SQLException {
        NguoiDung emp = new NguoiDung();
        emp.setTenDangNhap(rs.getString("tendangnhap"));
        emp.setMatKhau(rs.getString("matkhau"));
        emp.setVaiTro(rs.getString("vaitro"));
        emp.setHoTen(rs.getString("hoten"));
        emp.setNgaySinh(rs.getString("ngaysinh"));
        emp.setSoDT(rs.getString("sodt"));
        emp.setEmail(rs.getString("email"));
        return emp;
    }


    public boolean insert(NguoiDung Emp) throws Exception {
        String sql = "insert into nhanvien(tendangnhap, matkhau, vaitro, hoten, ngaysinh, sodt, email) values(?,?,?,?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, Emp.getTenDangNhap());
            pstmt.setString(2, Emp.getMatKhau());
            pstmt.setString(3, Emp.getVaiTro());
            pstmt.setString(4, Emp.getHoTen());
            pstmt.setString(5, Emp.getNgaySinh());
            pstmt.setString(6, Emp.getSoDT());
            pstmt.setString(7, Emp.getEmail());


            return pstmt.executeUpdate() > 0;
        }
    }


    public NguoiDung findById(String tenDangNhap) throws Exception {
        String sql = "select * from nhanvien where tendangnhap = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tenDangNhap);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                NguoiDung emp = createNhanVien(rs);

                return emp;

            }

            return null;    //null: Not found object
        }
    }

    public List< NguoiDung> findAll() throws Exception {
        String sql = "select * from nguoidung";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                List< NguoiDung> list = new ArrayList<>();
                while (rs.next()) {
                    NguoiDung emp = createNhanVien(rs);
                    list.add(emp);
                }
                return list;
            }
        }
    }


    public boolean update(NguoiDung Emp) throws Exception {
        String sql = "update nguoidung"
                + " SET matkhau = ?, vaitro = ?, hoten = ?, ngaysinh = ?, sodt = ?, email = ? "
                + " where tendangnhap = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(7, Emp.getTenDangNhap());
            pstmt.setString(1, Emp.getMatKhau());
            pstmt.setString(2, Emp.getVaiTro());
            pstmt.setString(3, Emp.getHoTen());
            pstmt.setString(4, Emp.getNgaySinh());
            pstmt.setString(5, Emp.getSoDT());
            pstmt.setString(6, Emp.getEmail());


            return pstmt.executeUpdate() > 0;
        }
    }


    public boolean delete(String tenDangNhap) throws Exception {
        String sql = "delete from nguoidung where tendangnhap = ?";
        try (
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tenDangNhap);


            return pstmt.executeUpdate() > 0;
        }
    }


    public NguoiDung checkLogin(String tenDangNhap, String matKhau)
            throws Exception {
        String sql = "select tenDangNhap, matKhau, vaitro from nguoidung "
                + " where tendangnhap = ? and matKhau = ?";
        try ( 
                 Connection con = DatabaseHelper.opConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);

            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaitro"));
                    return nd;
                }
            }
        }
        return null;                 
    }
}
