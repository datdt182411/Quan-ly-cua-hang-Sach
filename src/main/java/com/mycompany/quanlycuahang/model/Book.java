/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.model;

/**
 *
 * @author admin
 */
public class Book extends Category {
    private String maSach, tenSach;
    private int soLuong, giaTien;

    public Book() {
    }

    public Book(String maSach, String tenSach, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaTien = giaTien;
    }

    public Book(String maSach) {
        this.maSach = maSach;
    }

    public Book(String maSach, String tenSach, int soLuong, int giaTien, String maLoaiSach) {
        super(maLoaiSach);
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }
    
    
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    
}
