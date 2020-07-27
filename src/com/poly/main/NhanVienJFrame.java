/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.main;

import com.poly.dao.NhanVienDAO;
import com.poly.helper.DialogHelper;
import com.poly.helper.ShareHelper;
import com.poly.models.NhanVien;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hoai Linh
 */
public class NhanVienJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhanVien
     */
    String imageName = null;
    public NhanVienJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    int index = 0; // vị trí của nhân viên đang hiển thị trên form 
    NhanVienDAO dao = new NhanVienDAO();

    void init() {
        setIconImage(ShareHelper.APP_ICON);
        
    }
 public boolean check() {
        if (txt_manv.getText().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "Xin nhập mã nhân viên");
            txt_manv.setBackground(Color.YELLOW);
           txt_manv.requestFocus();
            return false;
        }
         else if (txt_mk.getText().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "nhập mật khẩu");
               txt_mk.setBackground(Color.YELLOW);
            txt_mk.requestFocus();
            return false;
         }else if (txt_nhaplaimk.getText().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "nhập xác nhận mật khẩu");
               txt_nhaplaimk.setBackground(Color.YELLOW);
            txt_nhaplaimk.requestFocus();
            return false;
         }else if (!(txt_mk.getText().length()>=3)) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu phải lớn hơn hoặc bằng 3 kí tự");
               txt_mk.setBackground(Color.YELLOW);
            txt_mk.requestFocus();
            return false;
        } else if ((txt_mk.equals(txt_nhaplaimk))) {
            JOptionPane.showMessageDialog(this, "xác nhận mật khẩu chưa trùng khớp");
               txt_nhaplaimk.setBackground(Color.YELLOW);
            txt_nhaplaimk.requestFocus();
            return false;
        }else if (txt_hoten.getText().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "chưa nhập tên");
               txt_hoten.setBackground(Color.YELLOW);
            txt_hoten.requestFocus();
            return false;
         }else if (!rdonhnvien.isSelected() && !rdotruongphong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn vai trò");
            return false;
        }
        txt_manv.setBackground(Color.WHITE);
        txt_mk.setBackground(Color.WHITE);
        txt_nhaplaimk.setBackground(Color.WHITE);
        txt_hoten.setBackground(Color.WHITE);
        return true;
    }
    void load() {
        DefaultTableModel model = (DefaultTableModel) tbltable.getModel();
        model.setRowCount(0);
        try {

            List<NhanVien> list = dao.select();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getManv(),
                    nv.getMatkhau(),
                    nv.getTennv(),
                    nv.getHinh(),
                    nv.getPhanquyen() ? "Quản lí" : "Nhân viên"
                    
                };
                        
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
 
    void insert() {
        NhanVien model = getModel();

        String confirm = new String(txt_manv.getText());
        if ((confirm.equals(model.getManv()))) {
           try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        } else {
            DialogHelper.alert(this, "Trùng người dùng");
        }
    }

    void update() {
        NhanVien model = getModel();

        String confirm = new String(txt_nhaplaimk.getText());
        if (!confirm.equals(model.getMatkhau())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                dao.update(model);
                this.load();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                System.out.print(e.toString());
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            String manv = txt_manv.getText();
            try {
                dao.delete(manv);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    void edit() {
        try {
            String manv = (String) tbltable.getValueAt(this.index, 0);
            NhanVien model = dao.findById(manv);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        this.setModel(new NhanVien());
        this.setStatus(true);
    }

    void setModel(NhanVien model) {
        txt_manv.setText(model.getManv());
        txt_hoten.setText(model.getTennv());
        txt_mk.setText(model.getMatkhau());
        txt_nhaplaimk.setText(model.getMatkhau());
        lbl_hinh.setToolTipText(model.getHinh());
        if(model.getHinh() != null){
            lbl_hinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
       rdotruongphong.setSelected(model.getPhanquyen());
        rdonhnvien.setSelected(!model.getPhanquyen());
    }

    NhanVien getModel() {
        NhanVien model = new NhanVien();
        model.setManv(txt_manv.getText());
        model.setTennv(txt_hoten.getText());
        model.setMatkhau(new String(txt_mk.getText()));
        model.setHinh(lbl_hinh.getToolTipText());
        model.setPhanquyen(rdotruongphong.isSelected());
        return model;
    }

    void setStatus(boolean insertable) {
        txt_manv.setEditable(insertable);
        btninsert.setEnabled(insertable);
        btnupdate.setEnabled(!insertable);
        btndelete.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tbltable.getRowCount() - 1;
        btnfirt.setEnabled(!insertable && first);
        btnpre.setEnabled(!insertable && first);
        btnnext.setEnabled(!insertable && last);
        btnlast.setEnabled(!insertable && last);
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        filechooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdotruongphong = new javax.swing.JRadioButton();
        rdonhnvien = new javax.swing.JRadioButton();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnfirt = new javax.swing.JButton();
        txt_mk = new javax.swing.JPasswordField();
        txt_nhaplaimk = new javax.swing.JPasswordField();
        lbl_hinh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltable = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Boy.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        tabs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabs.setForeground(new java.awt.Color(0, 102, 153));
        tabs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Mã nhân viên");

        txt_manv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_manvActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Xác nhận mật khẩu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Họ tên");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Vai trò");

        buttonGroup1.add(rdotruongphong);
        rdotruongphong.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdotruongphong.setForeground(new java.awt.Color(0, 102, 153));
        rdotruongphong.setText("Quản lý");

        buttonGroup1.add(rdonhnvien);
        rdonhnvien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdonhnvien.setForeground(new java.awt.Color(0, 102, 153));
        rdonhnvien.setText("Nhân viên");
        rdonhnvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdonhnvienActionPerformed(evt);
            }
        });

        btninsert.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btninsert.setForeground(new java.awt.Color(0, 102, 153));
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Add.png"))); // NOI18N
        btninsert.setText("Thêm");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 102, 153));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Edit.png"))); // NOI18N
        btnupdate.setText("Sửa");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 102, 153));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Delete.png"))); // NOI18N
        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnnew.setForeground(new java.awt.Color(0, 102, 153));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Document.png"))); // NOI18N
        btnnew.setText("Mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnpre.setText("<<");
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });

        btnfirt.setText("|<");
        btnfirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirtActionPerformed(evt);
            }
        });

        lbl_hinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hinh.setForeground(new java.awt.Color(0, 204, 0));
        lbl_hinh.setText("           [Add Image]");
        lbl_hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        lbl_hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhMouseClicked(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdotruongphong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdonhnvien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btninsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnew)))
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nhaplaimk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_mk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_manv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_hoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnfirt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlast)
                                .addGap(124, 124, 124))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(txt_mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnfirt)
                        .addComponent(btnpre)
                        .addComponent(btnnext)
                        .addComponent(btnlast)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdotruongphong)
                    .addComponent(rdonhnvien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnnew))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabs.addTab("Cập Nhật", jPanel1);

        tbltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Mật khẩu", "Họ tên", "Hình", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbltable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbltableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 155, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdonhnvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdonhnvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdonhnvienActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formWindowOpened

    private void tbltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() ==2) {
            this.index = tbltable.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tbltableMouseClicked

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        if (check()) {
            this.insert();
        }

    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnfirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirtActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnfirtActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        this.index = tbltable.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnlastActionPerformed

    private void tbltableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbltableAncestorAdded

    }//GEN-LAST:event_tbltableAncestorAdded

    private void lbl_hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhMouseClicked
        // TODO add your handling code here:
        this.selectImage();

    }//GEN-LAST:event_lbl_hinhMouseClicked

    private void txt_manvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_manvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_manvActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfirt;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpre;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hinh;
    private javax.swing.JRadioButton rdonhnvien;
    private javax.swing.JRadioButton rdotruongphong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbltable;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JPasswordField txt_mk;
    private javax.swing.JPasswordField txt_nhaplaimk;
    // End of variables declaration//GEN-END:variables
}
