package java_basic.singleton;

public class Singleton02 {

    // Thread safe하지 않다.
    private static Singleton02 singleton02 = null;

    private Singleton02(){}

    public Singleton02 getInstance() {

        if (singleton02 == null) {
            singleton02 = new Singleton02();
        }

        return singleton02;
    }
}
