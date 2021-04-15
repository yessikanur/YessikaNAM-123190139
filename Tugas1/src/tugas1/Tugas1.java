package tugas1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
       
        int pilih, menu;
        
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("Menu");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Kubus");
        System.out.println("6. Silinder");
        System.out.println("7. Balok");
        System.out.println("0. Chukups");
        System.out.printf("Pilih : ");
        pilih = in.nextInt();
                
        switch(pilih){
            case 1:
                try{
                Persegi persegi = new Persegi();
                System.out.println("Persegi");
                System.out.printf("Sisi: ");
                persegi.sisi=in.nextInt();
                persegi.keliling();
                persegi.luas();
                }catch(Exception error){
                        System.out.println("Terdapat Error "+ error.getMessage());
                        System.out.println("Input harus berupa angka");
                        }
                break;
             
            case 2:
                try{
                Lingkaran lingkaran = new Lingkaran();
                System.out.println("Lingkaran");
                System.out.printf("r : "); //jari-jari
                lingkaran.r=in.nextInt();
                lingkaran.keliling();
                lingkaran.luas();
                }catch(Exception error){
                        System.out.println("Terdapat Error "+ error.getMessage());
                        System.out.println("Input harus berupa angka");
                        }
                break;
                
            case 3:
                try{
                PersegiPanjang persegipanjang = new PersegiPanjang();
                System.out.println("Persegi Panjang");
                System.out.printf("panjang : ");
                persegipanjang.panjang=in.nextInt();
                System.out.printf("Lebar : ");
                persegipanjang.lebar=in.nextInt();
                persegipanjang.keliling();
                persegipanjang.luas();
                }catch(Exception error){
                        System.out.println("Terdapat Error "+ error.getMessage());
                        System.out.println("Input harus berupa angka");
                        }
                break;
                
            case 4:
                try{
                Segitiga segitiga = new Segitiga();
                System.out.println("Segitiga");
                System.out.printf("Sisi: ");
                segitiga.sisi=in.nextInt();
                System.out.printf("Alas : ");
                segitiga.alas=in.nextInt();
                System.out.printf("Tinggi : ");
                segitiga.tinggi=in.nextInt();
                segitiga.keliling();
                segitiga.luas();
                }catch(Exception error){
                        System.out.println("Terdapat Error "+ error.getMessage());
                        System.out.println("Input harus berupa angka");
                        }
                break;
                
            case 5:
                try{
                Kubus kubus = new Kubus();
                System.out.println("Kubus");
                System.out.printf("Sisi: ");
                kubus.sisi=in.nextInt();
                kubus.volume();
                kubus.luasAlas();
                }catch(Exception error){
                       System.out.println("Terdapat Error "+ error.getMessage());
                       System.out.println("Input harus berupa angka");
                       }
                break;
                
            case 6:
                try{
                Silinder silinder = new Silinder();
                System.out.println("Silinder");
                System.out.printf("r: ");
                silinder.r=in.nextInt();
                System.out.printf("Tinggi: ");
                silinder.tinggi=in.nextInt();
                silinder.volume();
                silinder.luasAlas();
                }catch(Exception error){
                       System.out.println("Terdapat Error "+ error.getMessage());
                       System.out.println("Input harus berupa angka");
                       }
                break;
                
            case 7:
                try{
                Balok balok = new Balok();
                System.out.println("Balok");
                System.out.printf("Panjang: ");
                balok.panjang=in.nextInt();
                System.out.printf("Lebar: ");
                balok.lebar=in.nextInt();
                System.out.printf("Tinggi: ");
                balok.tinggi=in.nextInt();
                balok.volume();
                balok.luasAlas();
                }catch(Exception error){
                        System.out.println("Terdapat Error "+ error.getMessage());
                        System.out.println("Input harus berupa angka");
                        }
                break;
                
            case 0:
                System.exit(0);
                break;
                 
            }
        
            System.out.printf("Kembali ke Menu? (1=ya): ");
            menu = in.nextInt();
            
        }while(menu == 1);
      }         
    }
    
