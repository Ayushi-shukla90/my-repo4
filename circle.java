public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        double pi = 3.14;
        return 2 * pi * radius;
    }

    public double Radius() {
        return radius;
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {

        circle circle = new circle(5.0); 
        System.out.println("Radius: " + circle.Radius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}