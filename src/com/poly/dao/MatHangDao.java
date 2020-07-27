/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import com.poly.models.MatHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocp
 */
public class MatHangDao {
     public void insert(MatHang model){
        String sql ="INSERT INTO mathang (mamh, tensp, gia, hinh, trangthai) VALUES (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaMH(),
                model.getTenSP(),
                model.getGia(),
                model.getHinh(),
                model.getTrangThai());
    }
    public void update(MatHang model){
        String sql = "UPDATE mathang SET tensp=?, gia=?, hinh=?, trangthai=? WHERE mamh=?";
        JdbcHelper.executeUpdate(sql,
                model.getTenSP(),
                model.getGia(),
                model.getHinh(),
                model.getTrangThai(),
                model.getMaMH());
    }
    public void delete(String MaMH){
        String sql = "DELETE FROM mathang WHERE mamh=?";
        JdbcHelper.executeUpdate(sql, MaMH);
    }
    public List<MatHang> select(){
        String sql = "SELECT * FROM mathang";
        return select(sql);
    }
    public MatHang findById(String mamh){
        String sql = "SELECT * FROM mathang WHERE mamh=?";
        List<MatHang> list = select(sql,mamh);
        return list.size() > 0 ? list.get(0) : null;
    }
    private List<MatHang> select(String sql,Object...args){
        List<MatHang>list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    MatHang model = readFromResultSet(rs);
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

    private MatHang readFromResultSet(ResultSet rs) throws SQLException {
        MatHang model = new MatHang();
        model.setMaMH(rs.getString("MaMH"));
        model.setTenSP(rs.getString("TenSP"));
        model.setGia(rs.getInt("Gia"));
        model.setHinh(rs.getString("hinh"));
        model.setTrangThai(rs.getBoolean("TrangThai"));
        return model;
    }
}
