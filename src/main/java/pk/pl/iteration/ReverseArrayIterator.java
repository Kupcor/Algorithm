package pk.pl.iteration;

import java.util.Iterator;
import java.util.function.Consumer;

public class ReverseArrayIterator implements Iterator {
    private final ArrayIterator _arrayIterator;

    public ReverseArrayIterator(ArrayIterator iterator) {
        super();
        assert iterator != null : "Iterator is not defined";
        this._arrayIterator = iterator;
    }

    public boolean isDone() {
        return this._arrayIterator.isDone();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        this._arrayIterator.previous();
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }

    public Object previous() {
        this._arrayIterator.next();
        return null;
    }

    public Object current() throws ArrayIndexOutOfBoundsException{
        return this._arrayIterator.current();
    }

    public void first() {
        this._arrayIterator.last();
    }

    public void last() {
        this._arrayIterator.first();
    }
}
