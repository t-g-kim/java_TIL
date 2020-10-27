package map;

import java.util.HashMap;

public class Map01 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();

    // put 메소드를 이용하여 입력
    map.put("people", "사람");
    map.put("baseball", "야구");

    // key에 해당되는 값을 얻는다.
    System.out.println(map.get("people"));

    // containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
    System.out.println(map.containsKey("people"));

    // remove 메소드는 맵(Map)의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴한다.
    System.out.println(map.remove("people"));

    // size 메소드는 Map의 갯수를 리턴한다.
    System.out.println(map.size());
  }

  /*
      Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다.
      하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다.
      이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.
   */
}
