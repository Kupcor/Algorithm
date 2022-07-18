package main.java.pk.pl;

import main.java.pk.pl.search.Search;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DataBase dataBase = new DataBase();
        Search search = new Search();
        search.getDataFromArrayList(dataBase.getNumbersArrayList());
        System.out.println(search.linearSearch(search.getNumbers(), 72));
    }
}
