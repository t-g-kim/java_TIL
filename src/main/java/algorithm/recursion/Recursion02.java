package algorithm.recursion;

public class Recursion02 {
    public static void main(String[] args) {
        System.out.println(multiple(5));
    }

    public static int multiple(int number) {
        if(number == 1) {
            return 1;
        }
        number *= multiple(number-1);
        return number;
    }
}
