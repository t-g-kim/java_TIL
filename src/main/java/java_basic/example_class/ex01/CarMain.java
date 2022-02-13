package java_basic.example_class.ex01;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.modelYear = "2021";
        car1.price = 100000000;
        car1.color = "white";
        car1.speed = 260;
        car1.type = "gas";

        System.out.println("car1의 연식은 : " + car1.modelYear);
        System.out.println("car1의 가격은 : " + car1.price);
        System.out.println("car1의 색상은 : " + car1.color);
        System.out.println("car1의 속도는 : " + car1.speed);
        System.out.println("car1의 타입은 : " + car1.type);

        car1.bootCar();
        car1.speedUp();

//        System.out.println();
//        System.out.println("=============================================");
//
//        CarHyundai carHyndai = new CarHyundai();
//        carHyndai.modelYear = "2021";
//        carHyndai.price = 1000;
//        carHyndai.color = "black";
//        carHyndai.speed = 16;
//        carHyndai.model = "pride";
//        carHyndai.origin = "korea";
//
//        System.out.println("carHyndai 연식은 : " + carHyndai.modelYear);
//        System.out.println("carHyndai의 가격은 : " + carHyndai.price);
//        System.out.println("carHyndai의 색상은 : " + carHyndai.color);
//        System.out.println("carHyndai의 속도는 : " + carHyndai.speed);
//        System.out.println("carHyndai의 타입은 : " + carHyndai.type);
//        System.out.println("carHyndai의 모델은 : " + carHyndai.model);
//        System.out.println("carHyndai의 원산지 : " + carHyndai.origin);
//
//        carHyndai.bootCar();
//        carHyndai.speedUp();
//        carHyndai.display();
    }
}
