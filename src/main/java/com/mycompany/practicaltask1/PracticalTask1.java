/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaltask1;

/**
 *
 * @author BOSS
 */
import java.util.Scanner;
public class PracticalTask1 {

    public static void main(String[] args){
        
    double deposit = 0;
    double percent = 0;
    double time = 0;
    double income = 0;
    int i = 1;
    
    System.out.println("PracticalTask №1. Variant 4. Student Kiselev Y.P. Croup RIBO-03-21");
    System.out.println("Specify the duration of the deposit, the percentage and the deposit.");
    Scanner scan = new Scanner(System.in);
    time = scan.nextInt();
    percent = scan.nextInt();
    deposit = scan.nextInt();
    
    percent = percent * 0.01;
    
    do {
        income = deposit * percent;
        deposit = deposit + income;
        i = i + 1;
        System.out.println("Monthly income = " + income);
    }
    while(i <= time);
    
    System.out.println("Total income = " + deposit);
    }
}
