public class employee {
    private String name;
    private int id;
    private double salary;

  
    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

  
    public void giveIncrement() {
        this.salary += this.salary * 0.05;
    }

   
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

   
    public static void main(String[] args) {
        employee emp = new employee("maahi", 101, 50000);
        
        System.out.println("Before Increment:");
        emp.printDetails();
        
        emp.giveIncrement();
        
        System.out.println("\nAfter Increment:");
        emp.printDetails();
    }
}