package homeworks.hw0405.task1;

import java.util.Arrays;

public class MyArrayList {
    private String[] list = new String[10];
    private int size = 0;

    private final int ADDED_SIZE = 5;

    public void set(String value, int index) {
        if (index < size) {
            list[index] = value;
        }
    }

    public String[] getList() {
        return list;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += list[i];
            if (i != size - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public void add(String value) {
        if (size == list.length) {
            String[] newList = new String[list.length + ADDED_SIZE];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size] = value;

        size++;

    }

    public int size(String[] array) {
        return size;
    }


    public void removeElementByIndex(int index) {
        String[] arrayAfterRemove = new String[list.length - 1];
        for (int i = 0; i < index; i++) {
            arrayAfterRemove[i] = list[i];
        }
        for (int i = index; i < list.length - 1; i++) {
            arrayAfterRemove[i] = list[i + 1];
        }
        size--;
        list = arrayAfterRemove;
    }
}


