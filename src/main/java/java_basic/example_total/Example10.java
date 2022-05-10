package java_basic.example_total;

// 배열
public class Example10 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int count = score.length; // 배열의 길이
        System.out.println(count);

        score[0] = 10;
        System.out.println(score[0]);

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};    // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr[10]); // java.lang.ArrayIndexOutOfBoundsException Exception
        System.out.println(arr[arr.length -1]); // 일반적으로 마지막 인덱스 출력할때 길이-1


        String[] names = new String[2];
        System.out.println(names[0]);   // null, String 같은경우 초기화를 해주지 않으면 null
        System.out.println(names[0].length());  // NPE 발생, null인데 길이를 알수 없다


    }
}
