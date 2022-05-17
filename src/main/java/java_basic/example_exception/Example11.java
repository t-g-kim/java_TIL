package java_basic.example_exception;

public class Example11 {
    public static void main(String[] args) {
        String numStr = "114a";
        checkInt(numStr);
    }

    public static void checkInt(String str) {

        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException 발생");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("This string is not a number format");
        }
    }
}
