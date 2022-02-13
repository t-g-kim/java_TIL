package java_basic.example_class;

// class 정
public class Champion {
  // 속성(변수) 정의
  String name;
  int power;
  int defense;

  // 생성자 정의
  public Champion(){
  }

  // 메소드 정의
  public void powerUp(){
    power += 5;
  }

  public void powerDown(){
    power -= 5;
  }

  public int getCurrentPower(){
    return power;
  }
}
