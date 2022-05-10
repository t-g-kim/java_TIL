package java_basic.example_total;

// 문자열 <=> 정수
public class Example05 {
    public static void main(String[] args) {
        String str = "100";
        int i = Integer.parseInt(str);
//        long l = Long.parseLong(str);

        String str2 = String.valueOf(i);

        System.out.println(i);
        System.out.println(str2);
    }
}
