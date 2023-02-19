package com.kgswhy.program;

import java.util.Scanner;

public class pilihmenu {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pilihan;
    
    System.out.println("Pilih menu makanan:");
    System.out.println("1. Nasi Goreng");
    System.out.println("2. Mie Goreng");
    System.out.println("3. Sate");
    System.out.println("4. Bakso");
    
    System.out.print("Masukkan pilihan Anda: ");
    pilihan = scan.nextInt();
    
    switch (pilihan) {
      case 1 -> System.out.println("Anda memilih Nasi Goreng.");
      case 2 -> System.out.println("Anda memilih Mie Goreng.");
      case 3 -> System.out.println("Anda memilih Sate.");
      case 4 -> System.out.println("Anda memilih Bakso.");
      default -> System.out.println("Pilihan tidak valid.");
    }
  }
}

