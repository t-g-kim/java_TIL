package java_basic.generic;

public class GenericClass<T> {
    private T data;

    GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printStr() {
        System.out.println("data의 값은 : " + this.data);
    }

    public <T2> void printTypeT2(T2 data) {
        System.out.println("data의 값은 : " + data);
    }

    public static <T3> void printTypeT3(T3 data) {
        System.out.println("data의 값은 : " + data);
    }
}
