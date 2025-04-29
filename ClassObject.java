
class Student {
    String firstName = "Ayushi";
    String lastName = "Shukla";
    void fullName(){
        System.out.println(firstName + " "+lastName);
    }
}

public class ClassObject {
    public static void main(String[] args) {
    Student obj = new Student();
    obj.fullName();
    }
}