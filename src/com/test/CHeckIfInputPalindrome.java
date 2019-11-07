package com.test;

import java.util.Scanner;

public class CHeckIfInputPalindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter input number : ");
        Integer inputNumber = sc.nextInt();
        System.out.print(" input number is : " + inputNumber);
        int tempDigit = 0;
        Integer reverseInt = 0;
        while(inputNumber > 0){
            tempDigit = inputNumber % 10;
            inputNumber = inputNumber/10;
            reverseInt = reverseInt * 10 + tempDigit;
        }

        System.out.println(" Reverse of input number is : " + reverseInt);
        if(inputNumber == reverseInt){
            System.out.println(" YES, It's a palindrome number");
        }else{
            System.out.println(" NO, NOT a palindrome number");

        }
    }
}
