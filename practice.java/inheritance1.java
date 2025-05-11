
class person{
    void displayName(){
        System.out.println("Name: john");
    }
}
class student extends person{
    void displayClass(){
        System.out.println("class:10th");
    }
}
class monitor extends student{
    void checkDiscipline(){
        System.out.println("Discipline: good");
    }
}
class inheritance1{
    public static void main(String[] args) {
        monitor m = new monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}