package algorithm.basic;

public class Factorial {
    public static void main(String[] args) {

    }

    public static int fnFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fnFactorial(n-1);
    }
}
