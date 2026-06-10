 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Penjual extends Pengguna {

    private ArrayList<Barang> daftarBarang;

    public Penjual(int idPengguna,
                   String namaLengkap,
                   String nomorTelepon,
                   String password) {

        super(idPengguna, namaLengkap, nomorTelepon, password);

        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {

        daftarBarang.add(barang);

        System.out.println("Barang berhasil ditambahkan");
    }

    public void listStatusBarang() {

        for (Barang b : daftarBarang) {

            System.out.println("Nama Barang : " + b.getNamaBarang());
            System.out.println("Status      : " + b.getStatusBarang());
        }
    }

    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}
