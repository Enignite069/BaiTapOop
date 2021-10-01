public class greatestCommonFactor {
    /**
     * find the greatest common factor.
     *
     * @param a - first number.
     * @param b - second number.
     * @return the greatest common factor.
     */
    public static int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
