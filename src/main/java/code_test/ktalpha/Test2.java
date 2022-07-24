package code_test.ktalpha;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2, 4, 6, 5, 2};
        int min = 0;
        int minimum = arr.length+1;
        for (int i = 0; i <= (arr.length - 1); i++) { // arr[i]=2, i=0
            for (int j = 0; j < (arr.length); j++) { //j = 0; j< {1,3,1,4,2,1,3} : 6
                if (j <= i) {
                } else {
                    if (arr[i] == arr[j]) {
                        min = j - i;
                    } else {
                        min = -1;
                    }
                    if (min != -1 && minimum > min) {
                        minimum = min;
                    }
                }
            }
        }
        if (minimum == arr.length+1) {
            minimum = -1;
        }
        System.out.println(minimum);
    }
}
