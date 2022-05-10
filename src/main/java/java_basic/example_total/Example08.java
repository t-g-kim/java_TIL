package java_basic.example_total;

// 조건문
public class Example08 {
    public static void main(String[] args) {
        int i = 10;

        if (i < 5) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        int j = 20;
        if (j < 5) {
            System.out.println("거짓");
        } else if (j > 20) {
            System.out.println("참");
        } else {
            System.out.println("나머지");
        }

        // 삼항연산자
        boolean isMarried = true;
        String str = isMarried ? "결혼했다" : "결혼 안했다";
        System.out.println(str);

        boolean isPerson = true;
        boolean isMale = true;
        if (isPerson && isMale) {
            System.out.println("사람이고 남자다");
        }

        String str2 = "호랑이";
        switch (str2) {
            case "호랑이" :
                System.out.println("호랑이가 맞다");
                break;
            case "원숭이" :
                System.out.println("원숭이다");
                break;
            default :
                System.out.println("동물이 아니다");
        }
    }
}
