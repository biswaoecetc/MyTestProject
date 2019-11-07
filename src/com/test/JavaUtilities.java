package com.test;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class JavaUtilities {

    public static Integer[] swapInputNumber(Integer a, Integer b){
        Integer[] numberArray = new Integer[2];
        Integer temp;
        temp = a;
        a = b;
        b = temp;
        numberArray[0] = a;
        numberArray[1] = b;
        return numberArray;
    }

    public static Integer SumOfDigitsOfInputNumber(Integer inputNumber){
        Integer armstrongNumber = null;
        String inputNumString = String.valueOf(inputNumber.intValue());
        int numberOFDigits = inputNumString.length();
        Integer sumOfDigits = 0;
        for(int i = 0; i < numberOFDigits; i++){
            BigInteger digitsBigInt = new BigInteger(String.valueOf(inputNumString.charAt(i)));
            sumOfDigits = sumOfDigits + (digitsBigInt.multiply(digitsBigInt).multiply(digitsBigInt)).intValue();
        }
        return sumOfDigits;
    }

    public static void printAllPermutationsOfString(String rem, String str, Set<String> permutationCombSet){
        //String prefix = null, inputString = null;
        int n = str.length();
        if (n == 0) return;
        else {
            for (int i = 0; i < n; i++) {
                String inputString = str.substring(0, i) + str.substring(i + 1, n);
                String prefix = rem + str.charAt(i);
                permutationCombSet.add(prefix+inputString);
                printAllPermutationsOfString(prefix, inputString, permutationCombSet);
            }
        }
    }
}
