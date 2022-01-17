package example_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 생성
public class Stream04 {

    public static void main(String[] args) {

        /*
            스트림 생성 - 배열
        */
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};

        // 배열에서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e -> System.out.print(e + " "));


        System.out.println();
        /*
            스트림 생성 - 컬렉션
        */
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream3 = list.stream();

        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        stream3.forEach(System.out::println);


        System.out.println();
        /*
            스트림 생성 - 컬렉션
        */
        Stream<Double> stream4 = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream4.forEach(System.out::println);


        System.out.println();
        /*
            스트림 생성 - 지정된 범위의 연속된 정수
         */
        // 지정된 범위의 연속된 정수에서 스트림 생성
        IntStream stream5 = IntStream.range(1, 4);
        stream5.forEach(e -> System.out.print(e + " "));
        System.out.println();

        IntStream stream6 = IntStream.rangeClosed(1, 4);
        stream6.forEach(e -> System.out.print(e + " "));


        System.out.println();
        System.out.println();
        /*
            스트림 생성 ->특정 타입의 난수들
         */

        // 특정 타입의 난수로 이루어진 스트림 생성
        IntStream stream7 = new Random().ints(4);
        stream7.forEach(System.out::println);


        System.out.println();
        /*
            람다표현식
        */

        Stream<Integer> stream8 = Stream.iterate(2, n -> n + 2); // 2, 4, 6, 8, 10, ...
        stream8.forEach(s -> System.out.println(s));

    }
}
