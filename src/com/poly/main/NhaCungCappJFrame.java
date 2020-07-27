/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.main;

import com.poly.dao.NhaCungCapDAO;
import com.poly.helper.DateHelper;
import com.poly.helper.DialogHelper;
import com.poly.helper.ShareHelper;
import com.poly.models.NhaCungCap;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngocp
 */
public class NhaCungCappJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienJFrame
     */
    public NhaCungCappJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_hinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Mancc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tenNCC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_sodt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_DiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ngayhoptac = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ghichu = new javax.swing.JTextArea();
        btn_first = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_hienthi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ CUNG CẤP NGUYÊN LIỆU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabs.setForeground(new java.awt.Color(0, 102, 153));
        tabs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_hinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hinh.setForeground(new java.awt.Color(0, 204, 0));
        lbl_hinh.setText("             [Add Image]");
        lbl_hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        lbl_hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Mã nhà cung cấp:");

        txt_Mancc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_Mancc.setForeground(new java.awt.Color(0, 102, 153));
        txt_Mancc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ManccActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Tên nhà cung cấp:");

        txt_tenNCC.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_tenNCC.setForeground(new java.awt.Color(0, 102, 153));
        txt_tenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenNCCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Số điện thoại");

        txt_sodt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_sodt.setForeground(new java.awt.Color(0, 102, 153));
        txt_sodt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sodtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Địa Chỉ");

        txt_DiaChi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_DiaChi.setForeground(new java.awt.Color(0, 102, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Email");

        txt_Email.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_Email.setForeground(new java.awt.Color(0, 102, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Hình:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Ngày hợp tác");

        txt_ngayhoptac.setForeground(new java.awt.Color(0, 153, 153));
        txt_ngayhoptac.setDateFormatString("yyyy-MM-dd\n\n");
        txt_ngayhoptac.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Ghi chú");

        txt_ghichu.setColumns(20);
        txt_ghichu.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txt_ghichu.setForeground(new java.awt.Color(0, 102, 153));
        txt_ghichu.setRows(5);
        jScrollPane1.setViewportView(txt_ghichu);

        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        btn_prev.setText("<<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_them.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_them.setForeground(new java.awt.Color(0, 153, 153));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(0, 153, 153));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/xoa.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(0, 153, 153));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/update.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(0, 153, 153));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Document.png"))); // NOI18N
        btn_reset.setText("Làm mới");
        btn_reset.setMaximumSize(new java.awt.Dimension(119, 41));
        btn_reset.setMinimumSize(new java.awt.Dimension(119, 41));
        btn_reset.setPreferredSize(new java.awt.Dimension(119, 41));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_them)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_sua)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_first)
                            .addComponent(btn_prev))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_next)
                            .addComponent(btn_last))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txt_Mancc, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenNCC)
                    .addComponent(txt_DiaChi)
                    .addComponent(txt_Email)
                    .addComponent(txt_sodt)
                    .addComponent(txt_ngayhoptac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Mancc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_sodt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_first)
                            .addComponent(btn_last))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_prev)
                            .addComponent(btn_next))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_them)
                            .addComponent(btn_xoa))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sua)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ngayhoptac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tabs.addTab("Cập nhật", jPanel1);

        tbl_hienthi.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tbl_hienthi.setForeground(new java.awt.Color(0, 102, 153));
        tbl_hienthi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Email", "Số đt", "Ngày hợp tác", "GhiChú", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_hienthi.setRowHeight(26);
        tbl_hienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hienthiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_hienthi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 246, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Boy.png"))); // NOI18N
        jLabel1.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sodtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sodtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sodtActionPerformed

    private void txt_tenNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenNCCActionPerformed

    private void lbl_hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhMouseClicked
        // TODO add your handling code here:
        this.selectImage();
    }//GEN-LAST:event_lbl_hinhMouseClicked

    private void txt_ManccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ManccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ManccActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
            this.index++;
            this.edit();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        load();
        this.setStatus(true); 
