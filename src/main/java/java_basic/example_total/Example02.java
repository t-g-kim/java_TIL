package java_basic.example_total;

// 변수
public class Example02 {
    public static void main(String[] args) {
        int i = 30;
        long l = 30L;   // 크기가 가장 크다
        short s = 30;
        byte b = 30;
        // 일반적으로 int long을 많이 쓴다.

        double d = 30.0;
        float f = 30.0f;

        boolean isMarried = true;
        isMarried = false;

        char c = 'a';
        char cc = '한';

        String str = "여러 글자 가능";

        String str3 = String.format("저는 %s 입니다. 나이는 %d이고, 키는 %f cm 입니다.", "홍길동", 20, 180.5f);
        System.out.println(str3);
    }
}
