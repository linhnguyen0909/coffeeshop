/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.models;

/**
 *
 * @author ngocp
 */
public class MatHang {
    private String MaMH;
    private String TenSP;
    private int Gia;
    private boolean TrangThai;
    private String hinh;

        @Override
    public String toString(){
        return this.TenSP;
    }
    public MatHang() {
    }

    public MatHang(String MaMH, String TenSP, int Gia, boolean TrangThai, String hinh) {
        this.MaMH = MaMH;
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
        this.hinh = hinh;
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getTenSP() {
        return TenSP;
    }

    public int getGia() {
        return Gia;
    }

    public boolean getTrangThai() {
        return TrangThai;
    }

    public String getHinh() {
        return hinh;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    
    
}
