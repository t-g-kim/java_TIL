package java_basic.example_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");
        list.stream().forEach(System.out::println);
    }
}
