package DSA;

public class ArrayListImple {
    Object[] o = new Object[10];
    int count = 0;

    public void add(Object ele) {
        if (count >= o.length)
            increase();
        o[count++] = ele;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void increase() {
        Object[] a = new Object[o.length + 6];
        for (int i = 0; i < o.length; i++)
            a[i] = o[i];
        o = a;
    }

    public Object get(int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        return o[index];
    }

    public void addPos(Object ele, int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        if (count >= o.length)
            increase();
        for (int i = size(); i > index; i--)
            o[i] = o[i - 1];
        o[index] = ele;
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        for (int i = index; i < size()-1; i++)
            o[i] = o[i + 1];
        count--;
    }
}
