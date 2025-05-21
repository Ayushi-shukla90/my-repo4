
interface Vehicle {
    void start();
}

class Car1 implements Vehicle {
      public void start() {
        System.out.println("Vehicle is starting...");
    }

    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.start(); 
    }
}
