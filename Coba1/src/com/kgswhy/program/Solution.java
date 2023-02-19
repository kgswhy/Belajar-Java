/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kgswhy.program;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kgswa
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment;
        NumberFormat usnf = 
    NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf = 
    NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.print("Input you money:");
        payment = scanner.nextDouble();
        System.out.println("US Format = "+ usnf.format(payment));
        System.out.println("India Format = "+ innf.format(payment));
        scanner.close();
    }
    
}
