package example_lambda;

import java.util.function.DoubleUnaryOperator;

public class Lambda03 {
    // DoubleUnaryOperator 인터페이스는 한 개의 double 형 매개변수를 전달받아 한 개의 double 형 값을 반환하는 java.util.function 패키지에서 제공하는 함수형 인터페이스
    public static void main(String[] args) {
        DoubleUnaryOperator oper;

        oper = (n) -> Math.abs(n); // 람다 표현식
        System.out.println(oper.applyAsDouble(-5));

        oper = Math::abs; // 메소드 참조
        System.out.println(oper.applyAsDouble(-5));
    }
}
