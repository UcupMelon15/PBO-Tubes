/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
public class Pembeli extends Pengguna {
    
    private int idPembeli;
    private String namaPembeli;
    
    public Pembeli(int idPengguna, String namaLengkap, String nomorTelpon, int idPembeli, String namaPembeli) {
        
        super(idPengguna, namaLengkap, nomorTelpon);
        
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
    }
    
    public void lihatBarang(Barang barang) {
           
        barang.getBarang();
    }
    
    public void beliBarang(Barang barang) {
        
        if (barang.getStatusBarang().equals("Terjual")) {
            
            System.out.println("Barang sudah terjual");
            
        } else {
            
            barang.getStatusBarang("Tidak Terjual");
            
            System.out.println("Barang tidak berhasil dijual");
            
        }
    }
    
    public void lakukanPembayaran() {
        
        System.out.println("Pembayarab berhasil");
    }
    
}
