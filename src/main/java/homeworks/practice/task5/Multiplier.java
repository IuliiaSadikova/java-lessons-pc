package homeworks.practice.task5;

import java.util.List;

/*
Напишите класс, который для переданной коллекции умножает все элементы на k.
Напишите тесты.
 */
public class Multiplier {

    public static List<Integer> multiply(List<Integer> list, int k) {
        if (list == null) {
            throw new IllegalArgumentException("List should not be null");
        }
        return list.stream()
                .map(x -> x * k)
                .toList();
    }

}
