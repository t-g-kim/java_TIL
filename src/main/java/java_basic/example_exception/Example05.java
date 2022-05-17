package java_basic.example_exception;

public class Example05 {
    public static void main(String[] args) {

        // 일반 예외
        try {
            Class object = Class.forName("java.lang.TG");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();    // 어떤 과정을 거치다가 에러가 났는지 알려준다.
        }

        System.out.println("마지막 수행 문장입니다.");
    }
}
