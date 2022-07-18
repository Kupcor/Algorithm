package pk.pl.sort;

import main.java.pk.pl.Algorithm;

import java.util.ArrayList;

public class Sort extends Algorithm {

    //TODO describe
    public int[] bubbleSort(int[] array) {
        for (int firstIterator = 0; firstIterator < array.length; firstIterator++) {
            for (int secondIterator = 0; secondIterator < array.length; secondIterator++) {
                if (array[firstIterator] < array[secondIterator]) {
                    Swap swap = new Swap(array[firstIterator], array[secondIterator]);
                    array[firstIterator] = swap.getFirstVar();
                    array[secondIterator] = swap.getSecondVar();
                }
            }
        }
        return array;
    }

    public int[] quickSort(int[] array){
        System.out.println("QuickSort");
        return array;
    }
}
