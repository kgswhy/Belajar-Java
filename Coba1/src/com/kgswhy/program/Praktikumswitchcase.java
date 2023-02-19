package com.kgswhy.program;

import java.util.Scanner;

public class Praktikumswitchcase {
public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println ("ingin pesan apa (Pilih 1 - 5):");
       int makanan = input.nextInt();
       switch (makanan){
           case 1 -> System.out.println("Nasi Goreng = Rp. 20.000");
           case 2 -> System.out.println("Kwetiaw = Rp. 15.000");
           case 3 -> System.out.println("Ayam Goreng = Rp. 25.000");
           case 4 -> System.out.println("Ayam Bakar = Rp. 30.000");
           case 5 -> System.out.println("Ayam katsu = Rp. 20.000"); 
           
           default -> System.out.println("Pilihan tidak tersedia");
               
       }
    }
    
}
