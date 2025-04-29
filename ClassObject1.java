
class Rectangle{
  int length = 5;
  int width = 10;
  void area(){
    System.out.println("Area = " + length*width);
  }
}

public class ClassObject1 {
    public static void main(String[] args) {
    Rectangle obj = new  Rectangle();
    obj.area();
    }
}