interface walkable{
    void walk();
}
interface runnable{
    void run();
}
class human implements walkable,runnable{
 public  void walk(){
    System.out.println("human is walking");
  }
  public void run(){
    System.out.println("human is running");
  }
public static void main(String[] args){
    human h = new human();
    h.walk();
    h.run();
}
}