/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import com.poly.models.NguyenLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocp
 */
public class NguyenLieuDAO {
             public void insert(NguyenLieu model){
        String sql ="INSERT INTO nguyenlieu (manl, tennl, ngaynhap, soluong, gia, hinh, trangthai, maloai, manhacungcap, tenloai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getManl(),
                model.getTennl(),
                model.getNgaynhap(),
                model.getSoluong(),
                model.getGia(),
                model.getHinh(),
                model.getTrangthai(),
                model.getMaloai(),
                model.getMancc(),
                model.getTenloai()
                );
    }
    public void update(NguyenLieu model){
        String sql = "UPDATE nguyenlieu SET tennl=?, soluong=?, gia=?, hinh=?, trangthai=?, maloai=?, manhacungcap=?, tenloai=? WHERE manl=?";
        JdbcHelper.executeUpdate(sql,
                model.getTennl(),
                model.getSoluong(),
                model.getGia(),
                model.getHinh(),
                model.getTrangthai(),
                model.getMaloai(),
                model.getMancc(),
                model.getTenloai(),
                model.getManl()
        );
    }
    public void delete(String Manl){
        String sql = "DELETE FROM nguyenlieu WHERE nguyenlieu=?";
        JdbcHelper.executeUpdate(sql, Manl);
    }
    public List<NguyenLieu> select(){
        String sql = "SELECT * FROM nguyenlieu";
        return select(sql);
    }
    public NguyenLieu findById(String manl){
        String sql = "SELECT * FROM nguyenlieu WHERE manl=?";
        List<NguyenLieu> list = select(sql,manl);
        return list.size() > 0 ? list.get(0) : null;
    }
    private List<NguyenLieu> select(String sql,Object...args){
        List<NguyenLieu>list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    NguyenLieu model = readFromResultSet(rs);
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

    private NguyenLieu readFromResultSet(ResultSet rs) throws SQLException {
        NguyenLieu model = new NguyenLieu();
        model.setManl(rs.getString("manl"));
        model.setTennl(rs.getString("tennl"));
        model.setNgaynhap(rs.getDate("ngaynhap"));
        model.setSoluong(rs.getInt("soluong"));
        model.setGia(rs.getInt("gia"));
        model.setHinh(rs.getString("hinh"));
        model.setTrangthai(rs.getBoolean("TrangThai"));
        model.setMaloai(rs.getString("maloai"));
        model.setMancc(rs.getString("manhacungcap"));
        model.setTenloai(rs.getString("tenloai"));
        return model;
    }
}
