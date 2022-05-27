package BAI_TAP_9;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UI_BAI_9 extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private List<SanPham> lsSanPhams;

    public UI_BAI_9() {
        initComponents();
        lsSanPhams = new ArrayList<>();
        jTable1.setModel(dtm = new DefaultTableModel());
        String[] header = {"MÃ SẨN PHẨM", "TÊN SẢN PHẨM", "KHỐI LƯỢNG", "LOẠI SẢN PHẨM"};
        dtm.setColumnIdentifiers(header);
        lsSanPhams.add(new SanPham("BA0001", "BÁNH CHUỐI", 9, "Xuất Khẩu"));
        lsSanPhams.add(new SanPham("BA0002", "SỮA", 5, "Nhập Khẩu"));
        lsSanPhams.add(new SanPham("BA0003", "BIM BIM", 2, "Nhập Khẩu"));
        lsSanPhams.add(new SanPham("BA0004", "THỊT LỢN", 3, "Xuất Khẩu"));
        lsSanPhams.add(new SanPham("BA0005", "THANH LONG", 7, "Xuất Khẩu"));
        showDataTable(lsSanPhams);

        SanPham sanPham = lsSanPhams.get(0);
        TableModel tableModel = jTable1.getModel();
        txtMaSP.setText(String.valueOf(sanPham.getMaSP()));
        txtNameSP.setText(String.valueOf(sanPham.getTen()));
        txtKhoiLuong.setText(String.valueOf(sanPham.getKhoiLuong()));
        cbbLoaiSP.setSelectedItem(String.valueOf(sanPham.getLoaiSP()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNameSP = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        txtKhoiLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbLoaiSP = new javax.swing.JComboBox<>();
        btnClearForm = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tìm Kiếm: ");

        jLabel2.setText("Tìm Kiếm Tên: ");

        jLabel3.setText("Mã Sản Phẩm:");

        jLabel4.setText("Tên Sản Phẩm:");

        jLabel5.setText("Khối Lượng:");

        jLabel6.setText("Loại Sản Phẩm:");

        cbbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập Khẩu", "Xuất Khẩu" }));

        btnClearForm.setText("Clear Form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp Xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel7.setText("Table: Data");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNameSP, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                                            .addComponent(txtMaSP)
                                            .addComponent(txtKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnClearForm)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNameSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnSapXep)
                            .addComponent(btnThoat)))
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String maSP = String.valueOf(txtMaSP.getText());
        String tenSP = String.valueOf(txtNameSP.getText());
        String loai = String.valueOf(cbbLoaiSP.getSelectedItem());
        Pattern checkMa = Pattern.compile("^[B]{1}[A]{1}\\d{4}$");
        try {
            Integer.parseInt(txtKhoiLuong.getText());
            int khoiLuong = Integer.parseInt(txtKhoiLuong.getText());
            if (khoiLuong <= 0) {
                JOptionPane.showMessageDialog(rootPane, "KHỐI LƯỢNG <0 NHẬP LẠI");
                return;
            }
        } catch (Exception e) {
            if (String.valueOf(txtKhoiLuong.getText()).isEmpty() && maSP.isEmpty() && tenSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM -- TÊN SẢN PHẨM -- KHỐI LƯỢNG -- TRỐNG");
                return;
            } else if (String.valueOf(txtKhoiLuong.getText()).isEmpty() && maSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM -- KHỐI LƯỢNG -- TRỐNG");
                return;
            } else if (String.valueOf(txtKhoiLuong.getText()).isEmpty() && tenSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "TÊN SẢN PHẨM -- KHỐI LƯỢNG -- TRỐNG");
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "KHỐI LƯỢNG = 1 SỐ NGUYÊN! (NHẬP LẠI)");
                return;
            }
        }
        if (maSP.isEmpty() || tenSP.isEmpty()) {
            if (maSP.isEmpty() && tenSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "MÃ VÀ TÊN SẢN PHẨM TRỐNG");
                return;
            } else if (tenSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "TÊN SẢN PHẨM TRỐNG");
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM TRỐNG");
                return;
            }
        }
        if (checkMa.matcher(txtMaSP.getText()).find()) {
            for (int i = 0; i < lsSanPhams.size(); i++) {
                if (lsSanPhams.get(i).getMaSP().equals(txtMaSP.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM ĐÃ CÓ RỒI");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM KHÔNG DÚNG");
            return;
        }
        int khoiLuong = Integer.parseInt(txtKhoiLuong.getText());
        SanPham sanPham = new SanPham(maSP, tenSP, khoiLuong, loai);
        lsSanPhams.add(sanPham);
        showDataTable(lsSanPhams);
    }//GEN-LAST:event_btnThemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        SanPham sanPham = lsSanPhams.get(row);
        txtMaSP.setText(String.valueOf(sanPham.getMaSP()));
        txtNameSP.setText(String.valueOf(sanPham.getTen()));
        txtKhoiLuong.setText(String.valueOf(sanPham.getKhoiLuong()));
        cbbLoaiSP.setSelectedItem(String.valueOf(sanPham.getLoaiSP()));
        btnThem.setEnabled(false);
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here
        int row = jTable1.getSelectedRow();
        SanPham sanPham = lsSanPhams.get(row);
        txtMaSP.setEnabled(false);
        String tenSP = String.valueOf(txtNameSP.getText());
        String loai = String.valueOf(cbbLoaiSP.getSelectedItem());
        Pattern checkMa = Pattern.compile("[B]+[A]+[0-9]+[0-9]+[0-9]+[0-9]");

        try {
            Integer.parseInt(txtKhoiLuong.getText());
            int khoiLuong = Integer.parseInt(txtKhoiLuong.getText());
            if (khoiLuong <= 0) {
                JOptionPane.showMessageDialog(rootPane, "KHỐI LƯỢNG <0 NHẬP LẠI");
                return;
            }
        } catch (Exception e) {
            if (String.valueOf(txtKhoiLuong.getText()).isEmpty() && tenSP.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, " TÊN SẢN PHẨM -- KHỐI LƯỢNG -- TRỐNG");
                return;
            } else if (String.valueOf(txtKhoiLuong.getText()).isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "KHỐI LƯỢNG -- TRỐNG");
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "KHỐI LƯỢNG = 1 SỐ NGUYÊN! (NHẬP LẠI)");
                return;
            }
        }
        if (tenSP.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "TÊN SẢN PHẨM TRỐNG");
            return;

        }
        sanPham.setTen(String.valueOf(txtNameSP.getText()));
        sanPham.setKhoiLuong(Integer.parseInt(txtKhoiLuong.getText()));
        sanPham.setLoaiSP(String.valueOf(cbbLoaiSP.getSelectedItem()));
        showDataTable(lsSanPhams);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        // TODO add your handling code here:
        txtKhoiLuong.setText("");
        txtMaSP.setText("");
        txtNameSP.setText("");
        txtSearch.setText("");
        cbbLoaiSP.setSelectedIndex(0);
        txtMaSP.setEnabled(true);
        btnThem.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);

    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        lsSanPhams.remove(row);
        showDataTable(lsSanPhams);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        txtMaSP.setText("");
        txtKhoiLuong.setText("");
        if (txtSearch.getText().isEmpty()) {
            txtSearch.setText("");
            List<SanPham> lstSearch = new SanPhamService().timTenSanPham(lsSanPhams, String.valueOf(txtNameSP.getText()));
            showDataTable(lstSearch);
            return;
        }else if(txtNameSP.getText().isEmpty()){
            txtNameSP.setText("");
            List<SanPham> lstSearch = new SanPhamService().timTenSanPham(lsSanPhams, String.valueOf(txtSearch.getText()));
            showDataTable(lstSearch);
            return;
        }else{
            txtNameSP.setText("");
            txtSearch.setText("");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        new SanPhamService().sapXep(lsSanPhams);
        showDataTable(lsSanPhams);
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed
    public void showDataTable(List<SanPham> lstSP) {
        dtm.setRowCount(0);
        for (SanPham sanPham : lstSP) {
            dtm.addRow(sanPham.toDataRow());
        }
    }

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
            java.util.logging.Logger.getLogger(UI_BAI_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_BAI_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_BAI_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_BAI_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_BAI_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKhoiLuong;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNameSP;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
