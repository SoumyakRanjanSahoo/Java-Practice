package PracticeProgramsHere;

public class student implements Comparable{
    String name;
    int age;
    int marks;

    public student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", marks=" + marks + "}";
    }

    @Override
    public int compareTo(Object o) {
        return this.marks-((student) o).marks;
    }
}
