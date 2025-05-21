interface cleint{
    void print();
    void show();
}
class Dev implements cleint{
    @Override
    public void print(){
        System.out.println("bill");
    }
    @Override
    public void show(){
        System.out.println("biryani");
    }
}
public class Interface{
    public static void main(String[] args){
        Dev d = new Dev();
        d.print();
        d.show();
    }
}