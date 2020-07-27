/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.models;

import com.poly.helper.DateHelper;
import java.util.Date;

/**
 *
 * @author ngocp
 */
public class NguyenLieu {
    private String manl;
    private String tennl;
    private Date ngaynhap = DateHelper.now();
    private int soluong;
    private int gia;
    private String hinh;
    private boolean trangthai;
    private String maloai;
    private String mancc;
    private String tenloai;

    public NguyenLieu() {
    }

    public NguyenLieu(String manl, String tennl, int soluong, int gia, String hinh, boolean trangthai, String maloai, String mancc, String tenloai) {
        this.manl = manl;
        this.tennl = tennl;
        this.soluong = soluong;
        this.gia = gia;
        this.hinh = hinh;
        this.trangthai = trangthai;
        this.maloai = maloai;
        this.mancc = mancc;
        this.tenloai = tenloai;
    }

    public String getManl() {
        return manl;
    }

    public String getTennl() {
        return tennl;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getGia() {
        return gia;
    }

    public String getHinh() {
        return hinh;
    }

    public boolean getTrangthai() {
        return trangthai;
    }

    public String getMaloai() {
        return maloai;
    }

    public String getMancc() {
        return mancc;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setManl(String manl) {
        this.manl = manl;
    }

    public void setTennl(String tennl) {
        this.tennl = tennl;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    
    
}
