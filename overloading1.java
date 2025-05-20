class overloading1 {
 
    void area(double length, double width) {
        System.out.println("Area of rectangle: " + (length * width));
    }

    void area(double side) {
        System.out.println("Area of square: " + (side * side));
    }

  
    void area(int radius) {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        overloading1 calc = new overloading1();
        calc.area(5.0, 3.0);   
        calc.area(4.0);        
        calc.area(3);         
    }
}