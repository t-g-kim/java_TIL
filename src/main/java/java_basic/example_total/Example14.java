package java_basic.example_total;

// Generic
public class Example14 {
    public static void main(String[] args) {

        print("안녕");
        print(1);
        print(1000L);
        print(3.14);
    }

    public static <T> void print(T type) {
        System.out.println(type);
    }
}
