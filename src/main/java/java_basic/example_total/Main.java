package java_basic.example_total;

import java_basic.example_arrayList.ArrayList01;
import java_basic.example_total.model.*;
import java_basic.example_total.model.Character;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 1);
        Person person2 = new Person();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("===================");


        Hero hero1 = new Hero("아이언맨");
        hero1.getAge();
        hero1.getName(); // 상속 받았기때문에 나타났다.

        Hero hero2 = new Hero("스파이더맨");
        hero1.attack(hero2);

//        Character character = new Character(); // 미완성 클래스이기 때문에 객체를 생성 할수 없다.

        Character character = new Hero("캡틴아메리카");

        // 다형성
        Magician magician = new Magician();
        Character magician1 = new Magician();
        CharacterInterface magician2 = new Magician();

        if (magician1 instanceof Magician) {

        }

        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(magician);
        characterArrayList.add(magician1);
//        characterArrayList.add(magician2);
    }
}
