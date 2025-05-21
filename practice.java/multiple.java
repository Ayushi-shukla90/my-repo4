interface cleint1{
    void show();
}
interface cleint2{
    void show();
    void print();
}
class multiple implements cleint1,cleint2{
    public void show(){
        System.out.println("for both");
    }
    public void print(){
        System.out.println("for print");
    }
     public static void main(String[] args){
    multiple m = new multiple();
    m.show();
    m.print();
}
}