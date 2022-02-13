package java_basic.example_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        // 중간연산
        /*
            보통 filter(), map()을 사용한다
            조건에 맞는 요소를 추출(filter()) 하거나 요소를 변환(map())
         */


        ArrayList<String> sList = new ArrayList<>();
        sList.add("HI");
        sList.add("kibana");
        sList.add("Lambda");
        sList.add("ERROR");
        sList.add("JAVA");
        sList.add("reactive");
        sList.add("ELK");

        // stream을 사용해 sList 출력
        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        // 정렬
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 문자열의 길이를 알고 싶다.
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

        // 문자열의 길이가 5이상인 요소만 출력하기
        sList.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

    }
}
