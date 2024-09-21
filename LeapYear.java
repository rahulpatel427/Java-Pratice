package com.javaPractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Word");
        System.out.println("Enter any Year");
        int year = input.nextInt();
        input.close();
if (year < 9999){


        if(year%4 == 0 && (year%100 !=0 || year%400 ==0 )){
            System.out.println(year + "This is Leap Year.");
        } else {
            System.out.println(year+"The Year is Not Leap year.");
        }
} else {
    System.out.println("Pleas Enter 4 Numbers of Year.");
}
    }
}
