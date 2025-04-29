
class carData{
  String brand;
  String model;
  int price;
  void display (){
    System.out.println("Brand: " + brand);
    System.out.println("model: " + model);
    System.out.println("price: " + price);
  }

}

public class Car {
    public static void main(String[] args) {
  carData car1 = new carData();
  car1.brand = "porche";
  car1.model = "911";
  car1.price = 1000000;
  car1.display();

    }
}