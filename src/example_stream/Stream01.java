package example_stream;

import java.util.Arrays;

public class Stream01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count(); // 스트림은 다시 사용할 수 없다. stream 다시 생성
        System.out.println(sum);
        System.out.println(count);


        //reduce를 통해 모든 요소를 더함(프로그래머가 정의한 연산)
        System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a + b));
    }
}
