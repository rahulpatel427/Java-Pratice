package com.javaPractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Digit");
        int num = input.nextInt();
        input.close();
        int result = reverseNumber(num);
        System.out.println( "This is reverse Number : " + result );
    }
    public static int reverseNumber(int num){
        int reverse = 0;

        while (num>0){
            int digit = num % 10;
            System.out.println("This is Digit : "+digit);
            reverse = reverse *  10 + digit;
            System.out.println("This is Reverse : "+reverse);
             num /= 10;
            System.out.println("This is Num/10 : " +num);
        }
        return reverse;
    }
}

