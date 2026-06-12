/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static final String URL = "jdbc:mysql://localhost:3306/db_barkas";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    // Variabel statis untuk menyimpan status koneksi (Singleton)
    private static Connection conn;

    public static Connection getConnection() {
        try {
            // Cek apakah koneksi masih kosong atau sudah terputus
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi baru ke database berhasil dibuat.");
            }
            return conn;
        } catch (Exception e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
            return null;
        }
    }
}