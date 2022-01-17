package example_class.ex01;

public class CarHyundai extends Car{

    String model;
    String origin;

    CarHyundai(){
        super("gas");
    }


    public static void serviceCenterInfo() {
        System.out.println("현대차의 서비스 센터는 블루링크입니다.");
    }

    //따라서 지역 변수와 this 참조 변수 그리고 super 참조 변수 모두 같은 값을 출력합니다.
    public void display() {
        System.out.println("자동차의 기본 속도는(지역변수) : " + speed);
        System.out.println("자동차의 기본 속도는 : " + super.speed);
        System.out.println("현대 자동차의 기본 속도는 : " + this.speed);
        System.out.println("나는 현대차에요");
    }
}

