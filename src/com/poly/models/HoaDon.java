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
public class HoaDon {
    private int maHD;
    private String MaMH;
    private int TongTien;
    private int SoLuongSP;
    private Date NgayXuat = DateHelper.now();
    private String GhiChu;

    public HoaDon() {
    }

    public HoaDon(int maHD, int maBan, String TenHoaDon, String MaMH, String tenSp, int TongTien, int SoLuongSP, String GhiChu) {
        this.maHD = maHD;
        this.MaMH = MaMH;
        this.TongTien = TongTien;
        this.SoLuongSP = SoLuongSP;
        this.GhiChu = GhiChu;
    }

    public int getMaHD() {
        return maHD;
    }

    public String getMaMH() {
        return MaMH;
    }


    public int getTongTien() {
        return TongTien;
    }

    public int getSoLuongSP() {
        return SoLuongSP;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }



    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }


    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public void setSoLuongSP(int SoLuongSP) {
        this.SoLuongSP = SoLuongSP;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    } 
}
