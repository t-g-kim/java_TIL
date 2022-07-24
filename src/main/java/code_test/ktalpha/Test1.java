package code_test.ktalpha;

public class Test1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {2,3,1}, {3,2,1}};
        int[][] answer = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(i==j) {
                    answer[i][j] += answer[i][j];
                } else {
                    answer[i][j] = matrix[i][j] + matrix[j][i];
                }
            }
        }
        System.out.println(answer[0][0]);
    }
}
