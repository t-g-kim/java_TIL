package algorithm.practice;

// https://www.acmicpc.net/problem/7576
import java.util.*;
public class Problem7576 {
    static int[][] arr = {
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1 }
    };
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println(bfs());
    }
    public static int bfs() {
        int notTomato = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    queue.offer(new int[] {i, j, 0});
                } else if (arr[i][j] == -1) {
                } else {
                    notTomato += 1;
                }
            }
        }
        if (notTomato == 0) return 0;
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nX = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];
                int nDay = tmp[2] + 1;
                if (nX < 0 || nX >= 4) continue;
                if (ny < 0 || ny >= 6) continue;
                if (arr[nX][ny] == 0) {
                    arr[nX][ny] = 1;
                    notTomato -= 1;
                    if (notTomato == 0) {
                        return nDay;
                    }
                    queue.offer(new int[] {nX, ny, nDay});
                }
            }
        }
        return -1;
    }
}
