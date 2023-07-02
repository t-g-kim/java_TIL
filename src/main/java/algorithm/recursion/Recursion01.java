package algorithm.recursion;

public class Recursion01 {
    public static void main(String[] args) {
        helloPrint(5);
    }

    public static void helloPrint(int count) {

        System.out.println("Hello world " + count);

        if (count == 0) {
            return;
        }
       helloPrint(count -1);
    }
}
