package homeworks.hw0405.task2;
/*
Создать класс Студент с полями имя, фамилия, номер курса, средний балл.
Создать лист студентов, куда поместить нескольких студентов с разными значениями полей.
Написать метод, который принимает лист студентов и при помощи итератора
    удаляет всех студентов с номером курса меньше 3.
Написать метод, который принимает лист студентов и имя в качестве второго параметра.
С помощью итератора метод должен удалять всех студентов с таким именем.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Claude", "Monet", 5, 5.0);
        Student student2 = new Student("Edouard", "Manet", 4, 4.5);
        Student student3 = new Student("Paul", "Gauguin", 4, 4.0);
        Student student4 = new Student("Vincent", "van Gogh", 3, 4.9);
        Student student5 = new Student("Paul", "Cezanne", 2, 3.5);
        Student student6 = new Student("Pierre-Auguste", "Renoir", 1, 3.1);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("All students: \n" + students);
        System.out.println();

        removeStudentsByCourse(students);
        System.out.println("Students sorted by course: \n" + students);
        System.out.println();

        removeStudentsByName(students, "Paul");
        System.out.println("Students sorted by name: \n" + students);
        System.out.println();
    }

    public static void removeStudentsByCourse(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student tempStudent = iterator.next();
            if (tempStudent.getCourseNumber() < 3) {
                iterator.remove();
            }
        }
    }

    public static void removeStudentsByName(List<Student> students, String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student tempStudent = iterator.next();
            if (tempStudent.getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
    }
}
