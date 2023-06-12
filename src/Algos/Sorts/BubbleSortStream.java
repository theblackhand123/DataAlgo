package Algos.Sorts;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class BubbleSortStream {
    int[] intArray;
    public BubbleSortStream(int @NotNull [] intArray){

        this.intArray = intArray;

        IntStream.iterate(intArray.length - 1, lastUnsortedIndex -> lastUnsortedIndex > 0, lastUnsortedIndex -> lastUnsortedIndex - 1)
                .flatMap(lastUnsortedIndex -> IntStream.range(0, lastUnsortedIndex))
                .filter(i -> intArray[i] > intArray[i + 1])
                .forEach(i -> swap(intArray, i, i + 1));

    }

    private static void swap(int[] array, int i, int j) {

        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }
}
