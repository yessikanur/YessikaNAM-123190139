/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;



public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling : " + keliling);
        return keliling;
    }   
  
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas : " + luas);
        return luas;
    }   
}

