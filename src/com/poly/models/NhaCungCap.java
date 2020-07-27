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
public class NhaCungCap {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private String Email;
    private String SoDT;
    private String GhiChu;
    private Date NgayHopTac = DateHelper.now();
    private String Hinh;

    public NhaCungCap() {
    }

    public NhaCungCap(String MaNCC, String TenNCC, String DiaChi, String Email, String SoDT, String GhiChu, Date NgayHopTac, String Hinh) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.SoDT = SoDT;
        this.GhiChu = GhiChu;
        this.NgayHopTac = NgayHopTac;
        this.Hinh = Hinh;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public Date getNgayHopTac() {
        return NgayHopTac;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public void setNgayHopTac(Date NgayHopTac) {
        this.NgayHopTac = NgayHopTac;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    
    
    
}
