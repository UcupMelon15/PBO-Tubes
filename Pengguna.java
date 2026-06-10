/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

/**
 *
 * @author ASUS
 */
public class Pengguna {

    protected int idPengguna;
    protected String namaLengkap;
    protected String nomorTelepon;
    protected String password;

    public Pengguna(int idPengguna, String namaLengkap,
                    String nomorTelepon, String password) {
        
        this.idPengguna = idPengguna;
        this.namaLengkap = namaLengkap;
        this.nomorTelepon = nomorTelepon;
        this.password = password;
    }
    public boolean login() {
        System.out.println(namaLengkap + " berhasil login");
        return true;
    }
    public boolean logout() {
        System.out.println(namaLengkap + " berhasil logout");
        return true;
    }
    public int getIdPengguna() {
        return idPengguna;
    }
    public String getNamaLengkap() {
        return namaLengkap;
    }
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    public String getPassword() {
        return password;
    }
}
