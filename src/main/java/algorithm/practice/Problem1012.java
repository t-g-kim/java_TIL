package algorithm.practice;

import java.util.LinkedList;
import java.util.Queue;

// bfs
public class Problem1012 {

    static int[][] array = {
            {1,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0},
            {0,0,1,1,0,0,0,1,1,1},
            {0,0,0,0,1,0,0,1,1,1}
    };
    static boolean[][] visited = new boolean[6][10];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (!visited[i][j] && array[i][j] == 1) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        // 상하좌우에 1이 있는경우 방문처리 한다.
        while (!queue.isEmpty()) {
            int[] value = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = value[0] + dx[i];
                int newY = value[1] + dy[i];

                if (newX >= 6 || newX < 0 ) continue;
                if (newY >= 10 || newY < 0) continue;
                if (!visited[newX][newY] && array[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    queue.offer(new int[] {newX, newY});
                }
            }
        }
    }
}
