package algorithm.basic;

public class MathClassExample {
    public static void main(String[] args) {
        int result1 = Math.max(10,2);
        int result2 = Math.min(10,4);

        int result3 = Math.abs(-1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        double a = 1.23456;
        String b = String.format("%.1f", a);
        System.out.println(b);
    }
}
