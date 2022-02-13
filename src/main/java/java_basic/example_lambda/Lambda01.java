package java_basic.example_lambda;

public class Lambda01 {
    public static void main(String[] args) {

        // 일반적인 방법
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        }).start();

        // 람다 표현식 사용
        new Thread(() -> {
            System.out.println("Hello World 2");
        }).start();

        new Thread(() -> System.out.println("Hello World 3")).start();
    }
}
