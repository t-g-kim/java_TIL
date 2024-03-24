package algorithm.dump;

import java.util.*;

public class Dump01 {
    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        boolean[] visited = new boolean[9];
        
        bfs(1, graph, visited);
    }

    public static void bfs(int start, int[][] graph, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);

        visited[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            // queue에서 꺼낸 노드와 연결된 노드 체크
            for(int i = 0; i < graph[node].length; i++) {
                int temp = graph[node][i];

                // 방문하지 않았으면 방문처리 후 큐에 넣기
                if(!visited[temp]) {
                    visited[temp] = true;
                    queue.offer(temp);
                }
            }
        }
    }
}
