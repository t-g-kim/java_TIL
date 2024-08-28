package algorithm.daily;

import java.util.*;

public class Daily0604 {
  
  // 상하 좌우를 탐색하기위한 방향 정의
  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};
  static boolean[][] visited;
  static int[][] A = {{1,1,0,1,1,0},{1,1,0,1,1,0}, {1,1,1,1,1,1}, {1,1,1,1,0,1}};
  static int N = 6;
  static int M = 4;

  public static void main(String[] args) {
    visited = new boolean[N][M];
    BFS(0,0);
    System.out.println(A[N-1][M-1]);
  }

  public static void BFS(int i, int j) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {i, j});
    visited[i][j] = true;

    while (!queue.isEmpty()) {
      int now[] = queue.poll();

      for (int k = 0; k < 4; k++) { // 상하좌우 탐색
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];

        if (x > 0 && y > 0 && x < N && y <M) { // 배열 크기, 넘어가면 안됨
          if(A[x][y] !=0 && !visited[x][y]) { // 값이 0이거나 방문한 노드
            // 탐색 가능
            visited[x][y] = true;
            A[x][y] = A[now[0]][now[1]] + 1; // 핵심
            queue.add(new int[] {x, y});
          }
        }
      }
    }
  }
}
