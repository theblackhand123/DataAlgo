package Algos.Sorts;

public class CountingSort {
    protected int[] intArray;
    public CountingSort(){}
    public CountingSort(int[] intArray){
        setIntArray(intArray);
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int[] getIntArray() {
        return intArray;
    }
    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];

        for (int k : input) {
            countArray[k - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

}
