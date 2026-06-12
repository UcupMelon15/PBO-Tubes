package com.mycompany.tugaspboyusufmaulana.TUBES;

import com.mycompany.tugaspboyusufmaulana.Barang_DAO;

public class LandingPage_Penjual extends javax.swing.JFrame {
    private int selectedRow = -1;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LandingPage_Penjual.class.getName());

    public LandingPage_Penjual() {
        initComponents();
        tampilDataBarang(); // BUG 6 FIX: Load data dari DB saat form pertama dibuka
    }

    // BUG 6 FIX: Method ini sebelumnya tidak ada sama sekali,
    // sehingga tabelBarang selalu kosong saat form dibuka.
    private void tampilDataBarang() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelBarang.getModel();
        model.setRowCount(0);

        try {
            Barang_DAO dao = new Barang_DAO();
            java.sql.ResultSet rs = dao.getAllBarang();

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

        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnHapus.setText("Hapus Barang");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnRefresh.setText("Refresh Tabel");
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nama Barang", "Harga Barang", "Kondisi Barang", "Status Barang"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setText("Dashboard Penjual");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnUpdate.setText("Update Barang");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnTambah.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnTambah.setText("Tambah Barang");
        btnTambah.addActionListener(this::btnTambahActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambah)
                .addGap(7, 7, 7)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih barang pada tabel terlebih dahulu!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus barang ini?", "Konfirmasi Hapus", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            int idBarang = Integer.parseInt(tabelBarang.getValueAt(selectedRow, 0).toString());
            Barang_DAO dao = new Barang_DAO();
            dao.hapusBarang(idBarang);
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelBarang.getModel();
            model.removeRow(selectedRow);
            javax.swing.JOptionPane.showMessageDialog(this, "Barang berhasil dihapus!");
            selectedRow = -1;
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // BUG 6 FIX: Refresh sekarang reload data dari DB, bukan hanya clear selection
        tabelBarang.clearSelection();
        selectedRow = -1;
        tampilDataBarang();
        javax.swing.JOptionPane.showMessageDialog(this, "Tabel disinkronisasi ulang dengan database.");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        selectedRow = tabelBarang.getSelectedRow();
    }//GEN-LAST:event_tabelBarangMouseClicked

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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih barang pada tabel terlebih dahulu!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        String namaBarang = tabelBarang.getValueAt(selectedRow, 1).toString();
        Kelola_Barang kelolaPage = new Kelola_Barang();
        kelolaPage.setVisible(true);
        javax.swing.JOptionPane.showMessageDialog(this, "Membuka Kelola Barang untuk meng-update: " + namaBarang, "Informasi", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Kelola_Barang kelolaPage = new Kelola_Barang();
        kelolaPage.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new LandingPage_Penjual().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    // End of variables declaration//GEN-END:variables
}
