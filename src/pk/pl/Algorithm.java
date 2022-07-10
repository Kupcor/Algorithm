package pk.pl;

import java.util.ArrayList;

public class Algorithm {
    int[] numbers;  //  Integer array - it will contain numbers/data used in algorithms

    //  Assigning numbers from file (numbersArrayList) to array numbers
    public Algorithm(ArrayList<Integer> numbersArrayList){
        this.numbers = new int[numbersArrayList.size()];
        for (int iterator = 0; iterator < this.numbers.length; iterator++){
            this.numbers[iterator] = numbersArrayList.get(iterator);
        }
    }

    public int[] getNumbers() { return this.numbers;}

    //  Simple method to print actual loaded data, can be used to print results of sorting alhorithm on the screen
    public void seeData(int[] array){
        for (int iterator = 0; iterator < array.length; iterator++) {
            if (iterator % 25 == 0 && iterator != 0) {
                System.out.println();
            }
            System.out.print(array[iterator]);
            System.out.print("\t");
        }
    }

    //  Classes
    //  Swipe two data class
    public static class Swipe{
        private int firstVar;
        private int secondVar;

        public Swipe(int firstVar, int secondVar) {
            this.firstVar = firstVar;
            this.secondVar = secondVar;
            swipe();
        }

        public int getFirstVar() { return firstVar;}

        public int getSecondVar() { return secondVar;}

        private void swipe(){
            int tempVar;
            tempVar = this.firstVar;
            this.firstVar = this.secondVar;
            this.secondVar = tempVar;
        }

    }
}
