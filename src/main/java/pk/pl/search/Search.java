package main.java.pk.pl.search;

import main.java.pk.pl.Algorithm;

import java.util.ArrayList;

public class Search extends Algorithm {

    public int binaryIteratingSearch(int[] array, int searchElement) {
        System.out.println();
        return searchElement;
    }

    //  TODO describe
    //  Linear search return first position of searchElement
    public int linearSearch(int[] array, int searchElement) {
        for (int iterator = 0; iterator < array.length; iterator += 1) {
            if (array[iterator] == searchElement) {
                return  iterator;
            }
        }
        return -1;
    }
}
