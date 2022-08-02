package java_basic.singleton;

public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private int count = 0;

    private Singleton01() {
        // 외부에서 호출하지 못하게 기본 생성자는 private로 지정
    }

    public static Singleton01 getInstance() {
        return instance;
    }

    public void increaseCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
