package Algos.Sorts;

import org.jetbrains.annotations.NotNull;

public class SelectionSort {
    int[] intArray;
    public SelectionSort(){}
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int[] getIntArray() {
        return intArray;
    }
    public void selectionSort(int @NotNull [] intArray){

        this.intArray = intArray;

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i+1]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }
    }
    private static void swap(int[] array, int i, int j) {

        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }
}
