package algorithm.dfs;

public class Example04 {

    public static void main(String[] args) {
        int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        int n = 3;
        System.out.println(new Solution().solution(n, computers));
    }

    public static class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (visited[i] == false) {
                    answer++;
                    dfs(i, visited, computers);
                }
            }

            return answer;
        }

        public void dfs(int node, boolean[] visited, int[][] computers) {
            visited[node] = true;

            for (int i = 0; i < computers.length; i++) {
                if (visited[i] == false && computers[node][i] == 1) {
                    dfs(i, visited, computers);
                }
            }
        }
    }
}