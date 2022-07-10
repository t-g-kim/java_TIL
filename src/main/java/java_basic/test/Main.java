package java_basic.test;

// 상속
public class Main {
    public static void main(String[] args) {
        Normal tom = new Normal();
        tom.setGrade(1);
        tom.setMale(true);
        tom.setHeight(180.0f);
        tom.setName("tome Kim");
        tom.setHasCar(false);
        tom.setAge(17);

        System.out.println(tom);
        tom.speak();

        Lion lion = new Lion();
        lion.bark();
        lion.exist();

        Cat cat = new Cat();
        cat.bark();
        cat.exist();

        Animal dog = new Cat();
        dog.bark();
//        dog.exist();    // Animal에 exist가 없기 때문에 에러


    }
}
