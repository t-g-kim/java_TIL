package java_basic.example_exception;

public class Example04 {
    public static void main(String[] args) {

        String[] array = null;

        try {
            for (String s : array) {
                System.out.println(s);
            }
        } catch (NullPointerException e) {
            String message = e.getMessage();
            System.out.println("error message : " + message);
        } finally {
            System.out.println("finally 수행, 예외에 상관없이 수행된다.");
        }

        System.out.println("마지막 출력입니다.");
    }
}
