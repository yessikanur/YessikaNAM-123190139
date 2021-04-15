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
public class Segitiga extends BangunDatar{
    float sisi, alas, tinggi; 
    
    
    @Override
    float keliling(){
        float keliling = (sisi + sisi + sisi);
        System.out.println("Keliling : " + keliling); 
        return keliling;
    }
    @Override
    float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas : " + luas);
        return luas;
    } 
}
