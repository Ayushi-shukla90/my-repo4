import java.util.Scanner;

class naturalProduct{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n: ");
       int n = sc.nextInt();
       int product = 1; 
       for(int i=1;i<=n;i++){
        System.out.println(i);
        product *= i;
       }
       System.out.println("The product of first " + n + " natural numbers is: " + product);
    }
}