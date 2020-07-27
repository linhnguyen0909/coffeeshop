/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.models;


/**
 *
 * @author Hoai Linh
 */
public class NhanVien {
private String manv;
private String matkhau;
private String tennv;
private boolean phanquyen;
private String hinh;

    public NhanVien() {
    }

    public NhanVien(String manv, String matkhau, String tennv, boolean phanquyen, String hinh) {
        this.manv = manv;
        this.matkhau = matkhau;
        this.tennv = tennv;
        this.phanquyen = phanquyen;
        this.hinh = hinh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public boolean getPhanquyen() {
        return phanquyen;
    }

    public void setPhanquyen(boolean phanquyen) {
        this.phanquyen = phanquyen;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}
