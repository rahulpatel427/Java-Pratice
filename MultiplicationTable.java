package com.javaPractice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to Create a Table :");
        int num = input.nextInt();
        printMultiplicationTable(num);
        input.close();

    }

    public static void printMultiplicationTable(int num) {
//int i = 1; // initialization
//while (i<=10){ // condition
//    System.out.println(num + " X " + i + " = " + (num * i));
//    i++; // Updation
//}
        for (int i = 1; i <=10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
