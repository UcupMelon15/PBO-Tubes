 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
public class Penjual {
    
    private String nama;
    private int id;
    
    public Penjual(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getId() {
        return id;
    }
    
    public String tampilData() {
        return "Nama: " + nama +
               "Id: " + id ;
    }
}
