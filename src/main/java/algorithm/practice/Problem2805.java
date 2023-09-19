package algorithm.practice;

import java.util.Arrays;

// https://www.acmicpc.net/problem/2805
public class Problem2805 {

    static int[] array = {4, 42, 40 ,26, 46};
    public static void main(String[] args) {
        System.out.println(binarySearch());
    }

    static int binarySearch() {
        Arrays.sort(array);
        int end = array[array.length-1];
        int start = 0;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] - mid > 0) {
                    sum += array[i] - mid;
                }
            }
            if (sum > 20) {
                start = mid;
            }

            if (sum < 20) {
                end = mid;
            }

            if (sum == 20) {
                result = mid;
                break;
            }
        }
        return result;
    }
}
