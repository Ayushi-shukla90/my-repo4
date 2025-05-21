interface A{
    void display();
}
interface B{
    void display();
}
class demo implements A,B{
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
    }
}