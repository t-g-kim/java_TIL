package java_basic.test;

public class Person {
    private String name;    // 이름
    private int age;    // 나이
    private float height;   // 키
    private boolean isHero; // 히어로 여부

    public Person() {}
    public Person(String name, int age, float height, boolean isHero) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isHero = isHero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isHero() {
        return isHero;
    }

    public void setHero(boolean hero) {
        isHero = hero;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isHero=" + isHero +
                '}';
    }
}
