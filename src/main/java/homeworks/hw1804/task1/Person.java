package homeworks.hw1804.task1;

class Person {
    private String fullName;
    private Integer age;

    Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }
    Person() {

    }
    void move() {
        System.out.println(fullName + " идёт");
    }
    void talk() {
        System.out.println(fullName + " говорит");
    }
}