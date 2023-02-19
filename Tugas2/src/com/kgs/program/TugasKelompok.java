package com.kgs.program;

import java.util.Scanner;
public class TugasKelompok {
public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        String nama , nis ;
        int jurusan;
        System.out.println("== SMK Telkom Jakarta ==");
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Masukan nis : ");
        nis = in.nextLine();
        System.out.print("Pilih Jurusan : \n 1. Teknis Transmisi \n 2. Teknik Jaringan Akses \n 3. Teknik komputer dan jaringan \n 4. Rekayasa Perangkat lunak  \n\n Masukan pilihan :");
        jurusan = in.nextInt();
        switch (jurusan){
            case 1 -> System.out.println("\n"+nama+" dengan nis "+nis+" memilih jurusan Teknik Transmisi ");
            case 2 -> System.out.println("\n"+nama+" dengan nis "+nis+" memilih jurusan Teknik Jaringan Akses");
            case 3 -> System.out.println("\n"+nama+" dengan nis "+nis+" memilih jurusan Teknik Komputer dan Jaringan");
            case 4 -> System.out.println("\n"+nama+" dengan nis "+nis+" memilih jurusan Rekayasa Perangkat Lunak");
           
            default -> System.out.println("Jurusan tidak tersedia");
    }
    
    }
}
