public class PrimeNum {
    public static void main(String[] args) {
        int a = 10;
        boolean prime = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "prime ": "not prime");
    }
}
