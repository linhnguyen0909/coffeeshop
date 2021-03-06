/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.main;

import com.poly.dao.MatHangDao;
import com.poly.helper.DialogHelper;
import com.poly.helper.ShareHelper;
import com.poly.models.MatHang;
import java.awt.Color;
import java.awt.Dialog;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngocp
 */
public class MatHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MatHang
     */
    public MatHangJFrame() {
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

        filechooser = new javax.swing.JFileChooser();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_hinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_maMH = new javax.swing.JLabel();
        txt_MaMH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tenMH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_GiaTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        rdo_hethang = new javax.swing.JRadioButton();
        rdo_conhang = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hienthi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ MẶT HÀNG");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabs.setForeground(new java.awt.Color(0, 102, 153));
        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_hinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hinh.setForeground(new java.awt.Color(0, 204, 0));
        lbl_hinh.setText("           [Add Image]");
        lbl_hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        lbl_hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hình logo");

        lbl_maMH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_maMH.setText("Mã mặt hàng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Tên mặt hàng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Giá tiền:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Trạng thái:");

        btn_them.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_them.setForeground(new java.awt.Color(0, 102, 153));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(0, 102, 153));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/xoa.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(0, 102, 153));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment/IconJava/update.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_moi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_moi.setForeground(new java.awt.Color(0, 102, 153));
        btn_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Document.png"))); // NOI18N
        btn_moi.setText("Mới");
        btn_moi.setMaximumSize(new java.awt.Dimension(93, 41));
        btn_moi.setMinimumSize(new java.awt.Dimension(93, 41));
        btn_moi.setPreferredSize(new java.awt.Dimension(93, 41));
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

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

        rdo_hethang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdo_hethang.setSelected(true);
        rdo_hethang.setText("Hết hàng");

        rdo_conhang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdo_conhang.setText("Còn hàng");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Control panel.png"))); // NOI18N
        jButton1.setText("Trở về");
        jButton1.setMaximumSize(new java.awt.Dimension(105, 45));
        jButton1.setMinimumSize(new java.awt.Dimension(105, 45));
        jButton1.setPreferredSize(new java.awt.Dimension(105, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_them)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn_first)
                                                    .addComponent(btn_prev))
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn_last)
                                                    .addComponent(btn_next))))))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdo_hethang)
                                        .addGap(26, 26, 26)
                                        .addComponent(rdo_conhang))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(lbl_maMH)
                                        .addComponent(txt_MaMH, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_tenMH)
                                        .addComponent(jLabel5)
                                        .addComponent(txt_GiaTien)))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_xoa)
                        .addGap(77, 77, 77)
                        .addComponent(btn_sua)
                        .addGap(78, 78, 78)
                        .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_maMH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_next)
                            .addComponent(btn_prev)
                            .addComponent(rdo_hethang)
                            .addComponent(rdo_conhang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_first)
                            .addComponent(btn_last))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua)
                    .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tabs.addTab("Cập nhật", jPanel1);

        tbl_hienthi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbl_hienthi.setForeground(new java.awt.Color(0, 102, 153));
        tbl_hienthi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã mặt hàng", "Tên mặt hàng", "Giá tiền", "Hình", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_hienthi.setGridColor(new java.awt.Color(0, 102, 153));
        tbl_hienthi.setRowHeight(25);
        tbl_hienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hienthiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hienthi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        tabs.addTab("Danh sách", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Bricks.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ MẶT HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formWindowOpened

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

    private void lbl_hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhMouseClicked
        // TODO add your handling code here:
        this.selectImage();
        
    }//GEN-LAST:event_lbl_hinhMouseClicked

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

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
                this.index++;
                this.edit();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.openMain();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MatHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hinh;
    private javax.swing.JLabel lbl_maMH;
    private javax.swing.JRadioButton rdo_conhang;
    private javax.swing.JRadioButton rdo_hethang;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_hienthi;
    private javax.swing.JTextField txt_GiaTien;
    private javax.swing.JTextField txt_MaMH;
    private javax.swing.JTextField txt_tenMH;
    // End of variables declaration//GEN-END:variables
    int index = 0;
    MatHangDao dao = new MatHangDao();
    
    void init(){
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }
    
    void load() {
        DefaultTableModel model = (DefaultTableModel) tbl_hienthi.getModel();
        model.setRowCount(0);
        try {
            List<MatHang> list = dao.select();
            for (MatHang mh : list) {
                Object[] row = {
                    mh.getMaMH(),
                    mh.getTenSP(),
                    mh.getGia(),
                    mh.getHinh(),
                    mh.getTrangThai()?"Hết hàng":"Còn hàng",
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

   void insert(){
        MatHang model = getModel();

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
        MatHang model = getModel();
            try {
                dao.update(model);
                this.load();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Cập nhật thất bại!");
            }
    }

    void delete(){
        if(DialogHelper.confirm(this, "Bạn thực sự muốn xóa mặt hàng này?")){
            String mamh = txt_MaMH.getText();
            try {
                dao.delete(mamh);
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
            String mamh = (String) tbl_hienthi.getValueAt(this.index, 0);
            MatHang model = dao.findById(mamh);
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
        this.setModel(new MatHang());
        this.setStatus(true);
    }
    
    void setModel(MatHang model){
        txt_MaMH.setText(model.getMaMH());
        txt_tenMH.setText(model.getTenSP());
        txt_GiaTien.setText(String.valueOf(model.getGia()));
        lbl_hinh.setToolTipText(model.getHinh());
        if(model.getHinh() != null){
            lbl_hinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
        rdo_hethang.setSelected(model.getTrangThai());
        rdo_conhang.setSelected(!model.getTrangThai());
    }
    MatHang getModel(){
        MatHang model = new MatHang();
        model.setMaMH(txt_MaMH.getText());
        model.setTenSP(txt_tenMH.getText());
        model.setGia( Integer.valueOf(txt_GiaTien.getText()));
        model.setHinh(lbl_hinh.getToolTipText());
        model.setTrangThai(rdo_hethang.isSelected());
        return model;
    }

    void setStatus(boolean insertable){
        txt_MaMH.setEditable(insertable);
        btn_them.setEnabled(insertable);
        btn_sua.setEnabled(!insertable);
        btn_xoa.setEnabled(!insertable);

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
}
