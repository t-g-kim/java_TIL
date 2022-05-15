package java_basic.test;

public class Lion extends Animal implements World {
    @Override
    void bark() {
        System.out.println("사자는 어흥 하고 웁니다.");
    }

    @Override
    public void exist() {
        System.out.println("사자는 실제로 존재합니다.");
    }
}
