package java_basic.generic;

public class Generic02<K, V> {
    private K first;	// K 타입(제네릭)
    private V second;	// V 타입(제네릭)

    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}
