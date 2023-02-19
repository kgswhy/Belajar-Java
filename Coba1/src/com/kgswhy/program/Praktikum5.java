package com.kgswhy.program;
import java.util.Scanner;
public class Praktikum5 {
    public static void main(String[] args) {
       
  Scanner input = new Scanner(System.in);
  int angka;
  String ket;
  System.out.print("Masukkan angka : ");
  angka = input.nextInt();
  if (angka % 2 == 0) {
   ket = "Angka "+angka+" Merupakan angka Genap";
  }else{
   ket = "Angka "+angka+" Merupakan angka Ganjil";
  }
  System.out.println(ket);
    }
    
}
