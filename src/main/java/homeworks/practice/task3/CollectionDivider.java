package homeworks.practice.task3;

import java.util.List;
import java.util.stream.Collectors;

/*
Напишите класс CollectionDivider, который умеет делить список чисел на два списка (четные и нечетные).
Подумайте, какая сигнатура методов должна быть в этом случае.
Напишите тесты.
 */

public class CollectionDivider {

    public static List<Integer> listOfEven(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> listOfOdd(List<Integer> list) {
        return list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }

}
