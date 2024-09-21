package com.javaPractice;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Digit");
        int num = input.nextInt();
        input.close();
        boolean isArmStrong = isArmStrong(num);
        if (isArmStrong){
            System.out.println("The Number is Armstrong.");
        } else {
            System.out.println("The Number is not Armstrong.");
        }
    }


    public  static boolean isArmStrong(int num){
int noOfDigits = noOfDigit(num);
int numCopy =num;
int finalNumber = 0;
while (num > 0){
    int lastDigit = num % 10;
    num /= 10;
    finalNumber += pow(lastDigit, noOfDigits);
}
        return finalNumber == numCopy;
    }

public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while ( num2 > i){
            result *= num1;
            i++;
        }
        return result;
}

public static int noOfDigit(int num){
    int digits = 0;
    while (num > 0){
        digits ++;
        num /= 10;
    }
    return digits;
}
}