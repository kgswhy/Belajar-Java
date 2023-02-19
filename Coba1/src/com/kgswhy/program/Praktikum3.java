package com.kgswhy.program;

import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nm,hb,kls;
        int nis;
        
        System.out.println("=====DATA SISWA=====");
        System.out.println("Masukkan nama anda:");
        nm = masukan.nextLine();
        System.out.println("Masukkan Kelas anda:");
        kls = masukan.nextLine();
        System.out.println("Masukkan Hobi anda:");
        hb = masukan.nextLine();
        System.out.println("Masukkan NIS anda:");
        nis = masukan.nextInt();
        System.out.println();
        System.out.println("Berikut data anda:");
        System.out.println("Nama = " + nm);
        System.out.println("Kelas = " + kls);
        System.out.println("Hobi = " + hb);
        System.out.println("Nis = " + nis);
    }
    
}
