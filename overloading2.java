//Overload a method calculateArea for calculating the area of a circle (use radius as the argument),
// rectangle (use length and width), and triangle (use base and height).

public class  overloading2{

     public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

     public double calculateArea(double length, double width) {
        return length * width;
    }

     public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
         return calculateArea(base, height);
    }

    public static void main(String[] args) {
        overloading2 obj= new overloading2();

        System.out.println("Area of Circle: " + obj.calculateArea(5));
        System.out.println("Area of Rectangle:" + obj.calculateArea(4, 6));
        System.out.println("Area of Triangle: " + obj.calculateArea(3, 8, true));
    }
}