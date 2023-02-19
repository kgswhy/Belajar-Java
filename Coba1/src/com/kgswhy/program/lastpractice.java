/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kgswhy.program;

import java.util.Scanner;

/**
 *
 * @author kgswa
 */
public class lastpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number N: ");
    int n = scan.nextInt();
    for(int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
    }
    }
    
}
