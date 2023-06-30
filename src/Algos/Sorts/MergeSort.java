package Algos.Sorts;

import java.util.Arrays;

public class MergeSort {
    protected int[] intArray;
    public MergeSort(){}
    public MergeSort(int[] intArray){
        setIntArray(intArray);
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int[] getIntArray() {
        return intArray;
    }
    public static void mergeSort(int[] input, int start, int end){

        //return if the last element of array is left
        if (end - start < 2){
            return;
        }
        //find mid-point of array to start binary division
        int mid = (start + end) / 2;
        //now run mergeSort for elements for the first half
        mergeSort(input, start, mid);
        //then run mergeSort for elements for the second half
        mergeSort(input, mid, end);
        //then merge the sorted arrays
        merge(input, start, mid, end);
    }
    protected static void merge(int[] input, int start, int mid, int end) {
        // if left element is less than element, sort is done
        if(input[mid-1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        //a temporary array to contain the merged arrays left and right
        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //handling remaining elements that have not been traversed
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
    public static String print(int[] input) {
        return Arrays.toString(input);
    }

}
