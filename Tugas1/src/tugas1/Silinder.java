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
public class Silinder extends BangunRuang{
    float r, tinggi;
    
    @Override
    float volume(){
        float volume = (float)(Math.PI * r * r * tinggi);
        System.out.println("Volume : " + volume);
        return volume;
    }  
    @Override
    float luasAlas(){
        float luasAlas  = (float)(2 * Math.PI * r)* tinggi;
        System.out.println("Luas Alas : " + luasAlas);
        return luasAlas;
    }
}
