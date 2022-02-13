package java_basic.example_class.ex01;

public class Car {
    String type;
    String modelYear;
    String color;
    int speed = 0;
    int price;

    Car(){}

    Car(String type){
        this.type = type;
    }

    Car(String type, int price){
        this.type = type;
        this.price = price;
    }

    public void bootCar() {
        System.out.println("자동차의 시동을 켰습니다.");
    }

    public void speedUp() {
        speed += 5;
    }

    public void speedDown() {
        speed -= 5;
    }

    public void sound() {
        System.out.println("자동차의 빵빵이를 작동합니다.");
    }
}
