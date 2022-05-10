package java_basic.example_total;
// 출력
public class Example01 {
    public static void main(String[] args) {
        System.out.println("Hello World");  // 문자열 출력 가능
        System.out.println(35); // 숫자 출력 가능
        System.out.println(35 + 30);    // 수식 출력 가능

        System.out.printf("저는  %s 입니다. 나이는 %d이고, 키는 %f cm 입니다.", "홍길동", "20", 180.5f);

        int x = 30;
        System.out.println(x);  // 변수도 출력 가능

        x = 100;    // 변수 재할당
        System.out.println(x);

        final int y = 30;   // 상수 선언( 재선언 불가)

    }
}
