package example_collection;

import java.util.LinkedList;

public class ExamLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();
        // add() 메소드를 이용한 요소의 저장
        linkList.add("넷");
        linkList.add("둘");
        linkList.add("셋");
        linkList.add("하나");

        // for문과 get()메소드를 이용한 요소의 출력
        for (int i = 0; i < linkList.size(); i++) {
            System.out.print(linkList.get(i) + " ");
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        linkList.remove(1);
        // Enhanced for문과 get() 메소드를 이용한 요소의 출력
        for (String e : linkList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        linkList.set(2, "둘");
        for (String e : linkList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + linkList.size());
    }
}

