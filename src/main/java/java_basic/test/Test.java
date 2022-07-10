package java_basic.test;

import java.io.*;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array1 = new int[N];
        int[] array2 = new int[N];

        for (int i = 0; i < N; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br2.readLine());
        for (int i = 0; i < N; i++) {
            array2[i] = Integer.parseInt(st2.nextToken());
        }

        br.close();


        int[] array11 = new int[count(array1.length)];
        int[] array22 = new int[count(array1.length)];

        int count = 0;
        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i == 0) {
                array11[i] = array1[i];
                array22[i] = array2[i];
                if(array11[i] == array22[i]) count += 1;
            }
            for (int j = i + 1; j < array1.length; j++) {
                array11[i + j] = array1[i] + array1[j];
                array22[i + j] = array2[i] + array2[j];
                if(array11[i + j] == array22[i + j]) {
                    count += 1;
                }
                total1 += array11[i + j];
                total2 += array22[i + j];
            }
        }
        if(total1 == total2) count += 1;
        System.out.println(count);
    }

    public static int count(int n) {
        if (n == 1) {
            return 1;
        }
        return n + count(n - 1);
    }
}
