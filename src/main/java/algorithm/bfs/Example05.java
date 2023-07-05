package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

/***************** */
public class Example05 {

    static boolean[] visit = new boolean[7];
    static int[][] graph = {{}, {2,3}, {4,5}, {1}, {2,6}, {2}, {4}};

    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v); //시작 정점 큐에 넣기
		visit[v] = true; //시작 정점 방문
		
		while(!queue.isEmpty()) {
			int temp = queue.poll(); 
			System.out.println(temp);

			for(int nextV : graph[temp]) {
				if(!visit[nextV]) { 
					queue.add(nextV);
					visit[nextV] = true;
				}
			}
		}	
    }
}
