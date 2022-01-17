package example_for;

public class For1 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        int[] marks = {90, 14, 4, 2, 21};

        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int[] grade = {60, 70, 66, 41, 90, 80, 99, 100};

        //for문 안의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아가게 된다.
        for(int i = 0; i < grade.length; i++) {
            if(grade[i] < 70) {
                continue;
            }
            System.out.println(i + " 학생 합격 => " +grade[i] + "점");
        }
    }
}
