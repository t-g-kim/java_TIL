package programers.basic;

// https://school.programmers.co.kr/learn/courses/30/lessons/120808
public class Example01 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = getGCD(numer, denom);
        answer[0] = numer / gcd;
        answer[1] = denom / gcd;
        return answer;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
}