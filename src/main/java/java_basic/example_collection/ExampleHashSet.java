package java_basic.example_collection;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
    public static void main(String[] args) {

        //자바 7, 8 로 version up 되면서 조금 더 강화된 compiler로 type inference도 강화되어 explicit type parameter 를 지정할 일이 거의 없다.
        HashSet<String> hs01 = new HashSet<>();
        HashSet<String> hs02 = new HashSet<String>();

        // add() 메소드를 이용한 요소의 저장
        hs01.add("이나영");
        hs02.add("김태희");

        // 중복된 요소 저장 테스트
        System.out.println(hs01.add("김희선"));  //true
        System.out.println(hs01.add("김희선"));  //false

        // Enhanced for문과 get() 메소드를 이용한 요소의 출력
        for (String e : hs01) {
            System.out.print(e + " ");
        }

        System.out.println();

        // add() 메소드를 이용한 요소의 저장
        hs02.add("이나영");
        hs02.add("김희선");
        hs02.add("김태희");

        // Iterator() 메소드를 이용한 요소의 출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.print(iter02.next() + " ");
        }

        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("집합의 크기 : " + hs02.size());
    }

}
