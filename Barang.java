/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
public class Barang {
    
    private int idBarang;
    private String namaBarang;
    private String kondisiBarang;
    private String statusBarang;
    private double harga;
    
    public Barang(int idBarang, String namaBarang, String kondisiBarang, String statusBarang, double harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kondisiBarang = kondisiBarang;
        this.statusBarang = statusBarang;
        this.harga = harga;
    }
    
    public int getIdBarang() {
        return idBarang;
    }
    
    public String getNamaBarang() {
        return namaBarang;
    }
    
    public String getStatusBarang() {
        return statusBarang;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void updateStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
        System.out.println("Update status barang: " + statusBarang);
    }
    
    public void updateHarga(double harga) {
        this.harga = harga;
        System.out.println("Update harga barang: " + harga);
    }
    
    
}
