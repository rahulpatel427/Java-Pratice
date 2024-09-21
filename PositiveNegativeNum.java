package com.javaPractice;

import java.util.Scanner;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Checking a Number is Positive Or Negative Or Zero : \n\n");
        System.out.println("Enter Any Type  of Number Like Positive Or Negative Number : ");
        int num1 = input.nextInt();
        input.close();
     if(num1 > 0){
         System.out.println("The Number is Positive.");
     }
     else if (num1 == 0){
         System.out.println("the Number is Zero.");
     }else{
         System.out.println("The Number is Negative.");
     }

    }
}
