/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboyusufmaulana;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class JOP {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Masukan Jari-jari lingkaran: ");
        
        double r = Double.parseDouble(input);
        
        double keliling = 2 * Math.PI * r;
        
        JOptionPane.showInputDialog("Keliling lingkaran = " + keliling);
        
    }   
}
