package java_basic.example_lambda;

public class Lambda06 {
    public static void main(String[] args) {
        MyInterface mi = (a, b) -> a + b + a;
        System.out.println(mi.sum(10, 20));

        Person person = new Person();
        person.hi(((a, b) -> a-b));
    }
}

@FunctionalInterface
interface MyInterface {
    int sum(int a, int b);
}

@FunctionalInterface
interface Say{
    int someting(int a,int b);
}
class Person{
    public void hi(Say line) {
        int number = line.someting(3,4);
        System.out.println("Number is "+number);
    }
}
