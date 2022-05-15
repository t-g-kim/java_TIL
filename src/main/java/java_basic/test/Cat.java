package java_basic.test;

public class Cat extends Animal implements World {
    @Override
    void bark() {
        System.out.println("고양이는 야옹하고 웁니다.");
    }

    @Override
    public void exist() {
        System.out.println("고양이는 실존 합니다.");
    }
}
