package com.javaPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num = input.nextInt();
        input.close();
        boolean result = isPrime(num);
        if (result){
            System.out.println(num + " is prime");
        } else{
            System.out.println(num +" is Not Prime");
        }

    }
    public  static  boolean isPrime(int num){
        int i =2;
        while (i < num){
           if (num % i == 0){
               return  false;
           }
           i++;
        }
        return  true;
    }
}
