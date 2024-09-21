package com.javaPractice;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum Program : ");
        System.out.println("Please Enter Any Odd Number");
        int num = input.nextInt();
        input.close();
 double fact = print(num);
        System.out.println(fact);
    }
//    public  static long print(int num){
//        if (num == 0 || num ==1){ // (num < 2)
//            return 1;
//        } else {
//            return num * print(num-1);
//        }
//
//    }
    public static  double print(int num){
        if(num < 2){
            return 1;
        }
       long fact = 1;
int i = 2;
while (i<=num){
    fact     *= i;
    i++;
}
        return  fact;

    }

}
