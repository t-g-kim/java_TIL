package algorithm.basic;

public class Swap {
    public static void main(String[] args) {
     int a = 10;
     int b = 20;
     int[] arr = {a, b};

     swap(arr);
     System.out.println("arr[0] : " + arr[0]);
     System.out.println("arr[1] : " + arr[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
