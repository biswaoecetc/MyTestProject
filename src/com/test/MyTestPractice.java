package com.test;

import java.util.HashSet;
import java.util.Set;

public class MyTestPractice {



    public static void main(String [] args){
        /*String s1 = "geeksforgeeks", s2 = "platformforgeeks";
        int countOfCommonChars = 0;
        countOfCommonChars = countCommonCharacter(s1, s2);
        System.out.println("countOfCommonChars  " + countOfCommonChars);*/
        String s1 = "foo";
        String s2 = "foo";
        String s3 = new String("foo");
        String s4 = new String("foo");

        System.out.println("is s1==s2 " + (s1==s2));
        System.out.println("is s3==s4 " + (s3==s4));
        System.out.println("is s1==s3 " + (s1==s3));
        System.out.println("is s2==s4 " + (s2==s4));
        /*String input = "abc";
        Set<String> permutationCombSet = new HashSet<>();
        JavaUtilities.printAllPermutationsOfString("", input, permutationCombSet);

        System.out.println("permCombOfStringInput = " + permutationCombSet);*/
    }

    public static int countCommonCharacter(String s1, String s2){
        int count = 0;
        Set<Character> charSet = new HashSet<>();

        for(int i=0; i< s1.length(); i++){
            System.out.println("i = " + s1.charAt(i));
            for(int j=0; j< s2.length(); j++){
                if( !charSet.contains(s1.charAt(i)) && (s1.charAt(i) == s2.charAt(j))){
                    System.out.println("Matched III = " + s1.charAt(i));
                    System.out.println("Matched " + s2.charAt(j));
                    count++;
                    charSet.add(s1.charAt(i));
                }
            }
        }
        return count;
    }
}
