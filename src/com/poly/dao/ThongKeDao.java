/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocp
 */
public class ThongKeDao {
        public List<Object[]> getDoanhThu(){
        List<Object[]> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql="{call sp_ThongKeDoanhThu}";
                rs = JdbcHelper.executeQuery(sql);
                while(rs.next()){
                    Object[] model={
                        rs.getInt("SoHD"),
                        rs.getInt("Doanhthu"),
                        rs.getString("NGAY"),
                        rs.getString("SoNgay")
                        
                    };
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
         public List<Object[]> getDoanhThuNam(int nam){
        List<Object[]> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql="{call sp_ThongKeDoanhThuNam(?)}";
                rs = JdbcHelper.executeQuery(sql, nam);
                while(rs.next()){
                    Object[] model={
                        rs.getInt("SoHD"),
                        rs.getInt("DoanhThu"),
                        rs.getString("Ngay")
                    };
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
