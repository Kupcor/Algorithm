package pk.pl.iteration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

public class ReverseArrayIteratorTest implements Test {
    private static final Object[] ARRAY = new Object[] {"A","B","C"};

    @Test
    public void testForwardsIterationBecomesBackwars() {
        ReverseArrayIterator reverseArrayIterator = new ReverseArrayIterator(new ArrayIterator(ARRAY));

        reverseArrayIterator.first();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[2]);

        reverseArrayIterator.next();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[1]);

        reverseArrayIterator.next();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[0]);

        reverseArrayIterator.next();
        Assertions.assertTrue(reverseArrayIterator.isDone());
        try {
            reverseArrayIterator.current();
            Assertions.fail("Not expected behaviour");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test passed");
        }
    }

    @Test
    public void testBackwardsIterationBecomesForward() {
        ReverseArrayIterator reverseArrayIterator = new ReverseArrayIterator(new ArrayIterator(ARRAY));

        reverseArrayIterator.last();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[0]);

        reverseArrayIterator.previous();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[1]);

        reverseArrayIterator.previous();
        Assertions.assertFalse(reverseArrayIterator.isDone());
        Assertions.assertSame(reverseArrayIterator.current(), ARRAY[2]);

        reverseArrayIterator.previous();
        Assertions.assertTrue(reverseArrayIterator.isDone());
        try {
            reverseArrayIterator.current();
            Assertions.fail("Not expected behaviour");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test passed");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
