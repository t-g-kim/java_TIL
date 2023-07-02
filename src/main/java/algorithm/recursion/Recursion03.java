package algorithm.recursion;

public class Recursion03 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int number) {

        if (number == 0) {
            return 0;
        }

        if (number == 1 || number ==2) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);

        }
    }
}
