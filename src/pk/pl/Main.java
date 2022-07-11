package pk.pl;

import pk.pl.search.Search;
import pk.pl.sort.Sort;

import java.io.FileNotFoundException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Data data = new Data("data.txt");
        Search search = new Search();
        search.getDataFromArrayList(data.getNumbersArrayList());
        System.out.println(search.linearSearch(search.getNumbers(), 72));
    }
}
