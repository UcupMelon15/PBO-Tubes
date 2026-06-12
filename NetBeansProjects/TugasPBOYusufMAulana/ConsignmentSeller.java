/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

// Menggunakan 'extends' untuk mewarisi sifat dari class Pengguna
public class ConsignmentSeller extends Pengguna {

    // Atribut khusus yang hanya dimiliki oleh Penjual
    private String namaToko;

    // Constructor lengkap yang memadukan atribut induk dan atribut khusus
    public ConsignmentSeller(int idPengguna, 
                             String namaLengkap, 
                             String nomorTelepon, 
                             String password, 
                             String namaToko) {
        
        // super() memanggil constructor dari class Pengguna, wajib ditaruh di baris pertama!
        super(idPengguna, namaLengkap, nomorTelepon, password);
        this.namaToko = namaToko;
    }

    // Getter dan Setter untuk atribut khusus Penjual
    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    // Method operasional (ditambahkan variabel namaToko agar lebih dinamis)
    public void verifikasiBarang() {
        System.out.println("Toko " + this.namaToko + " berhasil memverifikasi barang.");
    }

    public void uploadBarang() {
        System.out.println("Toko " + this.namaToko + " berhasil mengupload barang.");
    }

    public void promosiBarang() {
        System.out.println("Barang dari toko " + this.namaToko + " sedang dipromosikan.");
    }

    public void updateStatusBarang() {
        System.out.println("Status barang dari toko " + this.namaToko + " diperbarui.");
    }

    public void kelolaTransaksi() {
        System.out.println("Toko " + this.namaToko + " sedang mengelola transaksi.");
    }
}