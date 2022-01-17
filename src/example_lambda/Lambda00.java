package example_lambda;


interface Goods {
    void doSome();
}

public class Lambda00 implements Goods {
    @Override
    public void doSome() {
        System.out.println("do Operation!");
    }
}

class Main {
    public static void main(String[] args) {
        Goods com = new Lambda00();
        com.doSome();
    }
}
