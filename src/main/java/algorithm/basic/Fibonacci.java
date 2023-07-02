package algorithm.basic;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public static int fnFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fnFibonacci(n) + fnFibonacci(n+1);
    }
}
