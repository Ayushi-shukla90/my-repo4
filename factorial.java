import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = k.nextInt();
        long fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        k.close();
    }
}
