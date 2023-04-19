package homeworks.hw1804.task2;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Создайте три экземпляра этого класса.
 * Выведите на консоль значения их переменных.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит имя”.
 * Метод getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 */
public class PhoneTest {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+987654123", "Nokia", 300);
        Phone phone2 = new Phone("+876543234", "Motorola", 350);
        Phone phone3 = new Phone("+765432345", "Alcatel", 290);
        System.out.println(phone1.getPhonesInfo());
        System.out.println(phone2.getPhonesInfo());
        System.out.println(phone3.getPhonesInfo());

        phone1.receiveCall("Мама");
        System.out.println("Номер: " + phone1.getNumber());
    }
}
