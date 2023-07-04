package algorithm.dfs;
// https://komas.tistory.com/39
public class Example01 {
    static boolean[] visited = new boolean[9]; 
    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}}; 
    static StringBuilder sb = new StringBuilder();
 
    public static void dfs(int x) {
        visited[x] = true; 
        sb.append(x).append(" ");
        for (int i = 0; i < graph[x].length; i++) {
            if (!visited[graph[x][i]]){
                dfs(graph[x][i]);
            }
        }
    }
 
    public static void main(String[] args) {
        dfs(1);
        System.out.println(sb);
    }
}