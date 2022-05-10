package java_basic.example_total.model;

// class
public class Person {

    // class는 속성과 기능으로 나누어진다

    // 멤버
    public String name;
    private int age;

    public Person() {}  // 기본생성자

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Example13{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
