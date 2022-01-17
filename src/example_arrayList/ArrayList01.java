package example_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();  // 타입 미설정으로 Object로 선언된다.
        ArrayList<Student> studentList = new ArrayList<Student>();  // 타입 설정, Student객체만 사용가능
        ArrayList<Integer> intList = new ArrayList<Integer>();  //타입 설정, int타입만 사용가능
        ArrayList<Integer> intList2 = new ArrayList<>(); //new에서 타입 파라미터 생략 가능
        ArrayList<Integer> intList3 = new ArrayList<>(10); //초기 용량(capacity) 지정

        /*
            Array(배열)을 List로 변경할때 사용한다.
            asList()를 사용해서 객체를 만들때 새로운 배열 객체를 만드는 것이 아니라, 원본배열의 주소값을 참조한다.
            asList()를 사용해서 내용을 수정하면 원본 배열도 함께 바뀌게 됨
            Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제는 할 수 없다.

            Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
         */
        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1,2,3)); // 생성시 값 추가

        System.out.println(intList4.get(0));
        System.out.println(intList4.get(1));
        System.out.println(intList4.get(2));
        intList4.add(5);
        System.out.println(intList4.get(3));

    }

    class Student {
        int age;
        int name;
        int grade;
    }
}
