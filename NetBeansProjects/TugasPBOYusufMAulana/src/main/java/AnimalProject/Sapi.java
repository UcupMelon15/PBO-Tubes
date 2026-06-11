/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalProject;

/**
 *
 * @author ASUS
 */
abstract class Sapi {
    String nama;
    
    Sapi(String nama) {
        this.nama = nama;
    }
    
    void makan() {
        System.out.println(nama + " Makan Rumput");
    }
    
    abstract void suara();
}
