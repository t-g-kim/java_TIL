package lecture.inheritance;

public class Main {
    public static void main(String[] args) {

        // Car 객체를 생성 (인스턴스 생성)
        Car audi = new Car();
        audi.setPrice(10000000);
        audi.color = "black";
        audi.year = 2022;

        System.out.println(audi.color);
        System.out.println(audi.getPrice());

        audi.printInfo();

        Car benz = new Car(2022);
        benz.setPrice(20000000);
        benz.color = "pink";

        benz.printInfo();

        Car jeep = new Car(2019, 1000, "white");
        jeep.printInfo();
    }
}
