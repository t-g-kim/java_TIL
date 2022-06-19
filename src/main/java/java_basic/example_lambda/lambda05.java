package java_basic.example_lambda;

public class lambda05 {
    public static void main(String[] args) {

//        Object obj = (a, b) -> a > b ? a : b;
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        // error
//        int value = obj.max(3, 5);  // 함수형 인터페이스가 필요하다. Object에는 max method가 없기 때문
    }

}
