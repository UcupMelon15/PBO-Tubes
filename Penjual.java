 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Penjual extends Pengguna {
    
    private int idPenjual;
    private String namaPenjual;
    
    private ArrayList<Barang> daftarBarang;
    
    private Penjual(int idPenjual, String namaLengkap, String nomorTelpon, String namaPenjual) {
       
        super(idPengguna, namaLengkap, nomorTelpon);
        
        this.idPenjual = idPenjual;
        this.namaPenjual = namaPenjual;
        
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
    
    public void updateDataPenjual(String namaBaru) {
        this.namaPenjual = namaBaru;
    }
}