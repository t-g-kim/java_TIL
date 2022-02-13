package java_basic.example_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}

public class Stream03 {
    public static void main(String[] args) {
        String[] fruit = {"apple", "banana", "kiwi", "melon", "mango", "샤인머스캣"};

        // 가장 긴 문자열을 찾는다.
        String longString = Arrays.stream(fruit).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        });

        System.out.println(longString);

        System.out.println(Arrays.stream(fruit).reduce(new CompareString()).get());


    }
}
