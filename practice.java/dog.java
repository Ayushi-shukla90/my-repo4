interface animal{
    void makeSound();
}
public class dog implements animal{
    public void makeSound(){
        System.out.println("bark");
    }
    public static void main(String[] args){
        dog d = new dog();
        d.makeSound();
    }
} 