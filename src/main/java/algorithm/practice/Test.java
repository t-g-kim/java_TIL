package algorithm.practice;

import java.util.*;
public class Test {

    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[9];
    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int start) {
        // queue 생성
        Queue<Integer> queue = new LinkedList<>();
        // queue 삽입
        queue.offer(start);
        // 방문처리
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < graph[node].length; i++) {
                int temp = graph[node][i];
                if (!visited[temp]) {
                    queue.offer(temp);
                    visited[temp] = true;
                }
            }

        }
    }
}
