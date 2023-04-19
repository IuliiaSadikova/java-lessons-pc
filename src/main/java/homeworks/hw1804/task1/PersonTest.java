package homeworks.hw1804.task1;
/**
 * 1 уровень сложности: 1. Создать класс Person, который содержит:
 * переменные fullName, age;
 * методы move() и talk(), в которых просто вывести на консоль сообщение -"имя идёт" и "имя говорит".
 * Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 * Вызовите методы у обоих объектов
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Vincent van Gogh",170);
        person2.move();
        person2.talk();
    }
}


