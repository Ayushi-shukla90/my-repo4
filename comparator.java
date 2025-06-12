import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollN;
    int age;
    String name;
    public Student(int rollN, int age, String name) {
        this.rollN = rollN;
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return rollN + " " + age + " " + name;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollN implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollN, s2.rollN);
    }
}

class SortByAge implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class comparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(2, 32, "rahul"));
        list.add(new Student(4, 33, "rohit"));
        list.add(new Student(5, 31, "mohit"));

        Collections.sort(list, new SortByName());
        System.out.println("Sorted by name:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new SortByRollN());
        System.out.println("Sorted by roll number:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new SortByAge());
        System.out.println("Sorted by age:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}