/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {

    Connection conn;

    public Connection connect() {

        try {

            String url = "jdbc:mysql://localhost:3306/db_barkas";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);

            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Koneksi Gagal : " + e.getMessage());

        }

        return conn;
    }
}