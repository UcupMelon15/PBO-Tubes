/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Penjual_DAO {

    // Fungsi Tambah Penjual (Create)
    public void tambahPenjual(ConsignmentSeller penjual) {
        try {
            Connection conn = Koneksi.getConnection();
            
            // Asumsi nama tabel di database adalah 'penjual'
            // Sesuaikan nama kolom jika berbeda di MySQL kamu
            String sql = "INSERT INTO penjual (nama_lengkap, nomor_telepon, password, nama_toko) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Ambil data dari class induk (Pengguna)
            pst.setString(1, penjual.getNamaLengkap());
            pst.setString(2, penjual.getNomorTelepon());
            pst.setString(3, penjual.getPassword());
            
            // Ambil data khusus dari class ConsignmentSeller
            pst.setString(4, penjual.getNamaToko());
            
            pst.executeUpdate();
            System.out.println("Data penjual berhasil ditambahkan ke database");
        } catch (Exception e) {
            System.out.println("Gagal tambah penjual: " + e.getMessage());
        }
    }

    // Fungsi Tampil Semua Penjual (Read)
    public ResultSet getAllPenjual() {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "SELECT * FROM penjual";
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data penjual: " + e.getMessage());
            return null;
        }
    }

    // Fungsi Hapus Penjual (Delete)
    public void hapusPenjual(int idPenjual) {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "DELETE FROM penjual WHERE id_penjual = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setInt(1, idPenjual);
            pst.executeUpdate();
            System.out.println("Data penjual berhasil dihapus");
        } catch (Exception e) {
            System.out.println("Gagal hapus penjual: " + e.getMessage());
        }
    }
}
