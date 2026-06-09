/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

public class Barang {

    private int idBarang;
    private String namaBarang;
    private String kondisiBarang;
    private String statusBarang;
    private double harga;

    // Constructor kosong
    public Barang() {

    }

    // Constructor lengkap
    public Barang(int idBarang,
                  String namaBarang,
                  String kondisiBarang,
                  String statusBarang,
                  double harga) {

        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kondisiBarang = kondisiBarang;
        this.statusBarang = statusBarang;
        this.harga = harga;
    }

    // Getter dan Setter

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method tambahan

    public void getBarang() {

        System.out.println("ID Barang      : " + idBarang);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Kondisi Barang : " + kondisiBarang);
        System.out.println("Status Barang  : " + statusBarang);
        System.out.println("Harga Barang   : " + harga);

    }

    public void updateStatusBarang(String statusBaru) {
        this.statusBarang = statusBaru;
    }

    public void updateHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }
}