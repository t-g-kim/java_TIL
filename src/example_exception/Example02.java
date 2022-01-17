package example_exception;

public class Example02 {
    public static void main(String[] args) {

        try {
            makeException();
        } catch (Exception e) {

        }
    }

    static void makeException() throws Exception {

        throw new Exception();
    }
}
