/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Penjual penjual = new Penjual(
                1,
                "UcUp",
                "08123456789",
                101,
                "Toko Ucup"
        );

        Barang barang1 = new Barang(
                1,
                "Laptop Bekas",
                "90%",
                "Tersedia",
                3500000
        );

        penjual.tambahBarang(barang1);

        Pembeli pembeli = new Pembeli(
                2,
                "Budi",
                "089999999",
                201,
                "Budi"
        );

        pembeli.lihatBarang(barang1);

        pembeli.beliBarang(barang1);

        Transaksi trx = new Transaksi(
                1,
                new Date(),
                "Terjual",
                "Bekas"
        );

        trx.hitungHarga(barang1);

        trx.buatTransaksi();

        trx.cekStruk();
    }
}