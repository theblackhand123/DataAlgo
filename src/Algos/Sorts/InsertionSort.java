package Algos.Sorts;

import org.jetbrains.annotations.NotNull;

public class InsertionSort {
    int[] intArray;
    public InsertionSort(){}
    public InsertionSort(int @NotNull [] intArray) {

        this.intArray = intArray;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];

            }

            intArray[i] = newElement;
        }

    }
}
