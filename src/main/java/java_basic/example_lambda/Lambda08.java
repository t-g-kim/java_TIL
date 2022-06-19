package java_basic.example_lambda;

public class Lambda08 {
    public static void main(String[] args) {
        MyFunction1 function1 =  str -> System.out.println(str);
        function1.printText("gg");

        print(function1, "gg");

        print2().printText("gg");
    }

    public static void print(MyFunction1 f1, String str) {
        f1.printText(str);
    }

    public static MyFunction1 print2() {
        MyFunction1 function1 = str1 -> System.out.println(str1 + "++++");
        return function1;
    }
}

@FunctionalInterface
interface MyFunction1 {
    void printText(String str);
}
