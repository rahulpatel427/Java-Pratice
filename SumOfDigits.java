package com.javaPractice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Program : ");
        System.out.println("Please Enter Any digit Number");
        int num = input.nextInt();
        input.close();
        int sum = sumOfDigits(num);
        System.out.println("The  sum is :" + sum);

    }
//    public  static  int sumOfDigits(int num){
//        int sum = 0;
//        while (num>0){
//            sum = sum + num %10;
//            num = num/10;
//        }
//        return sum;
//    }
public  static  int sumOfDigits(int num){
int sum =0;

while (num > 0){
    sum += num%10;
    num /= 10;
}
return sum;
}
}
