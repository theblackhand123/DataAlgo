package Algos.Sorts;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {
    int[] intArray;
    public BubbleSort(){}
    public void bubbleSort(int @NotNull [] intArray){

        this.intArray = intArray;

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
           for (int i = 0; i < lastUnsortedIndex; i++){
               if (intArray[i] > intArray[i+1]){
                   swap(intArray, i, i+1);
               }
           }
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
