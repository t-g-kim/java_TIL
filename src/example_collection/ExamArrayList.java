package example_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExamArrayList {
    public static void main(String[] args) {

//        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<Integer> arrList = new ArrayList<>();
        // add() 메소드를 이용한 요소의 저장
        arrList.add(10);
        arrList.add(50);
        arrList.add(30);
        arrList.add(20);

        // for문과 get() 메소드를 이용한 요소의 출력(=객체 반환
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);

        // Enhanced for문과 get() 메소드를 이용한 요소의 출력
        for (int e : arrList) {
            System.out.print(e + " ");
        }

        System.out.println();

        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrList);


        /*
            자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화하고 있습니다.

            Collection 인터페이스에서는 Iterator 인터페이스를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근하도록 하고 있습니다.

            따라서 Collection 인터페이스를 상속받는 List와 Set 인터페이스에서도 iterator() 메소드를 사용할 수 있습니다.
         */
        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 100);
        for (int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();
        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + arrList.size());
    }

}
