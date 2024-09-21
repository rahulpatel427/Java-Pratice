package com.javaPractice;

import java.util.Scanner;



public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum Program : ");
        System.out.println("Please Enter Any Odd Number");
int num = input.nextInt();
input.close();
int odd= oddSum(num);
        System.out.println(odd);


    }
   public  static int oddSum(int num){
        int sum = 0;
        int i= 1;
        while (i<=num){
            sum += i;
            i += 2;
        }
return sum;
   }
}
