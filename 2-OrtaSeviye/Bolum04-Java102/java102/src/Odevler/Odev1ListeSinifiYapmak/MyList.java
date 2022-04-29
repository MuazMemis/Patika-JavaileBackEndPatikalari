package Odevler.Odev1ListeSinifiYapmak;

import java.util.Arrays;

public class MyList<T> {
    private T[] list;
    int size = 0;
    private final int CAPACITY = 10;

    public MyList(int capacity) {
        list = (T[]) new Object[capacity];
    }

    public MyList() {
        list = (T[]) new Object[CAPACITY];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return list.length;
    }

    public void add(T data) {
        if (size == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[size++] = data;
    }

    public T get(int index) {
        return list[index] == null ? null : (T) list[index];
    }


    public T remove(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            T deleted = list[index];
            System.arraycopy(list, index + 1, list, index, size - index);
            size--;
            return deleted;
        }
    }

    public T set(int index, T data) {
        if (index < 0 || index > size) {
            return null;
        } else {
            list[index] = data;
            return data;
        }
    }

    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < size; i++) {
            if (list[i] != null) {
                result += list[i];
                if (i != (size - 1)) {
                    result += ",";
                }
            }
        }

        result += "]";
        return result;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (list[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (list[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    public T[] toArray() {
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = list[i];
        }
        return newArr;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }

        list = Arrays.copyOf(list, CAPACITY);
        size = 0;
    }


    public MyList<T> sublist(int start, int finish) {
        MyList<T> newSubList = new MyList<>(finish - start);
        if (start < 0 || finish > getCapacity() || finish < 0 || finish < start) {
            return null;
        }
        for (int i = start; i <= finish; i++) {
            newSubList.add(list[i]);
        }
        return newSubList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (list[i] == data)
                return true;
        }
        return false;
    }

}
