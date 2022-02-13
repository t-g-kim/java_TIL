package java_basic.example_collection;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {

        // 리스트 생성
        ArrayList<String> arrList = new ArrayList<String>();

        // 리스트에 저장
        arrList.add("안녕");
        arrList.add("위메프");
        arrList.add("삼성동");
        arrList.add("스터디");

        // 리스트 요소 출력
        for (String str: arrList) {
            System.out.println(str);
        }

        System.out.println("");

        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
}
