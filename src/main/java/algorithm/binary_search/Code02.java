package algorithm.binary_search;

import java.util.Arrays;

public class Code02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 54, 100, 4, 5, 1000, 9, 15, 10, 14};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 54, 100, 4, 5, 1000, 9, 15, 10, 14};
        int index = Arrays.binarySearch(array2, 5);
        System.out.println(index);

    }
}
