package java_basic.example_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// https://futurecreator.github.io/2018/08/26/java-8-streams/
public class Stream07 {
    public static void main(String[] args) {

        // stream은 배열 또는 컬렉션 인스턴스를 이용해서 생성할 수 있다.
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1,3);

        // 컬렉션 타입(Collection, list, set)의 경우 인터페이스에 추가된 디폴트 메소드stream을 이용해서 스트림을 만들수 있다.
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = list.stream();
        Stream<String> parallelStream = list.parallelStream();  // 병렬 처리 스트림

        // 비어있는 스트림
        Stream<String> builderStream = Stream.<String>builder().add("A").add("B").add("C").build();

    }
}
