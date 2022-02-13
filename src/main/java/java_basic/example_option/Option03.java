package java_basic.example_option;

import java.util.Optional;

public class Option03 {

  public static void main(String[] args) {
    Optional<String> opt = Optional.of("result");
    System.out.println(opt);
    Optional<String> opt2 = Optional.ofNullable(null);
    System.out.println(opt2);
  }
}
