package com.kgswhy.com;

import java.util.Scanner;
public class Kalkulator {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x, y, pil ,hasil = 0;
         System.out.println("============Operator===========");
         System.out.println("1. Perkalian");
         System.out.println("2. Pembagian");
         System.out.println("3. Penjumlahan");
         System.out.println("4. Pengurangan");
         System.out.println("5. Modulus");
         System.out.println("----------------------------");
         System.out.print("x : ");
         x=input.nextInt();
         System.out.print("y : ");
         y=input.nextInt();
         System.out.print("Pilihan Operasi: ");
         pil=input.nextInt();
         
         switch (pil){
             case 1 -> hasil=x*y;
             case 2 -> hasil=x/y;
             case 3 -> hasil=x+y;
             case 4 -> hasil=x-y;
             case 5 -> hasil=x%y;
             default -> System.out.println("Salah memasukan pilihan");
         }
         
          System.out.println("Hasil :"+hasil);
    }
}
    
