package com.kgswhy.com;

import java.util.Scanner;
public class Kalkulator {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a, b, pil ,hasil = 0;
         System.out.println("============Operator===========");
         System.out.println("1. Perkalian");
         System.out.println("2. Pembagian");
         System.out.println("3. Penjumlahan");
         System.out.println("4. Pengurangan");
         System.out.println("5. Modulus");
         System.out.println("----------------------------");
         System.out.print("x : ");
         a=input.nextInt();
         System.out.print("y : ");
         b=input.nextInt();
         System.out.print("Pilihan Operasi: ");
         pil=input.nextInt();
         
         switch (pil){
             case 1 -> hasil=a*b;
             case 2 -> hasil=a/b;
             case 3 -> hasil=a+b;
             case 4 -> hasil=a-b;
             case 5 -> hasil=a%b;
          
         }
         
          System.out.println("Hasil :"+hasil);
    }
}
    
