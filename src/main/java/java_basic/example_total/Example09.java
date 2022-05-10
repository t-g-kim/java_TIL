package java_basic.example_total;

// 반복문
public class Example09 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("========================");

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("========================");

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("========================");

        // break
        for (int j = 0; j < 10; j ++) {
            if (j == 6) {
                break;
            }
            System.out.println(j);
        }

        // continue
        for (int k = 0; k < 10; k ++) {
            if (k == 6) {
                continue;
            }
            System.out.println(k);
        }
    }
}
