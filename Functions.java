package com.javaPractice;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        greet();
int first = readNumber(); // it is calling a method to return a number
int second = readNumber();
int sum = first + second;
        System.out.println("The Sum is : " + sum);
    }
    public static int readNumber() { // it is method to return any integer value
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number.");
        int number = input.nextInt();
            return number;
    }
    public  static void greet(){
        System.out.println("Welcome to Calculator.");
    }
}
