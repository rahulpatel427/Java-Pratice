package com.javaPractice;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum Program : ");
        System.out.println("Please Enter First Number");
        int first = input.nextInt();
        System.out.println("Please Enter Second Number");
        int second = input.nextInt();
        input.close();
        int lcm = lcm(first, second);
        System.out.println("The  Lcm is :" + lcm);
    }

 public static  int lcm(int first, int second) {
     int i = 1;

     while (true) {
       int  factor = first * i;
         if (factor % second == 0) {
             return factor;
         } i++;
     }

 }

}
