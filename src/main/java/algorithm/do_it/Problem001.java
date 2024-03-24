package algorithm.do_it;

import java.util.*;

// p169, 027 미로탐색, 백준2178
  /*
   * 
      4 6
      110110
      110110
      111111
      111101

      9
   */
public class Problem001 {
  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};
  static boolean[][] visited;
  static int[][] dataArr = {{1,1,0,1,1,0},{1,1,0,1,1,0}, {1,1,1,1,1,1}, {1,1,1,1,0,1}};


  public static void main(String[] args) {

    visited = new boolean[4][6];

    BFS(0,0);
    System.out.println(dataArr[4-1][6-1]);
  }

  static void BFS(int i, int j) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{i,j});
    visited[i][j] = true;
    while (!queue.isEmpty()) {
      int now[] = queue.poll();
      for(int k = 0; k < 4; k++) { // 상하좌우 탐색
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];

        if( x >=0 && y>=0 && x < 4 && y < 6) { // 배열을 넘어가면 안됨
          if(dataArr[x][y] != 0 && !visited[x][y]) { // 0이여서 갈 수 없거나 방문한 배열이면 안됨
            visited[x][y] = true;
            dataArr[x][y] = dataArr[now[0]][now[1]] + 1; // 중요
            queue.add(new int[] {x, y});
          }
        }
      }
    }
  }
}
