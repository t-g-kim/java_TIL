package algorithm.practice;

import java.util.LinkedList;
import java.util.Queue;

// bfs
public class Problem2606 {

    static boolean[] visited = new boolean[8];
    // 정점
    static int[][] node = {{}, {2, 5}, {1,3,5}, {2}, {7}, {1, 2, 6}, {5}, {4}};

    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        int cnt = 0;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for(int i = 0; i < node[x].length; i++) {
                if (!visited[node[x][i]]) {
                    visited[node[x][i]] = true;
                    queue.offer(node[x][i]);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
