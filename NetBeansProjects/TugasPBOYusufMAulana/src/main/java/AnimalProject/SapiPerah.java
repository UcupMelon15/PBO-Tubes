/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalProject;

/**
 *
 * @author ASUS
 */
class SapiPerah extends Sapi implements Kebiasaan, Lingkungan {
    
    SapiPerah(String nama) {
        super(nama);
    }
    
    @Override 
    void suara() {
        System.out.println(nama + "Berbunyi: Mooooo");
    }
    
    @Override
    public void tidur() {
        System.out.println(nama + "Tidur di kandang");
    }
    
    @Override
    public void hidup() {
        System.out.println(nama + "Hidup di darat");
    }
}
