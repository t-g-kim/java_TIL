package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260 {
  static StringBuilder sb = new StringBuilder();
  static boolean[] visited;
  static int[][] graph;

  static int node, line, start;

  static Queue<Integer> queue = new LinkedList<>();

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    node = Integer.parseInt(st.nextToken());
    line = Integer.parseInt(st.nextToken());
    start = Integer.parseInt(st.nextToken());

    graph = new int[node + 1][node + 1];
    visited = new boolean[node + 1];

    for (int i = 0; i < line; i++) {
      StringTokenizer str = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(str.nextToken());
      int b = Integer.parseInt(str.nextToken());

      graph[a][b] = graph[b][a] = 1;
    }

    dfs(start);

    sb.append("\n");


    System.out.println(sb);

  }

  public static void dfs(int start) {
    visited[start] = true;
    sb.append(start + "");

    for(int i = 0; i <= node; i++) {
      if (graph[start][i] == 1 && !visited[i]) {
        dfs(i);
      }
    }
  }

  public static void bfs(int start) {
    queue.add(start);
    visited[start] = true;

    while(!queue.isEmpty()) {
      start = queue.poll();
      sb.append(start + " ");

      for (int i = 1; i <= node; i++) {
        if (graph[start][i] == 1 && !visited[i]) {
          queue.add(i);
          visited[i] = true;
        }
      }
    }
  }
}
