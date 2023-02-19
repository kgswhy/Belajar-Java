package com.kgswhy.program;
import java.util.Scanner;
public class PraktikumIFElseIF {

    public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
        System.out.print("Tinggi badan anda: ");
        int a = masukan.nextInt();
        
        int tb = a;
        
        if(tb >= 180)
        {System.out.println("Tinggi sangat Ideal");}
        
        else if(tb >= 165)
        {System.out.println("Inggi Ideal");}
        
        else
        {System.out.println("Tinggi kurang Ideal");}
        
           
 
    }
    
}
