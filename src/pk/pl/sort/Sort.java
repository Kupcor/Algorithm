package pk.pl.sort;

import pk.pl.Algorithm;

import java.util.ArrayList;

public class Sort extends Algorithm {

    public Sort(ArrayList<Integer> numbersArrayList) {
        super(numbersArrayList);
    }

    //TODO describe
    public int[] bubbleSort(int[] array) {
        for (int firstIterator = 0; firstIterator < array.length; firstIterator++) {
            for (int secondIterator = 0; secondIterator < array.length; secondIterator++) {
                if (array[firstIterator] < array[secondIterator]) {
                    Swipe swipe = new Swipe(array[firstIterator], array[secondIterator]);
                    array[firstIterator] = swipe.getFirstVar();
                    array[secondIterator] = swipe.getSecondVar();
                }
            }
        }
        return array;
    }
}