//        this.showDate();
    }//GEN-LAST:event_formWindowOpened

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
            this.index = tbl_hienthi.getRowCount() - 1;
            this.edit();
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tbl_hienthiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hienthiMouseClicked
        // TODO add your handling code here:
                        if(evt.getClickCount() == 2){
            this.index = tbl_hienthi.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tbl_hienthiMouseClicked

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
            this.index = 0;
            this.edit();
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
            this.index--;
            this.edit();
    }//GEN-LAST:event_btn_prevActionPerformed

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
            java.util.logging.Logger.getLogger(NhaCungCappJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCappJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCappJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCappJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhaCungCappJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_hinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_hienthi;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Mancc;
    private javax.swing.JTextArea txt_ghichu;
    private com.toedter.calendar.JDateChooser txt_ngayhoptac;
    private javax.swing.JTextField txt_sodt;
    private javax.swing.JTextField txt_tenNCC;
    // End of variables declaration//GEN-END:variables
    int index = 0;
    NhaCungCapDAO dao = new NhaCungCapDAO();
    
    void init(){
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }
    
    void load() {
        DefaultTableModel model = (DefaultTableModel) tbl_hienthi.getModel();
        model.setRowCount(0);
        try {
            List<NhaCungCap> list = dao.select();
            for ( NhaCungCap ncc : list) {
                Object[] row = {
                    ncc.getMaNCC(),
                    ncc.getTenNCC(),
                    ncc.getDiaChi(),
                    ncc.getEmail(),
                    ncc.getSoDT(),
                    ncc.getNgayHopTac(),
                    ncc.getGhiChu(),
                    ncc.getHinh()
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

   void insert(){
        NhaCungCap model = getModel();

            try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } 
            catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
                System.out.print(e.toString());
            }
        
    }

    void update(){
        NhaCungCap model = getModel();
            try {
                dao.update(model);
                this.load();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            } 
            catch (Exception e) {
                System.out.print(e.toString());
                JOptionPane.showMessageDialog(this,"Cập nhật thất bại!");
            }
    }

    void delete(){
        if(DialogHelper.confirm(this, "Bạn thực sự muốn xóa mặt hàng này?")){
            String mancc = txt_Mancc.getText();
            try {
                dao.delete(mancc);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } 
            catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    void edit() {
        try {
            String mancc = (String) tbl_hienthi.getValueAt(this.index, 0);
            NhaCungCap model = dao.findById(mancc);
            if(model != null){
                this.setModel(model);
                this.setStatus(false);
            }
        } 
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear(){
        this.setModel(new NhaCungCap());
        this.setStatus(true);
    }
    
    void setModel(NhaCungCap model){
        txt_Mancc.setText(model.getMaNCC());
        txt_tenNCC.setText(model.getTenNCC());
        txt_DiaChi.setText(model.getDiaChi());
        txt_Email.setText(model.getEmail());
        txt_sodt.setText(String.valueOf(model.getSoDT()));
        txt_ngayhoptac.setDate(model.getNgayHopTac());
        txt_ghichu.setText(model.getGhiChu());
        lbl_hinh.setToolTipText(model.getHinh());
        if(model.getHinh() != null){
            lbl_hinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
        
    }  
    NhaCungCap getModel(){
        NhaCungCap model = new NhaCungCap();
        model.setMaNCC(txt_Mancc.getText());
        model.setTenNCC(txt_tenNCC.getText());
        model.setDiaChi(txt_DiaChi.getText());
        model.setEmail(txt_Email.getText());
        model.setSoDT(txt_sodt.getText());
//        model.setNgayHopTac(DateHelper.toDate(txt_ngayhoptac.getDateFormatString()));
        model.setGhiChu(txt_ghichu.getText());
        model.setHinh(lbl_hinh.getToolTipText());
        return model;
    }

    void setStatus(boolean insertable){
        txt_Mancc.setEditable(insertable);
//        txt_ngayhoptac.setEnabled(insertable);
        btn_them.setEnabled(insertable);
        btn_sua.setEnabled(!insertable);
        btn_xoa.setEnabled(!insertable);
                txt_ngayhoptac.setEnabled(false);

        boolean first = this.index > 0;
        boolean last = this.index < tbl_hienthi.getRowCount() - 1;
        btn_first.setEnabled(!insertable && first);
        btn_prev.setEnabled(!insertable && first);
        btn_next.setEnabled(!insertable && last);
        btn_last.setEnabled(!insertable && last);
    }
        void selectImage() {
        if(filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            if(ShareHelper.saveLogo(file)){
                
                lbl_hinh.setIcon(ShareHelper.readLogo(file.getName()));
                lbl_hinh.setToolTipText(file.getName());
            }
        }
    }
        void openMain(){
            int hoi = JOptionPane.showConfirmDialog(null, "Bạn có thực sự muốn trở về giao diện chính?",
                null, JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION){
        new GiaoDienBanHang().setVisible(true);
        }
        }
//        void showDate(){
//        Date d = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//       txt_ngayhoptac.set(sf.format(d));
//        }
}