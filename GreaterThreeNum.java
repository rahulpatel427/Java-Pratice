package com.javaPractice;

import java.util.Scanner;

public class GreaterThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of the Three");
        System.out.println("Enter the First Number : ");
        int first = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.println("Enter the Third Number : ");
        int third = input.nextInt();

        if(first >= second && first >= third){
            System.out.println("The "+ first + " Number is Greatest Number.");
        }  else if(second >=third){
            System.out.println("The " + second + " Number is Greatest Number.");
        } else  {
            System.out.println("The " + third + " Number is Greatest Number.");
        }

    }
}
