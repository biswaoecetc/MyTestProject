package com.test;

import java.util.Arrays;

public class SortStringArray {


    public static void main(String[] args){
        String[] stringArray = {"Pawan", "Kalyan", "Barun", "56", "Ayush"};
//        String[] stringArray = {"50", "11", "3", "2", "30"};
        Arrays.sort(stringArray);
        printInputArray(stringArray);

    }
    public static void printInputArray(String[] stringArray){
        for(int i = 0; i< stringArray.length; i++){
            System.out.print(" " + stringArray[i]);
        }
    }
}
