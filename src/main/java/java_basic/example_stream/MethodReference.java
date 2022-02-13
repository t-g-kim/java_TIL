package java_basic.example_stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {

        String[] arr = {"gg", "hh", "ff"};

        Arrays.stream(arr).peek(MethodReference::printString).collect(Collectors.toList());
        Arrays.stream(arr).peek(MethodReference::printInt).collect(Collectors.toList());
    }

    public static void printString(String str) {
        System.out.println("hello" + str);
    }

    public static void printInt(String str) {
        System.out.println("hello" + str);
    }
}
