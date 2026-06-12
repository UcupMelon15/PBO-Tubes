package com.mycompany.tugaspboyusufmaulana.TUBES;

import com.mycompany.tugaspboyusufmaulana.Barang;
import com.mycompany.tugaspboyusufmaulana.Barang_DAO;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Kelola_Barang extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Kelola_Barang.class.getName());
    private int selectedId = -1;

    public Kelola_Barang() {
        initComponents();
        tampilData();
    }

    private void tampilData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            Barang_DAO dao = new Barang_DAO();
            ResultSet rs = dao.getAllBarang();
            if (rs != null) {
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga"),
                        rs.getString("kondisi_barang"),
                        rs.getString("status_barang")
                    };
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Harga Barang");
        jLabel2.setText("Status Barang");
        jLabel3.setText("Kondisi Barang");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Kosong" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel4.setText("Kelola Barang");

        // BUG 8 FIX: jButton1 sekarang berlabel "Tambah" dan punya ActionListener yang benar
        jButton1.setText("Tambah");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        // BUG 8 FIX: jButton2 sekarang berlabel "Reset" dan hanya mereset form (bukan tambah)
        jButton2.setText("Reset");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Edit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(this::jButton3ActionPerformed);

        // BUG 8 FIX: jButton4 sekarang berlabel "Hapus" dan punya ActionListener yang benar
        jButton4.setText("Hapus");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nama Barang", "Harga Barang", "Kondisi Barang", "Status Barang"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Nama Barang");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekas", "Baru" }));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jComboBox2, 0, 170, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout)))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BUG 8 FIX: jButton1 sekarang menjalankan logika Tambah
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Barang barang = new Barang();
        barang.setNamaBarang(jTextField1.getText());
        barang.setHarga(Double.parseDouble(jTextField3.getText()));
        barang.setStatusBarang(jComboBox1.getSelectedItem().toString());
        barang.setKondisiBarang(jComboBox2.getSelectedItem().toString());

        Barang_DAO dao = new Barang_DAO();
        dao.tambahBarang(barang);
        tampilData();

        // Reset form setelah tambah
        jTextField1.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        javax.swing.JOptionPane.showMessageDialog(this, "Barang berhasil ditambahkan!");
    }//GEN-LAST:event_jButton1ActionPerformed

    // BUG 8 FIX: jButton2 sekarang hanya mereset form (tidak ada logika DB)
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        selectedId = -1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (selectedId == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data di tabel dulu ya!");
            return;
        }
        Barang barang = new Barang();
        barang.setIdBarang(selectedId);
        barang.setNamaBarang(jTextField1.getText());
        barang.setHarga(Double.parseDouble(jTextField3.getText()));
        barang.setKondisiBarang(jComboBox1.getSelectedItem().toString());
        barang.setStatusBarang(jComboBox2.getSelectedItem().toString());

        Barang_DAO dao = new Barang_DAO();
        dao.updateBarang(barang);

        javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
        tampilData();

        jTextField1.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        selectedId = -1;
    }//GEN-LAST:event_jButton3ActionPerformed

    // BUG 8 FIX: jButton4 sekarang menjalankan logika Hapus
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (selectedId == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data di tabel dulu ya!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus barang ini?", "Konfirmasi Hapus", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            Barang_DAO dao = new Barang_DAO();
            dao.hapusBarang(selectedId);
            tampilData();
            selectedId = -1;
            jTextField1.setText("");
            jTextField3.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "Barang berhasil dihapus!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            LOGIN_PAGE loginPage = new LOGIN_PAGE();
            loginPage.setVisible(true);
            java.awt.Window win = javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component) evt.getSource());
            if (win != null) {
                win.dispose();
            }
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            selectedId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            jTextField1.setText(jTable1.getValueAt(row, 1).toString());
            jTextField3.setText(jTable1.getValueAt(row, 2).toString());
            jComboBox1.setSelectedItem(jTable1.getValueAt(row, 3).toString());
            jComboBox2.setSelectedItem(jTable1.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_jButton3MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Kelola_Barang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
