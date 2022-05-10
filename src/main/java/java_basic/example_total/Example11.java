package java_basic.example_total;

import java.util.ArrayList;

// list
public class Example11 {
    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(1);
        scoreList.add(2);
        scoreList.add(3);
        scoreList.add(4);
        scoreList.add(5);

        scoreList.add(2, 100);
        scoreList.remove(0);

        System.out.println(scoreList.size());
        System.out.println(scoreList.get(0));

    }
}
