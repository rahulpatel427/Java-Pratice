package com.javaPractice;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator\n ");
        System.out.println("Please Enter your base in cm : ");
        double base = input.nextDouble();
        System.out.println("Please Enter your perpendicular height in cms");
        double height = input.nextDouble();
        double result = (base * height)/2;

        System.out.println("The area of your triangle is :" + result);
    }
}
