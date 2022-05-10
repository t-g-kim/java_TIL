package java_basic.example_total;

// method
public class Example12 {
    public static void main(String[] args) {
        addNoReturn(50, 100);
        addNoReturn(10, 100);
    }

    // static 프로그램이 실행이 될 때 메모리에 적재된다.

    // 반환값이 없다
    public static void addNoReturn(int x, int y) {
        System.out.println(x + y);
    }

    // 반환값이 있다.
    public static int addReturn(int x, int y) {
        return x + y;
    }

    // 메소드 오버로딩
    // 파라미터의 타입이 다르다 또는 리턴타입이 다르다 또는 파라미터의 개수가 다르다
    public static int addReturn(int x, int y, int z) {
        return x + y + z;
    }

    public static int addReturn(int ... numbers) {
        // 배열로 들어옥 된다.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
