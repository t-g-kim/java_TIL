package java_basic.test;

import java.util.ArrayList;
import java.util.List;

public class TestSplit {
    public static void main(String[] args) {

        String str = "abcd";
        System.out.println(str.split("")[0]);

        char a = 'b';
        char b = 'c';

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a-b);

        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(1);
        boolean[] booleans = new boolean[4];
        combine(arr, booleans, 0, arr.size(), 2);

        System.out.println(setArray(arr, booleans, 2));
    }

    public static void combine(List<Integer> list, boolean[] visited, int depth, int n, int r) {

        if (r == 0) {
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        combine(list, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        combine(list, visited, depth + 1, n, r);
    }

    public static String setArray(List<Integer> list, boolean[] visited, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                result += list.get(i) + ",";
            }
        }

        return result;
    }
}
