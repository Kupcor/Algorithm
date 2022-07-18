package pk.pl.iteration;

public class PowerCalculator {
    //  Singeltone
    public static final PowerCalculator INSTANCE = new PowerCalculator();

    private PowerCalculator(){}

    public int calculate(int base, int exponent) {
        assert exponent >= 0 : "Exponent must not be negative";
        int result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return  result;
    }
}
