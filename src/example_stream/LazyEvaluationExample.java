package example_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://dororongju.tistory.com/m/137
public class LazyEvaluationExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 7, 9, 10);

        System.out.println(
                list.stream()
                        .filter(i -> i < 6)
                        .filter(i -> i % 2 == 0)
                        .map(i -> i * 10)
                        .collect(Collectors.toList())
        );

        System.out.println();

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 6, 7, 9, 10);

        System.out.println(
                list2.stream()
                        .filter(i -> {
                            System.out.println("i < 6");
                            return i < 6;
                        })
                        .filter(i -> {
                            System.out.println("i%2 == 0");
                            return i % 2 == 0;
                        })
                        .map(i -> {
                            System.out.println("i = i*10");
                            return i * 10;
                        })
                        .collect(Collectors.toList())
        );


    }
}
