package pk.pl.iteration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.lang.annotation.Annotation;

public class PowerCalculatorTest implements Test {

    @Test
    public void testAnythingRaisedToThePowerOfZeroIsOne() {
        PowerCalculator powerCalculator = PowerCalculator.INSTANCE;
        Assertions.assertEquals(1, powerCalculator.calculate(0,0));
        Assertions.assertEquals(1, powerCalculator.calculate(1,0));
        Assertions.assertEquals(1, powerCalculator.calculate(4,0));
        Assertions.assertEquals(1, powerCalculator.calculate(9,0));
        Assertions.assertEquals(1, powerCalculator.calculate(1024,0));
    }

    @Test
    public void testAnythingRaisedToThePowerOfOneIsItself() {
        PowerCalculator powerCalculator = PowerCalculator.INSTANCE;
        Assertions.assertEquals(0, powerCalculator.calculate(0,1));
        Assertions.assertEquals(1, powerCalculator.calculate(1,1));
        Assertions.assertEquals(4, powerCalculator.calculate(4,1));
        Assertions.assertEquals(27, powerCalculator.calculate(27,1));
        Assertions.assertEquals(1024, powerCalculator.calculate(1024,1));
    }

    @Test
    public void testArbitrary() {
        PowerCalculator powerCalculator = PowerCalculator.INSTANCE;
        Assertions.assertEquals(0,powerCalculator.calculate(0,2));
        Assertions.assertEquals(1,powerCalculator.calculate(1,2));
        Assertions.assertEquals(4,powerCalculator.calculate(2,2));
        Assertions.assertEquals(16,powerCalculator.calculate(4,2));
        Assertions.assertEquals(1024,powerCalculator.calculate(2,10));
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
