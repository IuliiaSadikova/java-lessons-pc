package homeworks.hw1307.task1;

/*
Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
example input:
Array1: [1, 2, 5, 5, 8, 9, 7, 10]

Array2: [1, 0, 6, 15, 6, 4, 7, 0]

example expected:
[1,7]
 */


import java.util.*;

public class CommonElements {

    public static Set<Integer> commonElem(int[] array1, int[] array2) {
        if (array1 == null) {
            throw new IllegalArgumentException("Array 1 should not be null");
        }
        if (array2 == null) {
            throw new IllegalArgumentException("Array 2 should not be null");
        }
        Set<Integer> set = new HashSet<>();
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    set.add(k);
                }
            }
        }
        return set;
    }

}
