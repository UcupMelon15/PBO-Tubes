/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Barang_DAO {

    public void tambahBarang(Barang barang) {

        try {

            Connection conn = Koneksi.getConnection();

            String sql =
                "INSERT INTO barang "
                + "(nama_barang,harga,kondisi_barang,status_barang) "
                + "VALUES (?,?,?,?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setString(1, barang.getNamaBarang());
            pst.setDouble(2, barang.getHarga());
            pst.setString(3, barang.getKondisiBarang());
            pst.setString(4, barang.getStatusBarang());

            pst.executeUpdate();

            System.out.println("Data berhasil ditambahkan");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
    
    public void hapusBarang(int idBarang) {
        try {

            Connection conn = Koneksi.getConnection();

            String sql =
                    "DELETE FROM barang WHERE id_barang=?";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setInt(1, idBarang);

            pst.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
    // Fungsi untuk mengambil semua data (Read)
    public java.sql.ResultSet getAllBarang() {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "SELECT * FROM barang";
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
            return null;
        }
    }

    // Fungsi untuk mengedit data (Update)
    public void updateBarang(Barang barang) {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "UPDATE barang SET nama_barang=?, harga=?, kondisi_barang=?, status_barang=? WHERE id_barang=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, barang.getNamaBarang());
            pst.setDouble(2, barang.getHarga());
            pst.setString(3, barang.getKondisiBarang());
            pst.setString(4, barang.getStatusBarang());
            pst.setInt(5, barang.getIdBarang()); // ID sebagai acuan (WHERE)
            
            pst.executeUpdate();
            System.out.println("Data berhasil diupdate di database");
        } catch (Exception e) {
            System.out.println("Gagal update data: " + e.getMessage());
        }
    }
    // Fungsi untuk menampilkan khusus barang yang "Tersedia" di halaman Pembeli
    public java.sql.ResultSet getBarangTersedia() {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "SELECT * FROM barang WHERE status_barang = 'Tersedia' OR status_barang = 'Baru' OR status_barang = 'Bekas'"; // Sesuaikan dengan status default di database-mu
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
            return null;
        }
    }

    // Fungsi untuk mengubah status barang menjadi "Terjual" setelah dibeli
    public void updateStatusBarang(int idBarang, String statusBaru) {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "UPDATE barang SET status_barang=? WHERE id_barang=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, statusBaru);
            pst.setInt(2, idBarang);
            
            pst.executeUpdate();
            System.out.println("Status barang berhasil diupdate menjadi: " + statusBaru);
        } catch (Exception e) {
            System.out.println("Gagal update status: " + e.getMessage());
        }
    }
    // Fungsi untuk mengambil riwayat barang yang sudah terjual
    public java.sql.ResultSet getBarangTerjual() {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "SELECT * FROM barang WHERE status_barang = 'Terjual'";
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data transaksi: " + e.getMessage());
            return null;
        }
    }
}