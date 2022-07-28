package tinyjdk;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object[] a;
    private int len;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        assert capacity > 0;
        a = new Object[capacity];
        len = 0;
    }

    @Override
    public void add(T e) {
        if (len >= a.length) {
            a = Arrays.copyOf(a, a.length * 2);
        }
        a[len++] = e;
    }

    @Override
    public int indexOf(T e) throws NotFoundException {
        int i = 0;
        for (; i < len; i++)
            if (a[i].equals(e))
                return i;
        throw new NotFoundException("Element not found!");
    }

    @Override
    public void remove(T e) throws NotFoundException {
        int i = indexOf(e);
        for (int j = i; j < size()-1; j++)
            a[j] = a[j+1];
        len--;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public void clear() {
        a = new Object[len + 1];
        len = 0;
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public Object[] toArray() {
        return a;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < len;
            }

            @Override
            public T next() {
                return (T) a[pos++];
            }
        };
    }

    @Override
    public T get(int i) {
        return (T)a[i];
    }

    @Override
    public void set(int i, T e) {
        a[i] = e;
    }
}
