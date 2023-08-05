package homeworks.hw1307.task2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Напишите программу на Java для удаления повторяющихся элементов из массива.
example input:
[0,3,-2,4,3,2]

example expected:
[0,3,-2,4,2]
 */
public class DeleteElement {


    public static Integer[] deleteElem(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set.toArray(new Integer[0]);
    }
}
