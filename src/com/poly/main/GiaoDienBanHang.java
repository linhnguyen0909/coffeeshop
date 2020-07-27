/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.main;

import com.poly.helper.DialogHelper;
import com.poly.helper.ShareHelper;
import com.poly.models.MatHang;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ngocp
 */
public class GiaoDienBanHang extends javax.swing.JFrame {
    /**
     * Creates new form GiaoDienBanHang
     */
    public GiaoDienBanHang() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_hoatdong = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_mathang = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_nhanvien = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_kho = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btn_order = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btn_cungcap = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lbl_gioithieu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Mnu_hoatdong = new javax.swing.JMenuItem();
        Mnu_mathang = new javax.swing.JMenuItem();
        Mnu_doitac = new javax.swing.JMenuItem();
        Mnu_nhanvien = new javax.swing.JMenuItem();
        Mnu_kho = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnu_lichsu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ CỬA HÀNG");

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        btn_hoatdong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_hoatdong.setForeground(new java.awt.Color(0, 51, 51));
        btn_hoatdong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Bar chart.png"))); // NOI18N
        btn_hoatdong.setText("Hoạt Động");
        btn_hoatdong.setFocusable(false);
        btn_hoatdong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hoatdong.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_hoatdong.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_hoatdong.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_hoatdong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_hoatdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoatdongActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_hoatdong);
        jToolBar1.add(jSeparator2);

        btn_mathang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_mathang.setForeground(new java.awt.Color(0, 51, 51));
        btn_mathang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Full basket.png"))); // NOI18N
        btn_mathang.setText("Mặt Hàng");
        btn_mathang.setFocusable(false);
        btn_mathang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mathang.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_mathang.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_mathang.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_mathang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mathangActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_mathang);
        jToolBar1.add(jSeparator3);

        btn_nhanvien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_nhanvien.setForeground(new java.awt.Color(0, 51, 51));
        btn_nhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Boy.png"))); // NOI18N
        btn_nhanvien.setText("Nhân Viên");
        btn_nhanvien.setFocusable(false);
        btn_nhanvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nhanvien.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_nhanvien.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_nhanvien.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_nhanvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nhanvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nhanvien);
        jToolBar1.add(jSeparator4);

        btn_kho.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_kho.setForeground(new java.awt.Color(0, 51, 51));
        btn_kho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Box.png"))); // NOI18N
        btn_kho.setText("Kho");
        btn_kho.setFocusable(false);
        btn_kho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_kho.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_kho.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_kho.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_kho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_kho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_kho);
        jToolBar1.add(jSeparator5);

        btn_order.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_order.setForeground(new java.awt.Color(0, 51, 51));
        btn_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Edit.png"))); // NOI18N
        btn_order.setText("Order");
        btn_order.setFocusable(false);
        btn_order.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_order.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_order.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_order.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_order.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_order);
        jToolBar1.add(jSeparator6);

        btn_cungcap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_cungcap.setForeground(new java.awt.Color(0, 51, 51));
        btn_cungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Bricks.png"))); // NOI18N
        btn_cungcap.setText("Cung cấp");
        btn_cungcap.setFocusable(false);
        btn_cungcap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cungcap.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_cungcap.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_cungcap.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_cungcap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cungcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cungcapActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cungcap);

        btn_thoat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(0, 51, 51));
        btn_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Stop.png"))); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.setFocusable(false);
        btn_thoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_thoat.setMaximumSize(new java.awt.Dimension(100, 70));
        btn_thoat.setMinimumSize(new java.awt.Dimension(100, 70));
        btn_thoat.setPreferredSize(new java.awt.Dimension(100, 70));
        btn_thoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_thoat);

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(0, 51, 51));
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Alarm.png"))); // NOI18N
        lblDongHo.setText("10:55 PM");
        lblDongHo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDongHo))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDongHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        lbl_gioithieu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_gioithieu.setForeground(new java.awt.Color(0, 51, 51));
        lbl_gioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Info.png"))); // NOI18N
        lbl_gioithieu.setText("Giới Thiệu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/Homiefinal12.PNG"))); // NOI18N

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));

        jMenu3.setForeground(new java.awt.Color(0, 153, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Menu32.png"))); // NOI18N
        jMenu3.setText("Menu");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mnu_hoatdong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Mnu_hoatdong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Bar chart.png"))); // NOI18N
        Mnu_hoatdong.setText("Hoạt Động");
        Mnu_hoatdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mnu_hoatdongActionPerformed(evt);
            }
        });
        jMenu3.add(Mnu_hoatdong);

        Mnu_mathang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Mnu_mathang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Full basket.png"))); // NOI18N
        Mnu_mathang.setText("Mặt hàng");
        Mnu_mathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mnu_mathangActionPerformed(evt);
            }
        });
        jMenu3.add(Mnu_mathang);

        Mnu_doitac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Mnu_doitac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Handshake.png"))); // NOI18N
        Mnu_doitac.setText("Đối tác");
        Mnu_doitac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mnu_doitacActionPerformed(evt);
            }
        });
        jMenu3.add(Mnu_doitac);

        Mnu_nhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        Mnu_nhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Boy.png"))); // NOI18N
        Mnu_nhanvien.setText("Nhân viên");
        Mnu_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mnu_nhanvienActionPerformed(evt);
            }
        });
        jMenu3.add(Mnu_nhanvien);

        Mnu_kho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        Mnu_kho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Box.png"))); // NOI18N
        Mnu_kho.setText("Kho nguyên liệu");
        Mnu_kho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mnu_khoActionPerformed(evt);
            }
        });
        jMenu3.add(Mnu_kho);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Clien list.png"))); // NOI18N
        jMenuItem1.setText("Giới thiệu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        mnu_lichsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnu_lichsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Address book.png"))); // NOI18N
        mnu_lichsu.setText("Lịch sử");
        mnu_lichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_lichsuActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_lichsu);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_gioithieu, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_gioithieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mnu_hoatdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mnu_hoatdongActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_Mnu_hoatdongActionPerformed

    private void Mnu_mathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mnu_mathangActionPerformed
        // TODO add your handling code here:
        this.openMatHang();
    }//GEN-LAST:event_Mnu_mathangActionPerformed

    private void Mnu_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mnu_nhanvienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_Mnu_nhanvienActionPerformed

    private void Mnu_khoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mnu_khoActionPerformed
        // TODO add your handling code here:
        this.openKho();
    }//GEN-LAST:event_Mnu_khoActionPerformed

    private void Mnu_doitacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mnu_doitacActionPerformed
        // TODO add your handling code here:
        this.opennhacungcap();
    }//GEN-LAST:event_Mnu_doitacActionPerformed

    private void btn_hoatdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoatdongActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_btn_hoatdongActionPerformed

    private void btn_mathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mathangActionPerformed
        // TODO add your handling code here:
        this.openMatHang();
    }//GEN-LAST:event_btn_mathangActionPerformed

    private void btn_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nhanvienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_btn_nhanvienActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderActionPerformed
        // TODO add your handling code here:
        this.openOrder();
    }//GEN-LAST:event_btn_orderActionPerformed

    private void btn_khoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoActionPerformed
        // TODO add your handling code here:
        this.openKho();
    }//GEN-LAST:event_btn_khoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new InformationJFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnu_lichsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_lichsuActionPerformed
        // TODO add your handling code here:
        new LichSu().setVisible(true);
    }//GEN-LAST:event_mnu_lichsuActionPerformed

    private void btn_cungcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cungcapActionPerformed
        // TODO add your handling code here:
        this.opennhacungcap();
    }//GEN-LAST:event_btn_cungcapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Mnu_doitac;
    private javax.swing.JMenuItem Mnu_hoatdong;
    private javax.swing.JMenuItem Mnu_kho;
    private javax.swing.JMenuItem Mnu_mathang;
    private javax.swing.JMenuItem Mnu_nhanvien;
    private javax.swing.JButton btn_cungcap;
    private javax.swing.JButton btn_hoatdong;
    private javax.swing.JButton btn_kho;
    private javax.swing.JButton btn_mathang;
    private javax.swing.JButton btn_nhanvien;
    private javax.swing.JButton btn_order;
    private javax.swing.JButton btn_thoat;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lbl_gioithieu;
    private javax.swing.JMenuItem mnu_lichsu;
    // End of variables declaration//GEN-END:variables
    void init() {
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
        
        this.openWelcome();
        this.openLogin();
}
        void openLogin(){
        new DangNhapDialog(this, true).setVisible(true);
    }    
    void openWelcome(){
        new ChaoDialog(this, true).setVisible(true);
    }
    
        void openThongKe(int index){
            new ThongKeJFramee(index).setVisible(true);
    }
    
    void openNhanVien(){
            new NhanVienJFrame().setVisible(true); 
    }
    void openMatHang(){
        new MatHangJFrame().setVisible(true);
    }
    
    void openOrder(){
        new OrderJFrame().setVisible(true);
    }
    
    void openKho(){
        new KhoJFrame().setVisible(true);
    }
    void opennhacungcap(){
        new NhaCungCappJFrame().setVisible(true);
}
    void exit(){
        if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
            System.exit(0);
        }
    }
}