/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pembeli_DAO {

    // Fungsi Tambah Pembeli (Create)
    public void tambahPembeli(Pembeli pembeli) {
        try {
            Connection conn = Koneksi.getConnection();
            
            // Sesuaikan "pembeli" dengan nama tabel aslimu di db_barkas
            String sql = "INSERT INTO pembeli (nama_lengkap, nomor_telepon, password) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Mengambil data menggunakan method getter dari class induk (Pengguna)
            pst.setString(1, pembeli.getNamaLengkap());
            pst.setString(2, pembeli.getNomorTelepon());
            pst.setString(3, pembeli.getPassword());
            
            pst.executeUpdate();
            System.out.println("Data pembeli berhasil ditambahkan ke database");
        } catch (Exception e) {
            System.out.println("Gagal tambah pembeli: " + e.getMessage());
        }
    }

    // Fungsi Tampil Semua Pembeli (Read)
    public ResultSet getAllPembeli() {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "SELECT * FROM pembeli";
            PreparedStatement pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            System.out.println("Gagal mengambil data pembeli: " + e.getMessage());
            return null;
        }
    }
}
