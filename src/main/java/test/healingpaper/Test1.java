package test.healingpaper;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(stringToInteger("123"));
        System.out.println(stringToInteger("null"));
        System.out.println(stringToInteger("-123"));
    }

    public static String stringToInteger(String str) {
        char[] arr = str.toCharArray();

        String result = "";

        for (char c : arr) {
            if (c == 46) {
                result = null;
            } else if (c == 45 || c > 47 && c < 58) {
                result = charToInteger(arr);
            }
        }

        return result;
    }

    public static String charToInteger(char[] arr) {

        String result = "";
        for (int j = 0; j < arr.length; j++) {
            result+= Character.toString(arr[j]);
        }
        return result;
    }
}
