package homeworks.hw1307.task3;

import java.util.TreeSet;

/*
Напишите программу на Java для поиска второго по величине элемента в массиве.
    example input:
    [-1, 4, 0, 2, 7, -3]
    example expected:
    4
*/
public class SecondGreatestElement {

    public static Integer secondGreatestValue(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) {
            set.add(i);
        }
        set.pollLast();
        return set.pollLast();
    }
}
