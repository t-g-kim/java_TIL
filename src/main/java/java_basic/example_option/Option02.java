package java_basic.example_option;

import java.util.Optional;

/*
만약 Optional 객체에 저장된 값이 null이면, NoSuchElementException 예외가 발생합니다.

따라서 get() 메소드를 호출하기 전에 isPresent() 메소드를 사용하여 Optional 객체에 저장된 값이 null인지 아닌지를 먼저 확인한 후 호출하는 것이 좋습니다.
 */
public class Option02 {
  public static void main(String[] args){
    Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
    Optional<String> opt2 = Optional.empty();

    if (opt.isPresent()) {
      System.out.println(opt.get());
    }
    opt.ifPresent(System.out::println);

    /*
    1. orElse() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환함.

    2. orElseGet() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결괏값을 반환함.

    3. orElseThrow() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴.
     */
    System.out.println(opt2.orElse("빈 Optional 객체"));
    System.out.println(opt2.orElseGet(String::new));



  }
}
