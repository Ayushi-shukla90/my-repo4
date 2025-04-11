import java.util.Scanner;

public class table {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a = in.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(i*a);
}
in.close();
    }
}
