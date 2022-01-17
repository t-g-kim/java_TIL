package example_method_overloading;

class Test {

  static void display(int num1) { System.out.println(num1); }

  static void display(int num1, int num2) { System.out.println(num1 * num2); }

  static void display(int num1, double num2) { System.out.println(num1 + num2); }

}

public class MethodOverloading01 {
  /*
      메소드 오버로딩(overloading)이란 같은 이름의 메소드를 중복하여 정의하는 것을 의미
      자바에서는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없습니다.
      하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있습니다.
      즉, 메소드 오버로딩은 서로 다른 시그니처를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있습니다.
   */
  public static void main(String[] args) {

    Test myfunc = new Test();

    myfunc.display(10);

    myfunc.display(10, 20);

    myfunc.display(10, 3.14);

    myfunc.display(10, 'a');
    /*
      위의 예제처럼 메소드의 오버로딩은 매개변수의 타입뿐만 아니라 매개변수의 개수를 달리해도 작성할 수 있습니다.
      위 예제의 라인의 display() 메소드 호출은 영문 소문자 'a'의 아스키 코드값이 97이므로, int형으로 자동 타입 변환되어 ①번 라인의 display() 메소드가 호출될 것입니다.
     */

  }

}
