package main.java.pk.pl.simple;

public class simple {


    //  Simple multiplying algorithm
    private float multiply(float a, float b) {
        float result = 0;
        while (a > 0) {
            result += b;
            a -= 1;
        }
        return result;
    }


}
