package java_basic.example_total;

// 타입 캐스팅
public class Example03 {
    public static void main(String[] args) {
        long l = 30L;
        int x = 30;

        int ii = (int) 30L;
        long ll = 30;

        double num1 = 3.14;
        float num2 = 10.0f;

        num1 = num2; // 에러, 큰타입을 작은타입에 넣으려면 에러가 난다.
        num1 = (double) num2; // 큰타입을 작은타입에 넣으려면 강제 형변환을 해줘야함

        String str = "100";
        int i = Integer.parseInt(str);

        String str2 = String.valueOf(i);

        int[] arr = new int[5];
        System.out.println(arr[0]);

    }
}
