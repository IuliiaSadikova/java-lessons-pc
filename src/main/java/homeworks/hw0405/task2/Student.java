package homeworks.hw0405.task2;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int courseNumber;
    private final double averageGrade;

    public Student(String firstName, String lastName, int courseNumber, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName +
                ", " + courseNumber + " course" +
                ", average grade = " + averageGrade;
    }
}
