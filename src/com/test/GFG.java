package com.test;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<?> wild = new ArrayList<Integer>();
        int noOfTestCase = sc.nextInt();
        String inputString = sc.next();
        System.out.println(" Input string : " + inputString);
        int subStringFirstIndex = 0, subStringLastIndex = 0, lengthOfLongestString = 1;
        Set<Character> setOfChar = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (setOfChar.contains(inputString.charAt(i))) {
                if (lengthOfLongestString < (subStringLastIndex - subStringFirstIndex)) {
                    lengthOfLongestString = subStringLastIndex - subStringFirstIndex;
                }
                setOfChar = new HashSet<>();
                setOfChar.add(inputString.charAt(i));
                subStringFirstIndex = i;
                subStringLastIndex = i + 1;
                if (lengthOfLongestString < (subStringLastIndex - subStringFirstIndex)) {
                    lengthOfLongestString = subStringLastIndex - subStringFirstIndex;
                }
                ;
            } else {
                setOfChar.add(inputString.charAt(i));
                subStringLastIndex = i + 1;
            }

        }
        System.out.println("Longest String : " + lengthOfLongestString);

    }

    int remove_duplicate(int a[]) {
        // Your code here
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (!intSet.contains(a[i])) {
                intSet.add(a[i]);
            }
        }
        a = new int[intSet.size()];
        System.out.println("Size of a : " + a[0]);
        Iterator iter = intSet.iterator();
        int count = 0;
        while (iter.hasNext()) {

            a[count] = (int) iter.next();
            count++;
        }
        System.out.println("Size : " + a.length);
        return a.length;
    }

    public static void buildProductArray(int[] arrayOfInputs) {
        int prodArrSize = arrayOfInputs.length;
        int[] productArray = new int[prodArrSize];

        Set<Character> charSet = new HashSet<>();
//        charSet.ad
        for (int j = 0; j < prodArrSize; j++) {
            int productOfArrElements = 1;
            for (int i = 0; i < prodArrSize; i++) {
                if (!(i == j)) {
                    productOfArrElements = productOfArrElements * arrayOfInputs[i];
                }
            }
            productArray[j] = productOfArrElements;
        }
        System.out.print(" \n");
        for (int k = 0; k < productArray.length; k++) {
            System.out.print(" " + productArray[k]);
        }
    }
}