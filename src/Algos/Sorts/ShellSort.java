package Algos.Sorts;

import org.jetbrains.annotations.NotNull;

public class ShellSort {
    int[] intArray;
    public ShellSort(){}
    public ShellSort(int @NotNull [] intArray){
        setIntArray(intArray);
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int[] getIntArray() {
        return intArray;
    }
    public void shellSort(int @NotNull [] intArray) {

        for(int gap = intArray.length/2; gap > 0; gap /= 2) {

            for(int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while(j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j-= gap;
                }

                intArray[j] = newElement;
            }

        }
    }

}
