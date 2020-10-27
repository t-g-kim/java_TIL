package map;

import java.util.HashMap;
import java.util.Iterator;

public class Map02 {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    // put() 메소드를 이용한 요소의 저장
    hm.put("key1", 30);
    hm.put("key2", 10);
    hm.put("key3", 40);
    hm.put("key4", 20);

    // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
    System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
    System.out.println("맵에 저장된 값들의 집합 : " + hm.values());

    for (String key : hm.keySet()) {
      System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
    }

    // remove() 메소드를 이용한 요소의 제거
    hm.remove("key4");

    // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
    Iterator<String> keys = hm.keySet().iterator();

    while (keys.hasNext()) {
      String key = keys.next();
      System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
    }

    // replace() 메소드를 이용한 요소의 수정
    hm.replace("key2", 200);

    for (String key : hm.keySet()) {
      System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
    }

    // size() 메소드를 이용한 요소의 총 개수
    System.out.println("맵의 크기 : " + hm.size());
  }
}
