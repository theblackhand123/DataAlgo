package Algos.Sorts;

import java.util.Arrays;

public class QuickSort {
    protected int[] intArray;
    public QuickSort(){}
    public QuickSort(int[] intArray){
        setIntArray(intArray);
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int[] getIntArray() {
        return intArray;
    }
    public static void quicksort(int[] input, int start, int end){
        if(end - start < 2) return;
        int pivotIndex = partition(input, start, end);
        quicksort(input, start, pivotIndex);
        quicksort(input, pivotIndex + 1, end);
    }
    private static int partition(int[] input, int start, int end) {
        //Uses the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j) {

            //Empty loop body. Traversing right to left
            while(i < j && input[--j] >= pivot) {}
            //When j is bigger, replace i with j
            if(i < j){ input[i] = input[j]; }

            //Empty loop body. Traversing left to right
            while(i < j && input[++i] <= pivot) {}
            if(i < j) { input[j] = input[i]; }
        }

        input[j] = pivot;

        return j;
    }


}
