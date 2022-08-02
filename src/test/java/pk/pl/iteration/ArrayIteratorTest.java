package pk.pl.iteration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pk.pl.iteration.ArrayIterator.*;

import java.lang.annotation.Annotation;

public class ArrayIteratorTest implements Test {

    @Test
    public void testIterationRespectsBounds() {
        Object[] array = new Object[] {"A", "B", "C", "D", "E", "F"};
        ArrayIterator arrayIterator = new ArrayIterator(array, 1, 3);

        arrayIterator.first();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[1], arrayIterator.current());

        arrayIterator.next();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[2], arrayIterator.current());

        arrayIterator.next();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[3], arrayIterator.current());

        arrayIterator.next();
        Assertions.assertTrue(arrayIterator.isDone());

        try {
            arrayIterator.current();
            Assertions.fail("Not expected behaviour");  //  Not available behaviour
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test passed");
        }
    }

    @Test
    public void testBackwardsIteration() {
        Object[] array = new Object[] {"A","B","C"};
        ArrayIterator arrayIterator = new ArrayIterator(array);

        arrayIterator.last();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[2], arrayIterator.current());

        arrayIterator.previous();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[1], arrayIterator.current());

        arrayIterator.previous();
        Assertions.assertFalse(arrayIterator.isDone());
        Assertions.assertSame(array[0], arrayIterator.current());

        arrayIterator.previous();
        Assertions.assertTrue(arrayIterator.isDone());
        try {
            arrayIterator.current();
            Assertions.fail("Not expected behaviour");  //  Not available behaviour
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test passed");
        }
    }

    @Override public Class<? extends Annotation> annotationType() {
        return null;
    }
}
