package homeworks.hw1307.task4;

import java.util.TreeSet;

/*Напишите программу Java для поиска второго наименьшего элемента в массиве.
example input:
[-1, 4, 0, 2, 7, -3]

example expected
-1
*/
public class SecondSmallestElement {

    public static Integer secondSmallestValue(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) {
            set.add(i);
        }
        set.pollFirst();
        return set.pollFirst();
    }


}
