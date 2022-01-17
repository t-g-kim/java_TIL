package example_class.ex02;

public class Main {
    public static void main(String[] args) {
        Parent pa = new Parent(); // 허용
        Child ch = new Child();   // 허용
        Parent pc = new Child();  // 허용
//        Child cp = new Parent();  // 오류 발생.


        //참조 변수의 타입 변환
        Parent pa01 = null;
        Child child = new Child();
        Parent pa02 = new Parent();
        Brother br = null;

        pa01 = child; // pa01 = (Parent)child; 와 같으며, 타입 변환을 생략할 수 있음.

        br = (Brother)pa02; // 타입 변환을 생략할 수 없음.

//        br = (Brother)child;   // 직접적인 상속 관계가 아니므로, 오류 발생.
    }
}
