/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

/**
 *
 * @author ASUS
 */
public class Pembeli extends Pengguna {

    public Pembeli(int idPengguna,
                   String namaLengkap,
                   String nomorTelepon,
                   String password) {

        super(idPengguna, namaLengkap, nomorTelepon, password);
    }

    public void lihatBarang(Barang barang) {
        barang.getBarang();
    }

    public void beliBarang(Barang barang) {

        if (barang.getStatusBarang().equals("Terjual")) {

            System.out.println("Barang sudah terjual");

        } else {

            barang.setStatusBarang("Terjual");

            System.out.println("Barang berhasil dibeli");
        }
    }

    public void lakukanPembayaran() {

        System.out.println("Pembayaran berhasil");
    }
}