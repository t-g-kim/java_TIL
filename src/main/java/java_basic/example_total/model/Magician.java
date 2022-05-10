package java_basic.example_total.model;


public class Magician extends Character implements CharacterInterface {
    // 자바는 단일상속, 인터페이스는 여러개 상속 가능 (다중상속 효과)

    // magician도 공격이 가능한데 매번 코드를 복사를 할수 없다.됨
    // Character class를 상속받았기때문에 강제로 구현해야한다
    @Override
    public void attack(Hero hero) {

    }

    @Override
    public void defence(Hero hero) {

    }
}
