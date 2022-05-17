package java_basic.generic;

public class Main {
    public static void main(String[] args) {
        GenericClass<String> str = new GenericClass<>("Hello");
        str.printStr();

        str.printTypeT2(1);
        GenericClass.printTypeT3(3.14f);

        Student tom = new Student();
        tom.setName("톰");
        GenericClass<Student> student = new GenericClass<>(tom);
        student.printStr();
        System.out.println();
        System.out.println("=======================");
        System.out.println();


//        Generic01<String> a = new Generic01<String>();
        Generic01<String> a = new Generic01<>();
        Generic01<Integer> b = new Generic01<>();

        a.set("10");
        b.set(10);
        System.out.println("a data : " + a.get());
        // 반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();
        System.out.println("b data : " + b.get());
        // 반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.get().getClass().getName());

        System.out.println();
        System.out.println("=======================");
        System.out.println();

        Generic02<String, Integer> a1 = new Generic02<>();

        a1.set("10", 10);


        System.out.println("  fisrt data : " + a1.getFirst());
        // 반환된 변수의 타입 출력
        System.out.println("  K Type : " + a1.getFirst().getClass().getName());

        System.out.println("  second data : " + a1.getSecond());
        // 반환된 변수의 타입 출력
        System.out.println("  V Type : " + a1.getSecond().getClass().getName());

        System.out.println();
        System.out.println("=======================");
        System.out.println();

        Generic03 c = new Generic03();
        c.genericMethod("AABBCC");
    }
}
