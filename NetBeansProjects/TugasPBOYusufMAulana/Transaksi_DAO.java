/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Transaksi_DAO {

    // Fungsi untuk mencatat transaksi baru saat pembeli menekan tombol "Beli"
    public void catatTransaksi(Transaksi transaksi) {
        try {
            Connection conn = Koneksi.getConnection();
            
            // Kolom tanggal akan otomatis diisi oleh MySQL menggunakan CURRENT_TIMESTAMP jika diset di database
            String sql = "INSERT INTO transaksi (id_pembeli, id_barang) VALUES (?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Mengambil ID dari objek Transaksi (pastikan getter ini ada di Transaksi.java milikmu)
            pst.setInt(1, transaksi.getIdPembeli());
            pst.setInt(2, transaksi.getIdBarang());
            
            pst.executeUpdate();
            System.out.println("Transaksi berhasil dicatat di database");
        } catch (Exception e) {
            System.out.println("Gagal mencatat transaksi: " + e.getMessage());
        }
    }

    // Fungsi untuk menampilkan riwayat transaksi lengkap (menggunakan JOIN)
    public ResultSet getAllTransaksiLengkap() {
        try {
            Connection conn = Koneksi.getConnection();
            
            // Menggabungkan tabel transaksi, pembeli, dan barang agar informasinya utuh
            String sql = "SELECT t.id_transaksi, p.nama_lengkap AS nama_pembeli, b.nama_barang, b.harga, t.tanggal_transaksi " +
                         "FROM transaksi t " +
                         "JOIN pembeli p ON t.id_pembeli = p.id_pembeli " +
                         "JOIN barang b ON t.id_barang = b.id_barang";
                         
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data transaksi lengkap: " + e.getMessage());
            return null;
        }
    }
}