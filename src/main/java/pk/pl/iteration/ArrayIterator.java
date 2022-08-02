package pk.pl.iteration;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayIterator implements Iterator{
    private final Object[] _array;  //  Array, iterator navigates over
    private final int _first;       //  Array first element index
    private final int _last;;       //  Array last element index
    private int _current;           //  Array current element index

    //  Arguments:  array, array first element index, array length
    public ArrayIterator(Object[] array, int start, int length) {
        assert array != null : "Array is not defined";
        assert start >= 0 : "Negative index of start array element";
        assert start < array.length : "Start index is beyond array";
        assert length >= 0 : "Array has negative number of elements";

        this._array = array;
        this._first = start;
        this._last = start + length - 1;

        assert _last < array.length : "Last index is beyond array";
    }

    public ArrayIterator(Object[] array) {
        assert array != null : "array is not defined";
        this._array = array;
        this._first = 0;
        this._last = _array.length - 1;
    }

    public void first() {
        this._current = this._first;
    }

    public void last() {
        this._current = this._last;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        ++this._current;
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
        --this._current;
        return null;
    }

    //  Return true if _current is beyond the array
    public boolean isDone() {
        return this._current < this._first || this._current > this._last;
    }

    public Object current() throws ArrayIndexOutOfBoundsException {
        if (this.isDone()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this._array[this._current];
    }
}
