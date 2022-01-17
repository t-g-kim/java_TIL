package example_collection;

import java.util.HashMap;
import java.util.Iterator;

public class ExamHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // put() 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        // Enhanced for문과 get() 메소드를 이용한 요소의 출력
        System.out.println("Map에 저장된 키들의 집합 : " + hm.keySet());
        System.out.println();

        // Set keySet() : HashMap에서 모든 키가 저장된 Set을 반환
        for (String key : hm.keySet()) {
            System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
        }

        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        hm.remove("사십"); // key값

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
        }

        System.out.println();

        // replace() 메소드를 이용한 요소의 수정
        hm.replace("이십", 200);
        for (String key : hm.keySet()) {
            System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
        }

        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + hm.size());
    }
}
