package com.test;

public class ReverseAnInputString {

    public static void main(String[] args){
        String input = "GEEKSTOTEST";
        System.out.println("Original Input = " + input);
        String reverseOfInput = "";
        for(int i=input.length()-1; i>=0; i--){
            reverseOfInput+=input.charAt(i);
        }
        System.out.println("reverseOfInput = " + reverseOfInput);
    }
}
