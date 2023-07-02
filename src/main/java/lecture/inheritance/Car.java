package lecture.inheritance;

public class Car {

    // 클래스의 구성요소
    // 필드(멤버변수), 메서드 => 멤버

    // 기본형 int double float boolean byte short long
    // class 또한 자료형이다 사용자 정의 타입.

    private int price;
    String color;
    int year;

    //생성자
    public Car() {
        // 기본 생성자
    }

    public Car(int year) {
        // year를 받는 생성자
       this.year = year;
    }

    public Car(int year, int price, String color) {
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("price : " + price + " color : " + color + " year : " + year);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
