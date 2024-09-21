package com.javaPractice;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 = input.nextInt();

        System.out.println("The [+] is : " + (num1 + num2));
        System.out.println("The [-] is : " + (num1 - num2));
        System.out.println("The [*] is : " + (num1 * num2));
        System.out.println("The [/] is : " + (num1 / num2));
        System.out.println("The [%] is : " + (num1 % num2));

    }
}
