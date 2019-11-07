package com.test;

import java.util.*;

public class TestsIfArrayOfNumbersContigous {

        public static void main (String[] args) {
            //code

            Thread th = new Thread();
            Scanner sc = new Scanner(System.in);

            int noOfTestCase = sc.nextInt();
            System.out.println("No of Test cases : " + noOfTestCase);
            while(noOfTestCase > 0){
                int noOfArrayElements = sc.nextInt();
                System.out.println("No of array elements : " + noOfArrayElements);
                int count = 0;
                int[] arrayOfInputs = new int[noOfArrayElements];
                while(count < noOfArrayElements){
                    arrayOfInputs[count] = sc.nextInt();
                    count++;
                }

                printArrayElements(arrayOfInputs);
                System.out.println("/n");
                int n = removeDuplicate(arrayOfInputs);
                /*quickSort(arrayOfInputs, 0, arrayOfInputs.length-1);
                printArrayElements(arrayOfInputs);
                checkIfContigous(arrayOfInputs);*/
                printArrayElements(arrayOfInputs);
                noOfTestCase--;
            }
        }
    public static int removeDuplicate(int a[])
    {
        // Your code here
        LinkedHashSet<Integer> ts = new LinkedHashSet<Integer>();
        for(int i=0;i<a.length;i++){ ts.add(a[i]);}
        int s = ts.size();
        int i= 0;
        for(int e:ts){
            a[i]= e;
            i++;
        }
//        String s= "XYZ";
//        s.
        return s;
    }

        public static void checkIfContigous(int[] inputArray){
            boolean isContigous = true;
            for(int element = 0; element < inputArray.length-1; element++){
                int difference = inputArray[element+1] - inputArray[element];
                if(difference > 1 ){
                    isContigous = false;
                    break;
                }
                if(difference == 0){
                    isContigous = true;
                }
                if(difference == 1){
                    isContigous = true;
                }
            }

            System.out.println("Is input array contigous : " + isContigous);
        }

        public static void quickSort(int[] a, int low, int high){
            if(!(high > low)) return;
            int pivot = a[low];
            int i = low;
            int j = high + 1;
            i++;
            j--;

            while(i <= j){
                while(a[i] < pivot){
                    i++;
                }
                while(a[j] > pivot){
                    j--;
                }
                if(i <= j){
                    swapElements(a, i, j);
                    i++;
                    j--;
                }

            }

            swapElements(a, low, j);

            quickSort(a, low, j-1);
            quickSort(a, j+1, high);
        }

        public static void swapElements(int[] arrayOfInputs, int first, int second){
            int temp = arrayOfInputs[first];
            arrayOfInputs[first] = arrayOfInputs[second];
            arrayOfInputs[second] = temp;
        }

        public static void printArrayElements(int[] arrayOfInputs){
            for(int i =0; i< arrayOfInputs.length; i++){
                System.out.print(arrayOfInputs[i] + "  ");
            }
        }
}
