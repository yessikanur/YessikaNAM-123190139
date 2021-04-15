/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Balok {
     float panjang, lebar, tinggi;
    
    float volume(){
        float volume = panjang * lebar * tinggi;
        System.out.println("Volume : " + volume);
        return volume;
    }  
    float luasAlas(){
        float luasAlas  = (2*panjang*lebar+ 2*panjang*tinggi+ 2*lebar*tinggi);
        System.out.println("Luas Alas : " + luasAlas);
        return luasAlas;
    }
}
