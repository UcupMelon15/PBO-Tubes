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
                + "(nama_barang,nama_penjual,harga,kondisi_barang,status_barang) "
                + "VALUES (?,?,?,?,?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setString(1, barang.getNamaBarang());
            pst.setString(2, barang.getNamaPenjual());
            pst.setDouble(3, barang.getHarga());
            pst.setString(4, barang.getKondisiBarang());
            pst.setString(5, barang.getStatusBarang());

            pst.executeUpdate();

            System.out.println("Data berhasil ditambahkan");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
    
   public void updateBarang(Barang barang) {
        try {
            java.sql.Connection conn = Koneksi.getConnection();
            
            String sql = "UPDATE barang SET nama_barang=?, nama_penjual=?, harga=?, kondisi_barang=?, status_barang=? WHERE id_barang=?";
            
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, barang.getNamaBarang());
            pst.setString(2, barang.getNamaPenjual());
            pst.setDouble(3, barang.getHarga());
            pst.setString(4, barang.getKondisiBarang());
            pst.setString(5, barang.getStatusBarang());
            pst.setInt(6, barang.getIdBarang());

            pst.executeUpdate();
            
            System.out.println("Data berhasil diupdate");
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
}