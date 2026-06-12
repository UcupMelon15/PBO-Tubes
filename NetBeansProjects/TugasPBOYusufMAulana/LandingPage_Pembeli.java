package com.mycompany.tugaspboyusufmaulana.TUBES;

import com.mycompany.tugaspboyusufmaulana.Barang_DAO;

public class LandingPage_Pembeli extends javax.swing.JFrame {
    private int selectedRow = -1;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LandingPage_Pembeli.class.getName());

    public LandingPage_Pembeli() {
        initComponents();
        tampilDataKatalog();
    }

    private void tampilDataKatalog() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelKatalog.getModel();
        model.setRowCount(0);

        try {
            Barang_DAO dao = new Barang_DAO();
            java.sql.ResultSet rs = dao.getBarangTersedia();

            if (rs != null) {
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getString("kondisi_barang"),
                        rs.getDouble("harga")
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKatalog = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBeli = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setText("Katalog Barang Bekas");

        tabelKatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Kondisi", "Harga"
            }
        ));
        tabelKatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKatalogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKatalog);

        jLabel2.setText("Pilih barang yang ingin Anda beli");

        btnBeli.setText("Beli Barang");
        btnBeli.addActionListener(this::btnBeliActionPerformed);

        btnRefresh.setText("Refresh Katalog");
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnBeli)
                        .addGap(47, 47, 47)
                        .addComponent(btnRefresh)
                        .addGap(55, 55, 55)
                        .addComponent(btnLogout)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBeli)
                    .addComponent(btnRefresh)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // BUG 1 FIX: Kode duplikat yang menggantung di luar method sudah dihapus.
        // Hanya satu blok logika yang dipakai di sini.
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Silakan pilih barang dari katalog terlebih dahulu!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idBarang = Integer.parseInt(tabelKatalog.getValueAt(selectedRow, 0).toString());
        String namaBarang = tabelKatalog.getValueAt(selectedRow, 1).toString();
        String hargaBarang = tabelKatalog.getValueAt(selectedRow, 3).toString();

        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this,
            "Anda akan membeli:\n" + namaBarang + "\nHarga: Rp " + hargaBarang + "\n\nLanjutkan ke pembayaran?",
            "Konfirmasi Pembelian",
            javax.swing.JOptionPane.YES_NO_OPTION);

        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            Barang_DAO dao = new Barang_DAO();
            dao.updateStatusBarang(idBarang, "Terjual");

            javax.swing.JOptionPane.showMessageDialog(this, "Pembayaran berhasil! Transaksi untuk " + namaBarang + " sedang diproses.", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            tampilDataKatalog(); // Refresh dari DB, barang terjual otomatis hilang
            selectedRow = -1;
        }
    }//GEN-LAST:event_btnBeliActionPerformed

    private void tabelKatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKatalogMouseClicked
        selectedRow = tabelKatalog.getSelectedRow();
    }//GEN-LAST:event_tabelKatalogMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // BUG 9 FIX: Refresh sekarang benar-benar reload data dari database
        tabelKatalog.clearSelection();
        selectedRow = -1;
        tampilDataKatalog();
        javax.swing.JOptionPane.showMessageDialog(this, "Katalog diperbarui.");
    }//GEN-LAST:event_btnRefreshActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new LandingPage_Pembeli().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKatalog;
    // End of variables declaration//GEN-END:variables
}
