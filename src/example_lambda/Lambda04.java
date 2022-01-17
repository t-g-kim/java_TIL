package example_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Start Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("End Thread");
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Start Thread2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End Thread2");
        });

        thread.start();
        thread2.start();


        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        list.forEach(x -> System.out.println(x));
        // 위 코드는 list.forEach(System.out::println) 으로 축약할 수 있음
    }
}
