package algorithm.practice;

import java.util.LinkedList;
import java.util.Queue;

// bfs
public class Problem2178 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited = new boolean[4][6];

    static int[][] array = {{1,0,1,1,1,1}, {1,0,1,0,1,0}, {1,0,1,0,1,1}, {1,1,1,0,1,1}};
    public static void main(String[] args) {
        bfs(0, 0);
    }

    public static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { startX, startY});

        visited[startX][startY] = true;
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = temp[0] + dx[i];
                int y = temp[1] + dy[i];
                if (x >= 0 && x < 4 && y >= 0 && y < 6) {
                    if (!visited[x][y] && array[x][y] == 1) {
                        visited[x][y] = true;
                        array[x][y] = array[temp[0]][temp[1]] + 1;
                        queue.offer(new int[] {x, y});
                }
                }
            }
        }
        System.out.println(array[3][5]);
    }
}
