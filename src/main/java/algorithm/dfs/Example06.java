package algorithm.dfs;

public class Example06 {
    static boolean[] visit = new boolean[7];
    static int[][] graph = {{}, {2,3}, {4,5}, {1}, {2,6}, {2}, {4}};

    public static void main(String[] args) {
        dfs(1);
    }

    public static void dfs(int v) {
        visit[v] = true;
        System.out.println(v);

        for(int nextV : graph[v]) {
            if (!visit[nextV]){
                dfs(nextV);
            }
        }
    }
}
