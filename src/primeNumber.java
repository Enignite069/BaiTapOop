import java.util.Scanner;

public class primeNumber {
    /**
     * Constructor 1: Check prime number.
     *
     * @param x is the test number.
     * @return if x is Prime Number or not.
     */
    public static boolean isPrime(int x) {
        boolean isprime = true;
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            int tmp = x % i;
            if (tmp == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    /**
     * Main: code run.
     *
     * @param args runner.
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int num = Integer.MAX_VALUE;
        while (num != 0) {
            num = nhap.nextInt();
            System.out.println(isPrime(num));
        }
    }
}