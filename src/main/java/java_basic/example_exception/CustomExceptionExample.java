package java_basic.example_exception;

public class CustomExceptionExample {
    public static void main(String[] args) {
        String str = "kim";

        try {
            checkArray(str);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArray(String str) throws CustomException{
        if ("kim".equals(str)) {
            throw new CustomException("Last name is Kim");
        }
    }
}
