/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import com.poly.models.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocp
 */
public class NhaCungCapDAO {
         public void insert(NhaCungCap model){
        String sql ="INSERT INTO nhacungcap (manhacungcap, tennhacungcap, diachi, email, sodt, ngayhoptac, ghichu, hinh) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaNCC(),
                model.getTenNCC(),
                model.getDiaChi(),
                model.getEmail(),
                model.getSoDT(),
                model.getNgayHopTac(),
                model.getGhiChu(),
                model.getHinh());
    }
    public void update(NhaCungCap model){
        String sql = "UPDATE nhacungcap SET tennhacungcap=?, diachi=?, email=?, sodt=?, ngayhoptac=?, ghichu=?, hinh=? WHERE manhacungcap=?";
        JdbcHelper.executeUpdate(sql,
                model.getTenNCC(),
                model.getDiaChi(),
                model.getEmail(),
                model.getSoDT(),
                model.getNgayHopTac(),
                model.getGhiChu(),
                model.getHinh(),
                model.getMaNCC()
        );
    }
    public void delete(String Mancc){
        String sql = "DELETE FROM nhacungcap WHERE manhacungcap=?";
        JdbcHelper.executeUpdate(sql, Mancc);
    }
    public List<NhaCungCap> select(){
        String sql = "SELECT * FROM nhacungcap";
        return select(sql);
    }
    public NhaCungCap findById(String mancc){
        String sql = "SELECT * FROM nhacungcap WHERE manhacungcap=?";
        List<NhaCungCap> list = select(sql,mancc);
        return list.size() > 0 ? list.get(0) : null;
    }
    private List<NhaCungCap> select(String sql,Object...args){
        List<NhaCungCap>list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    NhaCungCap model = readFromResultSet(rs);
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

    private NhaCungCap readFromResultSet(ResultSet rs) throws SQLException {
        NhaCungCap model = new NhaCungCap();
        model.setMaNCC(rs.getString("manhacungcap"));
        model.setTenNCC(rs.getString("tennhacungcap"));
        model.setDiaChi(rs.getString("diachi"));
        model.setEmail(rs.getString("email"));
        model.setSoDT(rs.getString("sodt"));
        model.setGhiChu(rs.getString("ghichu"));
        model.setNgayHopTac(rs.getDate("ngayhoptac"));
        model.setHinh(rs.getString("hinh"));
        return model;
    }
}
