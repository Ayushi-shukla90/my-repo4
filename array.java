import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value of arr: ");
     for(int j=0;j<n;j++)
{
        arr[j]=in.nextInt();
    }
      //  int[] arr = {1,2,3,4,5,6};
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
