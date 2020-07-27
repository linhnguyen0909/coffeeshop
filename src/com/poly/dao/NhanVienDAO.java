/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;




import com.poly.helper.JdbcHelper;
import com.poly.models.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoai Linh
 */
public class NhanVienDAO {

    public void insert(NhanVien model) {
        String sql = "INSERT INTO nhanvien (manv, matkhau, tennv, hinh, phanquyen) VALUES (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, 
                model.getManv(), 
                model.getMatkhau(), 
                model.getTennv(), 
                model.getHinh(),
                model.getPhanquyen());
    }

    public void update(NhanVien model) {
        String sql = "UPDATE nhanvien SET matkhau=?, tennv=?, hinh=? ,phanquyen=? WHERE manv=?";
        JdbcHelper.executeUpdate(sql, 

                model.getMatkhau(), 
                model.getTennv(), 
                model.getHinh(),
                model.getPhanquyen(),
                model.getManv());
    }

    public void delete(String manv) {
        String sql = "DELETE FROM NhanVien WHERE manv=?";
        JdbcHelper.executeUpdate(sql, manv);
    }

    public List<NhanVien> select() {
        String sql = "SELECT * FROM nhanvien";
        return select(sql);
    }

    public NhanVien findById(String manv) {
        String sql = "SELECT * FROM nhanvien WHERE manv=?";
        List<NhanVien> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhanVien> select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
       NhanVien model=new NhanVien();
        model.setManv(rs.getString("manv"));
        model.setMatkhau(rs.getString("matkhau"));
        model.setTennv(rs.getString("tennv"));
         model.setHinh(rs.getString("hinh"));
        model.setPhanquyen(rs.getBoolean("phanquyen"));
       
        return model;
    }
}
