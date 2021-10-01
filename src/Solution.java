public class Solution {
    // part a
    private int numerator;
    public int denominator;

    // getter-setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = 1;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public Solution reduce(Solution s) {
        int temp = gcd(s.numerator, s.denominator);
        s.numerator /= temp;
        s.denominator /= temp;
        return s;
    }

    public Solution add(Solution s) {
        int numerator = this.numerator * s.denominator + s.numerator * this.denominator;
        int denominator = this.denominator * s.denominator;
        Solution fraction = new Solution(numerator, denominator);
        reduce(fraction);
        return fraction;
    }

    public Solution subtract(Solution s) {
        int numerator = this.numerator * s.denominator - s.numerator * this.denominator;
        int denominator = this.denominator * s.denominator;
        Solution fraction = new Solution(numerator, denominator);
        reduce(fraction);
        return fraction;
    }

    public Solution multiply(Solution s) {
        int numerator = this.numerator * s.numerator;
        int denominator = this.denominator * s.denominator;
        Solution fraction = new Solution(numerator, denominator);
        reduce(fraction);
        return fraction;
    }

    public Solution divide(Solution s) {
        int numerator = this.numerator * s.denominator;
        int denominator = this.denominator * s.numerator;
        Solution fraction = new Solution(numerator, denominator);
        reduce(fraction);
        return fraction;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
        }
        return true;
    }
}
