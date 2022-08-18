package test.healingpaper;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(rotateLIst(Arrays.asList(1,2,3,4,5), 2));
    }


    public static List rotateLIst(List<Integer> list, int k) {


        // Loop according to the number of rotations
        for (int i = 0; i < k; i++) {

            // storing the last element in the list
            int temp = list.get(0);

            // traverse the list and move elements to right
            for (int j = 0; j < list.size()-1; j++) {
                list.set(j, list.get(j + 1));
            }
            list.set(list.size()-1, temp);
        }


        return Arrays.asList(list.toArray());
    }
}
