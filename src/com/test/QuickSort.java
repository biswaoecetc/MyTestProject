package com.test;


public class QuickSort {

    public static void main(String [] args){
        int[] arrayToSorted = {12, 3, 7, 18, 1, 9, 33, 25, };//{10,16,8,12,15,6,3,9,5, };
        try{
            partitionArray(arrayToSorted, 0, arrayToSorted.length-1);
        }catch(Exception e){
            e.printStackTrace();
        }


        for(int i=0; i<arrayToSorted.length; i++){
            System.out.print(" " + arrayToSorted[i]);
        }


    }
    public static void quickSort(int[] arrayToBesorted, int begin, int end){
        int partitionIndex;
        System.out.println("arrayToBesorted = begin = " + begin + "  end =  " + end);
       /* if(begin < end){
            partitionIndex = partitionArray(arrayToBesorted, begin, end);
            System.out.println("partitionIndex = " + partitionIndex);
            if(partitionIndex > begin) {
                quickSort(arrayToBesorted, begin, partitionIndex);
            }
            if(partitionIndex + 1 < end) {
                quickSort(arrayToBesorted, partitionIndex + 1, end);
            }
            System.out.println("after partitionIndex = " + partitionIndex);

        }*/

    }

    public static void partitionArray(int[] arrayToBesorted, int begin, int end){
//        {10,16,8,12,15,6,3,9,5, }
        if (!(end > begin)) {
            return;
        }
        int i = begin;
        int j = end + 1;
        int pivot = arrayToBesorted[begin];
        i++;
        j--;
        while(i <= j){
            while(arrayToBesorted[i] < pivot) {
                i++;
            }
            while(arrayToBesorted[j] > pivot) {
                j--;
            }

            if(i <= j && j !=0){

                int temp = arrayToBesorted[i];
                arrayToBesorted[i] = arrayToBesorted[j];
                arrayToBesorted[j] = temp;
                i++;
                j--;
            }
        }
        int temp = arrayToBesorted[j];
        arrayToBesorted[j] = arrayToBesorted[begin];
        arrayToBesorted[begin] = temp;
        partitionArray(arrayToBesorted, begin, j-1);
        partitionArray(arrayToBesorted, j + 1, end);
    }
}
