package com.mycompany.tugaspboyusufmaulana.TUBES;

import com.mycompany.tugaspboyusufmaulana.Transaksi_DAO;

public class LandingPage_Transaksi extends javax.swing.JFrame {
    private int selectedRow = -1;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LandingPage_Transaksi.class.getName());

    public LandingPage_Transaksi() {
        initComponents();
        tampilDataTransaksi(); // BUG 7 FIX: Load data dari DB saat form pertama dibuka
    }

    // BUG 7 FIX: Method ini sebelumnya tidak ada. Tabel selalu kosong karena
    // Transaksi_DAO.getAllTransaksiLengkap() tidak pernah dipanggil.
    private void tampilDataTransaksi() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelTransaksi.getModel();
        model.setRowCount(0);

        try {
            Transaksi_DAO dao = new Transaksi_DAO();
            java.sql.ResultSet rs = dao.getAllTransaksiLengkap();

            if (rs != null) {
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("id_transaksi"),
                        rs.getString("tanggal_transaksi"),
                        rs.getString("nama_pembeli"),
                        rs.getString("nama_barang"),
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
        jLabel2 = new javax.swing.JLabel();
        btnCetakStruk = new javax.swing.JButton();
        btnKonfirmasi = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setText("Manajemen Transaksi");

        jLabel2.setText("Verifikasi Pembayaran dan Kelola Struk Transaksi");

        btnCetakStruk.setText("Cetak Struk");
        btnCetakStruk.addActionListener(this::btnCetakStrukActionPerformed);

        btnKonfirmasi.setText("Konfirmasi Pembayaran");
        btnKonfirmasi.addActionListener(this::btnKonfirmasiActionPerformed);

        btnHapus.setText("Hapus Riwayat");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnRefresh.setText("Refresh Data");
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        btnKembali.setText("Logout");
        btnKembali.addActionListener(this::btnKembaliActionPerformed);

        // BUG 7 FIX: Kolom disesuaikan dengan data JOIN dari Transaksi_DAO
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Transaksi", "Tanggal", "Nama Pembeli", "Nama Barang", "Harga"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKonfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCetakStruk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKonfirmasi)
                .addGap(12, 12, 12)
                .addComponent(btnCetakStruk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        selectedRow = tabelTransaksi.getSelectedRow();
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void btnKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmasiActionPerformed
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih transaksi yang ingin dikonfirmasi!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelTransaksi.getModel();
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Konfirmasi bahwa pembayaran telah diterima?", "Konfirmasi Pembayaran", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pembayaran berhasil dikonfirmasi!", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            tabelTransaksi.clearSelection();
            selectedRow = -1;
        }
    }//GEN-LAST:event_btnKonfirmasiActionPerformed

    private void btnCetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakStrukActionPerformed
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih transaksi untuk mencetak struk!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelTransaksi.getModel();
        String idTrx     = model.getValueAt(selectedRow, 0).toString();
        String tanggal   = model.getValueAt(selectedRow, 1).toString();
        String pembeli   = model.getValueAt(selectedRow, 2).toString();
        String namaBarang = model.getValueAt(selectedRow, 3).toString();
        String total     = model.getValueAt(selectedRow, 4).toString();

        String struk = "         STRUK TRANSAKSI\n"
                     + "ID Transaksi  : " + idTrx + "\n"
                     + "Tanggal       : " + tanggal + "\n"
                     + "Pembeli       : " + pembeli + "\n"
                     + "Barang        : " + namaBarang + "\n"
                     + "------------------------------------\n"
                     + "TOTAL BAYAR   : Rp " + total + "\n"
                     + "====================================\n"
                     + "   Terima Kasih Atas Titipannya\n"
                     + "====================================";

        javax.swing.JTextArea textArea = new javax.swing.JTextArea(struk);
        textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        textArea.setEditable(false);
        javax.swing.JOptionPane.showMessageDialog(this, new javax.swing.JScrollPane(textArea), "Cetak Struk", javax.swing.JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnCetakStrukActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih transaksi yang ingin dihapus!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus riwayat transaksi ini?", "Konfirmasi Hapus", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabelTransaksi.getModel();
            model.removeRow(selectedRow);
            javax.swing.JOptionPane.showMessageDialog(this, "Riwayat transaksi dihapus!");
            selectedRow = -1;
            tabelTransaksi.clearSelection();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // BUG 7 FIX: Refresh sekarang reload dari DB
        tabelTransaksi.clearSelection();
        selectedRow = -1;
        tampilDataTransaksi();
        javax.swing.JOptionPane.showMessageDialog(this, "Data Transaksi disinkronisasi ulang.");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);
        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            LOGIN_PAGE loginPage = new LOGIN_PAGE();
            loginPage.setVisible(true);
            java.awt.Window win = javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component) evt.getSource());
            if (win != null) {
                win.dispose();
            }
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new LandingPage_Transaksi().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakStruk;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKonfirmasi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
