package algorithm.dfs;

public class Example05 {
    public static void main(String[] args) {
        recursion(5);
    }

    public static int recursion(int number) {
        if (number > 0) {
            System.out.println(number + " ");
            return recursion(number - 1);
        }else {
            return 0;
        }
    }
}