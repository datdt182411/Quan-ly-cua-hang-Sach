/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.model;

/**
 *
 * @author hungn
 */
public class BillDetail extends Book {
    private int soLuongThemVao,MaDH;
    private String maChiTietDonHang;

    public BillDetail() {
    }

    public BillDetail(int MaDH, int soLuongThemVao, String maChiTietDonHang, String maSach) {
        super(maSach);
        this.MaDH = MaDH;
        this.soLuongThemVao = soLuongThemVao;
        this.maChiTietDonHang = maChiTietDonHang;
    }
    

    public int getMaDH() {
        return MaDH;
    }

    public void setMaDH(int MaDH) {
        this.MaDH = MaDH;
    }

    public int getSoLuongThemVao() {
        return soLuongThemVao;
    }

    public void setSoLuongThemVao(int soLuongThemVao) {
        this.soLuongThemVao = soLuongThemVao;
    }

    public String getMaChiTietDonHang() {
        return maChiTietDonHang;
    }

    public void setMaChiTietDonHang(String maChiTietDonHang) {
        this.maChiTietDonHang = maChiTietDonHang;
    }

           
} 
