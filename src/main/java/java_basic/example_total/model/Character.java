package java_basic.example_total.model;

//public class Character extends Person{
public abstract class Character extends Person{
    // attack 메소드 생성
    public abstract void attack(Hero hero); // 추상메소드, 상속을 받는 곳에서 override 해야됨
}
