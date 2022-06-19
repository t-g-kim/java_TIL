package java_basic.skill;

public class EqualMethod {
    public static void main(String[] args) {

        String s = "Hello world";
        // 변수.equals() => 좋은 코드가 아니다.
        // NPE가 발생할 수 있다.
        if (s.equals("Hello World")) {
            System.out.println("hi");
        }

        // "하드코딩".equals() => 그나마 낫다
        String str = "KK";
        if ("KK".equals(str)) {
            System.out.println("KK");
        }
    }
}
