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
public class Lingkaran extends BangunDatar{
    float r;
    
    @Override
    float keliling(){
        float keliling = (float)(2 * Math.PI * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
    @Override
    float luas(){
        float luas = (float)(Math.PI * r * r);
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }
}
