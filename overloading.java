class OverloadingExample {
     void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
  void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.sum(5, 10);          
        obj.sum(1, 2, 3);     
        obj.sum(2.5, 3.5);       
    }
}