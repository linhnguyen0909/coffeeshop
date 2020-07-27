/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import com.poly.models.HoaDon;
import com.poly.models.MatHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocp
 */
public class HoaDonDao {
     public void insert(HoaDon model){
        String sql ="INSERT INTO hoadon (mamh, tongtien, soluongsp, ghichu) VALUES (?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaMH(),
                model.getTongTien(),
                model.getSoLuongSP(),
                model.getGhiChu());
    }
    public void update(HoaDon model){
        String sql = "UPDATE hoadon SET mamh=?, tongtien=?, soluongsp=?, ghichu=? WHERE mahoadon=?";
        JdbcHelper.executeUpdate(sql,
                model.getMaMH(),
                model.getTongTien(),
                model.getSoLuongSP(),
                model.getGhiChu(),
                model.getMaHD()
        );
    }
    public void delete(String MaHD){
        String sql = "DELETE FROM hoadon WHERE mahoadon=?";
        JdbcHelper.executeUpdate(sql, MaHD);
    }
    public List<HoaDon> select(){
        String sql = "SELECT * FROM hoadon";
        return select(sql);
    }
    public HoaDon findById(String MaHD){
        String sql = "SELECT * FROM hoadon WHERE mahoadon=?";
        List<HoaDon> list = select(sql,MaHD);
        return list.size() > 0 ? list.get(0) : null;
    }
    private List<HoaDon> select(String sql,Object...args){
        List<HoaDon>list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    HoaDon model = readFromResultSet(rs);
                    list.add(model);
                }
            }finally{
               rs.getStatement().getConnection().close();
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
            return list;
    }

    private HoaDon readFromResultSet(ResultSet rs) throws SQLException {
        HoaDon model = new HoaDon();
        model.setMaHD(rs.getInt("mahoadon"));
        model.setMaMH(rs.getString("mamh"));
        model.setTongTien(rs.getInt("tongtien"));
        model.setSoLuongSP(rs.getInt("soluongsp"));
        model.setNgayXuat(rs.getDate("ngayxuat"));
        model.setGhiChu(rs.getString("ghichu"));
        return model;
    }
}
