package com.mycompany.tugaspboyusufmaulana.TUBES;

import com.mycompany.tugaspboyusufmaulana.Transaksi_DAO;

public class Kelola_Transaksi extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Kelola_Transaksi.class.getName());

    public Kelola_Transaksi() {
        initComponents();
        tampilDataTransaksi(); // Dipanggil setelah initComponents
    }

    // BUG 2 FIX: Method ini sebelumnya berada di LUAR body class (setelah kurung tutup kelas).
    // Sekarang dipindah ke dalam class dan dihubungkan ke Transaksi_DAO yang sudah ada.
    private void tampilDataTransaksi() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // BUG 2 FIX: Kolom tabel disesuaikan dengan data JOIN dari Transaksi_DAO
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Transaksi", "Tanggal", "Nama Pembeli", "Nama Barang", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> new Kelola_Transaksi().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
