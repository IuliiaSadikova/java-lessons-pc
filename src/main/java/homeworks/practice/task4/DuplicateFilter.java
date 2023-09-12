package homeworks.practice.task4;

import java.util.List;
import java.util.stream.Collectors;

/*
Напишите класс DuplicateFilter, который умеет удалять числа из переданной коллекции. При этом, его можно настроить таким образом, чтобы он удалял:
Отрицательные числа.
Положительные числа.
Четные числа.
Нечетные числа.

Напишите тесты.
 */

public class DuplicateFilter {

    private boolean negative;
    private boolean positive;

    private boolean evenNumbers;
    private boolean oddNumbers;

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public void setEvenNumbers(boolean evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public void setOddNumbers(boolean oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public List<Integer> delete(List<Integer> list) {
        return list.stream()
                .filter(x -> !(positive && x >= 0))
                .filter(x -> !(negative && x < 0))
                .filter(x -> !(evenNumbers && x % 2 == 0))
                .filter(x -> !(oddNumbers && x % 2 != 0))
                .collect(Collectors.toList());
    }
}
