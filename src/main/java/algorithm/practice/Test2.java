package algorithm.practice;

import java.util.*;
public class Test2 {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[9];
    public static void main(String[] args) {
        bfs();
    }
//1 2 3 8 6 5 4 7
//1 2 3 8 6 5 4 7
    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp + " ");
            for (int i = 0; i < graph[temp].length; i++) {
                if (!visited[graph[temp][i]]) {
                    visited[graph[temp][i]] = true;
                    queue.offer(graph[temp][i]);
                }
            }
        }
    }
}
