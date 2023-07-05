package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

/*
 * DFS 한드라마를 처음부터 끝까지 본다.
 * BFS 여러개의 드라마를 한편씩 챙겨본다.
 * 
 * 경로탐색 유형 (최단거리, 시간)
 * 네트워크 유형 (연결)
 * 
 * 모든 경우의수를 확인해본다
 * DFS 한놈만 끝까지 팬다 -> 재귀함수, 재귀를 타고타고 타서 탈출조건에 먼저 도달하고 그다음 파라미터를 하나씩 바꿔가며 정답을 찾는다.
 * 
 * BFS 여러놈을 한대씩 떄리면서 가는 유형
 * Queue, linked list
 * 가장 먼저 넣었던 것을 꺼내서, 연결된 점을 Queue에 넣기, queue가 빌때까지 반복
 * -> 순서가 보장되어야 하기때문에 queue, linked list를 사용
 */
public class Example01 {
	public static void main(String[] args) {
		
		// 그래프를 2차원 배열로 표현해줍니다.
		// 배열의 인덱스를 노드와 매칭시켜서 사용하기 위해 인덱스 0은 아무것도 저장하지 않습니다.
		// 1번인덱스는 1번노드를 뜻하고 노드의 배열의 값은 연결된 노드들입니다.
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		
		// 방문처리를 위한 boolean배열 선언
		boolean[] visited = new boolean[9];
		
		System.out.println(bfs(1, graph, visited));
		//출력 내용 : 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 -> 
	}
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		// 탐색 순서를 출력하기 위한 용도
		StringBuilder sb = new StringBuilder();
		// BFS에 사용할 큐를 생성해줍니다.
		Queue<Integer> q = new LinkedList<Integer>();
		 
		// 큐에 BFS를 시작 할 노드 번호를 넣어줍니다.
		q.offer(start);
		
		// 시작노드 방문처리
		visited[start] = true;
		
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			//큐에서 꺼낸 노드와 연결된 노드들 체크
			for(int i=0; i<graph[nodeIndex].length; i++) {
				int temp = graph[nodeIndex][i];
				// 방문하지 않았으면 방문처리 후 큐에 넣기
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		// 탐색순서 리턴
		return sb.toString() ;
	}
}
