package java_basic.example_lambda;

public class Lambda07 {
    public static void main(String[] args) {

        MyFunction myFunction = new MyFunction() {
            @Override
            public int max(int a, int b) {  // * 오버라이딩 - 접근제어자는 좁게 못바꾼다.
                return a > b ? a : b;
            }
        };

        MyFunction myFunction1 = (a, b) -> a > b ? a : b;

        int value = myFunction.max(3, 5);
        int value2 = myFunction1.max(4,5);
        System.out.println("value = " + value);
        System.out.println("value2 = " + value2);
    }
}

@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}
