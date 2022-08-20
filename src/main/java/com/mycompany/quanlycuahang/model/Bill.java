/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.model;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Bill extends NguoiDung {

    private String maKH;
      private Date ngayTaoDon;
    private int maDonHang, tongTien, trangThai;

    public Bill() {
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Bill(int maDonHang, int trangThai, String maKH, Date ngayTaoDon, int tongTien, String tenDangNhap) {
        super(tenDangNhap);
        this.maDonHang = maDonHang;
        this.maKH = maKH;
        this.ngayTaoDon = ngayTaoDon;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayTaoDon() {
        return ngayTaoDon;
    }

    public void setNgayTaoDon(Date ngayTaoDon) {
        this.ngayTaoDon = ngayTaoDon;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

}
