package example_exception;

public class Example00 {
    public static void main(String[] args) {

        try {
            RuntimeException e = new RuntimeException("gg");
            throw e;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("tt");
    }
}
