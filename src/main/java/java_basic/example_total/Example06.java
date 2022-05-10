package java_basic.example_total;

import java.util.Random;

// 유용한 클래스 - Random
public class Example06 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10);  // 0 ~ 9
        System.out.println(rand);

        // 0 ~ 9 => 5 ~ 14
        rand = random.nextInt(4) + 5;   // 5 ~ 9
    }
}
