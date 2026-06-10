/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class Transaksi {

    private int idTransaksi;
    private Date tanggal;
    private double totalHarga;
    private String statusBarang;
    private String kondisiBarang;

    public Transaksi(int idTransaksi,
                     Date tanggal,
                     String statusBarang,
                     String kondisiBarang) {

        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.statusBarang = statusBarang;
        this.kondisiBarang = kondisiBarang;
    }

    public double hitungHarga(Barang barang) {

        totalHarga = barang.getHarga();

        return totalHarga;
    }

    public void buatTransaksi() {

        System.out.println("Transaksi berhasil dibuat");
    }

    public void konfirmasiPembayaran() {

        System.out.println("Pembayaran dikonfirmasi");
    }

    public void cekStruk() {

        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Total Harga  : " + totalHarga);
    }
}
