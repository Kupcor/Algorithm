package main.java.pk.pl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class DataBase {
    String path;                                                        //  Path to file
    ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();     //  Array list to contain numbers from file



    //  Assigning data from file to numbersArrayList
    public void readData (String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        while (in.hasNextInt()) {
            this.numbersArrayList.add(in.nextInt());
        }
    }

    //  Random generator of number && saving randomize numbers to file
    public void writeRandomData (String path, int size, int boundary) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter out = new PrintWriter(path);
        for (int iterator = 0; iterator<size; iterator++){
            int randomValue = random.nextInt(boundary) + 1;

            if (iterator % 20 == 0 && iterator != 0) {
                out.println();
            }
            out.print(randomValue);
            out.print(" ");
        }
        out.close();
    }

    //  Getter for numbersArrayList
    public ArrayList<Integer> getNumbersArrayList(){
        return this.numbersArrayList;
    }
}
