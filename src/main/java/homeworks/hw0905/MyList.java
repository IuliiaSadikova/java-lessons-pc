package homeworks.hw0905;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
     Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:
     Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();
     Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();
     Выводите разницу во времени после и до в консоль.

    Кроме затраченного времени выводить в консоль больше ничего не нужно,
    т.к. это существенно замедлит работу, смысл эксперимента будет потерян.
    Если отрабатывает очень быстро, и разница не особо понятна, попробовать на 100 миллионах значений.
* */

public class MyList {
    public static void main(String[] args) {

        // 1. Создать лист

        List<Integer> list = new ArrayList<>();

        // 2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
        for (int i = 0; i < 20_000_000; i++) {
            list.add(i);
        }

        long start;
        long finish;

        // 3. Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
        start = System.currentTimeMillis();
        int temp;
        for (Integer value : list) {
            temp = value;
        }

        finish = System.currentTimeMillis();

        System.out.println("For each loop, time: " + (finish - start) + " ms\n");

        // 4. Сделать то же самое с помощью классического for.
        start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("For loop, time: " + (finish - start) + " ms\n");

        // 5. Сделать то же самое с помощью классического for,
        // но сначала вынести размер листа в отдельную переменную,
        // а потом эту переменную использовать внутри условия цикла.

        start = System.currentTimeMillis();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            temp = list.get(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("For loop with size, time: " + (finish - start) + " ms\n");

        // 6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.

        start = System.currentTimeMillis();

        int size6 = list.size();
        for (int i = size6-1; i >= 0; i--) {
            temp = list.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("For back loop with size, time: " + (finish - start) + " ms\n");

        // 7. Сделать то же самое, но используя Iterator.
        start = System.currentTimeMillis();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
        }
        finish = System.currentTimeMillis();
        System.out.println("Iterator with size, time: " + (finish - start) + " ms\n");

        // 8. Сделать то же самое, но используя ListIterator.
        start = System.currentTimeMillis();

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            temp = listIterator.next();
        }
        finish = System.currentTimeMillis();
        System.out.println("List Iterator with size, time: " + (finish - start) + " ms\n");









    }
}
