package java_basic.example_exception;

public class Example06 {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Example06 sample = new Example06();
        int c;
        try {
            c = 4 / 0;
            sample.shouldBeRun();  // 이 코드는 실행되지 않는다.
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();
        }
    }
}
