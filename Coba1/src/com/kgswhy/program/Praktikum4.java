package com.kgswhy.program;
import java.util.Scanner;

public class Praktikum4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai anda: ");
        int a = masukan.nextInt();
        
        int nilai = a;
        
        if(nilai >= 67)
        {System.out.println("Anda lulus");}
        
        else
        {System.out.println("Anda gagal");}
        
           
 
    }
}  
