/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana.TUBES;

/**
 *
 * @author ASUS
 */
public class Pengguna {
    
    protected int idPengguna;
    protected String namaLengkap;
    protected String nomorTelpon;
    
    public Pengguna(int idPengguna, String namaLengkap, String nomorTelpon) {
        this.idPengguna = idPengguna;
        this.namaLengkap = namaLengkap;
        this.nomorTelpon = nomorTelpon;
    }
    
    public boolean login() {
        System.out.println(namaLengkap + " Behasiil  Login");
        return true;
    }
    
    public boolean logout() {
        System.out.println(namaLengkap + " Berhasil Logout");
        return true;
    }
    
    public String getPenjualId() {
        return "PJ" + idPengguna;
    }
    
    public String getNoTelpon() {
        return nomorTelpon;
    }
}
