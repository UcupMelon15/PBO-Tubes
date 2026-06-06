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

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3306/jual_beli_bekas";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD);

        } catch (Exception e) {

            System.out.println(
                    "Koneksi gagal : "
                    + e.getMessage());

            return null;
        }
    }
}