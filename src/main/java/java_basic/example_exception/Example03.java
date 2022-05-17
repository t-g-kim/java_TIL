package java_basic.example_exception;

public class Example03 {
    public static void main(String[] args) {
        // 실행예외 NPE 발생시키기
        String[] array = null;

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   // NPE 발생
        }

        System.out.println("이곳은 마지막 출력입니다.");
    }
}
