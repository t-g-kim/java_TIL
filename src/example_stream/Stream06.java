package example_stream;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 최종연산
public class Stream06 {
    // 스트림 최종연산
    public static void main(String[] args) {

        /*
            요소의 출력
         */
        Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");
        stream.forEach(System.out::println);


        System.out.println();
        /*
            요소의 소모
         */
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result2);


        System.out.println();
        /*
            요소의 검색
         */

        IntStream stream3 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result3 = stream3.sorted().findFirst();
        System.out.println(result3.getAsInt());

        OptionalInt result4 = stream4.sorted().findAny();
        System.out.println(result4.getAsInt());


        System.out.println();
        /*
            요소의 검사
         */

        IntStream stream5 = IntStream.of(30, 90, 70, 10);
        IntStream stream6 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream5.anyMatch(n -> n > 80));
        System.out.println(stream6.allMatch(n -> n > 80));


        System.out.println();
        /*
            요소의 통계
         */


        IntStream stream7 = IntStream.of(30, 90, 70, 10);
        IntStream stream8 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream7.count());
        System.out.println(stream8.max().getAsInt());


        System.out.println();
        /*
            요소의 연산
         */

        IntStream stream9 = IntStream.of(30, 90, 70, 10);
        DoubleStream stream10 = DoubleStream.of(30.3, 90.9, 70.7, 10.1);

        System.out.println(stream9.sum());
        System.out.println(stream10.average().getAsDouble());


        System.out.println();
        /*
            요소의 수집
         */
        Stream<String> stream11 = Stream.of("넷", "둘", "하나", "셋");

        List<String> list = stream11.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
