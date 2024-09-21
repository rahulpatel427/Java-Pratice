package com.javaPractice;

import java.util.Scanner;

public class SumOfDigits1 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while (num > 0){
            sum += num%10;
            num /= 10;
        }
            System.out.println("this is value : "+sum);
    }
    }



//    public  static  int sumOfDigits(int num){
//        int sum = 0;
//        while (num>0){
//            sum = sum + num %10;
//            num = num/10;
//        }
//        return sum;
//    }

