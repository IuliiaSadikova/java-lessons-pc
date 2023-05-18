package homeworks.hw1105;

import java.util.Iterator;
import java.util.ListIterator;

/* Изменить MyLinkedList на двусвязный список, внести соответствующие доработки.
   Изменить в MyIterator интерфейс с Iterator на ListIterator, также внести соответствующие доработки.
* */

public class ListTest {
    public static void main(String[] args) {
        // создаем лист
        MyLinkedList list = new MyLinkedList();

        // вызов методов
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
//        list.addByIndex("EE", 2);
//        list.addByIndex("FF", 0);


        //System.out.println(list.get(1) + " " + list.get(2));

        //   * Блок тестирования *

        // вывод в консоль размер листа
        System.out.println("Размер листа: " + list.size());
        System.out.println();

        // вывод в консоль лист с пом. toString()
        System.out.println("Вывод с помощью toString()");
        System.out.println(list);
        System.out.println();

        // вывод в консоль лист с пом. for
//        System.out.println("Вывод с помощью for");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println();

        // вывод в консоль лист с пом. for each
//        System.out.println("Вывод с помощью for each");
//        for (String value : list) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//        System.out.println();

        // вывод в консоль лист с пом. итератора
//        System.out.println("Вывод с помощью итератора");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
//        System.out.println();

        // очистка
//        list.clear();
//        System.out.print("После очистки: " + list);
//        System.out.println();
//        System.out.println();

        // вывод в консоль лист с пом. ЛистИтератора
        System.out.println("Вывод в консоль лист с пом. ЛистИтератора");
        ListIterator listIterator = list.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.next();
//        listIterator.next();
//        listIterator.remove();
//        listIterator.set("WW");
//        listIterator.add("QQ");
//        listIterator.add("TT");
//        System.out.println("Next element: " + listIterator.next());
//        System.out.println("Next index: " + listIterator.nextIndex());
        System.out.println("Previous element: " + listIterator.previous());
//        System.out.println("Previous index: " + listIterator.previousIndex());

        System.out.println(list);
//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + " ");
//        }
        System.out.println();
//        System.out.println("HasPrevious");
//        while (listIterator.hasPrevious()) {
//            System.out.print(listIterator.previous() + " ");
//        }

        // c hasPrevious я запуталась, честно говоря... не поняла, возможно ли показать, что есть предыдущий элемент,
        //  если hasNext дошёл до конца и стал null, или это не имеет смысла :(




    }
}
