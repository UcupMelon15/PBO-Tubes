/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
public class ConsignmentSeller {

    private int idCs;
    private String namaToko;

    public ConsignmentSeller(int idCs, String namaToko) {

        this.idCs = idCs;
        this.namaToko = namaToko;
    }

    public void verifikasiBarang() {

        System.out.println("Barang berhasil diverifikasi");
    }

    public void uploadBarang() {

        System.out.println("Barang berhasil diupload");
    }

    public void promosiBarang() {

        System.out.println("Barang sedang dipromosikan");
    }

    public void updateStatusBarang() {

        System.out.println("Status barang diperbarui");
    }

    public void kelolaTransaksi() {

        System.out.println("Transaksi sedang dikelola");
    }
}