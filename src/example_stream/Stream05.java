package example_stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args) {

        /*
            중간연산 - 필터링
         */
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        // 스트림에서 중복된 요소를 제거함.
        stream1.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 스트림에서 홀수만을 골라냄.
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));


        System.out.println();
        System.out.println();
        /*
            스트림 변환
         */

        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream3.map(s -> s.length()).forEach(System.out::println);


        System.out.println();
        /*
            스트림 제한
        */

        IntStream stream4 = IntStream.range(0, 10);
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);

        stream4.skip(4).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream5.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream6.skip(3).limit(5).forEach(n -> System.out.print(n + " "));


        System.out.println();
        System.out.println();
        /*
            스트림 정렬
         */

        Stream<String> stream7 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        stream7.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        stream8.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }
}
