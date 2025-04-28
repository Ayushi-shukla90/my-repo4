import java.util.Scanner;

class naturalSum{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n: ");
       int n = sc.nextInt();
       int sum = 1;
       for(int i=1;i<=n;i++){
        System.out.println(i);
        sum += i;
       }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}