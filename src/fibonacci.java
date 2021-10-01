import java.util.Scanner;

public class fibonacci {
    public static long findFibonacci(long n) {
        long x = 0;
        long y = 1;
        long ketqua = 0;

        if (n <= 1) {
            return n;
        } else {
            for (long i = 2; i <= n; i++) {
                ketqua = x + y;
                x = y;
                y = ketqua;
            }
            if (ketqua < 0) {
                return Long.MAX_VALUE;
            } else {
                return ketqua;
            }
        }
    }
}

