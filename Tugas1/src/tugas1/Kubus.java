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
public class Kubus extends BangunRuang{
    float sisi;
    
    @Override
    float volume(){
        float volume = sisi * sisi * sisi;
        System.out.println("Volume : " + volume);
        return volume;
    }  
    @Override
    float luasAlas(){
        float luasAlas  = 6 * sisi * sisi;
        System.out.println("Luas Alas : " + luasAlas);
        return luasAlas;
    }
}
