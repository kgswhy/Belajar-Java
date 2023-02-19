
package com.kgs.program;

import java.util.Scanner;

public class Output3 {

    public static void main(String[] args) {
      Scanner masukkan = new Scanner (System.in);
        int P, L;
        
    System.out.println("Masukan niai panjang : cm");
    P = masukkan.nextInt();
    
    System.out.println("Masukan niai lebar : cm");
    L = masukkan.nextInt();
    
    System.out.println("Luas persegi panjang : " + P*L + "cm");
    
    System.out.println("Keliling persegi panjang : " + 2*(P+L) + "cm");
    }
    
}
