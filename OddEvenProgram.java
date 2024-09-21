package com.javaPractice;

import java.util.Scanner;

public class OddEvenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to page check Even or odd Program.\n\n");
        System.out.println("Enter any Number to Check number is Even or Odd :");
        int num =input.nextInt();
        int result = num%2;
        if(result == 0){
            System.out.println("The number is Even.");
        } else{
            System.out.println("The number is Odd.");
        }
    }
}
