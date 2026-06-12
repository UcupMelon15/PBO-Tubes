/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Lenovo-LOQ
 */
public class Pembeli_DAO {
    
   public boolean tambahPembeli(String nama, String alamat, String noHp, String username) throws SQLException {
        // Password diabaikan (akan otomatis NULL di database)
        String sql = "INSERT INTO pembeli (nama_lengkap, alamat, nomor_telepon, username) VALUES (?, ?, ?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            if (conn == null) return false;
            pst.setString(1, nama);
            pst.setString(2, alamat);
            pst.setString(3, noHp);
            pst.setString(4, username);
            return pst.executeUpdate() > 0;
        }
    }

    public boolean updatePembeli(int id, String nama, String alamat, String noHp, String username) throws SQLException {
        String sql = "UPDATE pembeli SET nama_lengkap=?, alamat=?, nomor_telepon=?, username=? WHERE id_pembeli=?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            if (conn == null) return false;
            pst.setString(1, nama);
            pst.setString(2, alamat);
            pst.setString(3, noHp);
            pst.setString(4, username);
            pst.setInt(5, id);
            return pst.executeUpdate() > 0;
        }
    }

    public boolean hapusPembeli(int id) throws SQLException {
        String sql = "DELETE FROM pembeli WHERE id_pembeli=?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            if (conn == null) return false;
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        }
    }
}