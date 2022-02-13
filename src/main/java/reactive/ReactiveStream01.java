package reactive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReactiveStream01 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : list) {
            System.out.println(i);
        }

        Iterable<Integer> iter = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : iter) {
            System.out.println(i);
        }

        Iterable<Integer> iter2 = () -> new Iterator<Integer>() {
            int i = 0;
            final static int Max = 10;

            @Override
            public boolean hasNext() {
                return i < Max;
            }

            @Override
            public Integer next() {
                return ++i;
            }
        };

        for (Integer i : iter2) {
            System.out.println(i);
        }

    }
}
