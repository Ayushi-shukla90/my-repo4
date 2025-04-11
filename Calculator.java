import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st num: ");
        int a = in.nextInt();

        System.out.println("Enter 2nd num: ");
        int b = in.nextInt();

        System.out.println("Enter command (+, -, *, /, %): ");
        char c = in.next().charAt(0);

        switch(c){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Cannot modulo by zero.");
                }
                break;
            default:
                System.out.println("Invalid command");
        }

        in.close(); 
    }
}
