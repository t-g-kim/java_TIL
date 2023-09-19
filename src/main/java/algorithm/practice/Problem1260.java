package algorithm.practice;

import java.util.*;
// https://www.acmicpc.net/problem/1260
public class Problem1260 {
    static int[][] graph = {{}, {1, 2}, {1, 3}, {1, 4}, {2,4}, {3, 4}};
    static boolean[] visited = new boolean[5];
    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < graph[node].length; i++) {
                if (!visited[graph[node][i]]) {
                    queue.offer(graph[node][i]);
                    visited[graph[node][i]] = true;
                }
            }
        }

    }
}
