/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
abstract class Sapi {
    String nama;
    
    Sapi(String nama) {
        this.nama = nama;
    }
    
    void makan(){
        System.out.println(nama + " Makan rumput");
    }
    
    abstract void suara();
    abstract void jenis();
    
}

class SapiPerah extends Sapi {
    
    SapiPerah(String nama) {
        super(nama);
    }
    
    @Override
    void suara() {
        System.out.println(nama + " Bunyi: Mooooo....");
        
    }      
    @Override
    void jenis() {
        System.out.println(nama + " Jenis: SapiPerah");  
        
    }
}

