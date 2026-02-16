import java.util.*;

public class ArticulationPoint {

    static int time = 0;

    static void dfs(int u, boolean visited[], int disc[],
                    int low[], int parent[], int graph[][], int n) {

        visited[u] = true;
        disc[u] = low[u] = ++time;
        int children = 0;

        for(int v=0; v<n; v++){
            if(graph[u][v] == 1){

                if(!visited[v]){
                    children++;
                    parent[v] = u;
                    dfs(v, visited, disc, low, parent, graph, n);

                    low[u] = Math.min(low[u], low[v]);

                    if(parent[u] == -1 && children > 1)
                        System.out.println("Articulation Point: " + u);

                    if(parent[u] != -1 && low[v] >= disc[u])
                        System.out.println("Articulation Point: " + u);
                }

                else if(v != parent[u]){
                    low[u] = Math.min(low[u], disc[v]);
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        int graph[][] = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                graph[i][j] = sc.nextInt();

        boolean visited[] = new boolean[n];
        int disc[] = new int[n];
        int low[] = new int[n];
        int parent[] = new int[n];

        Arrays.fill(parent, -1);

        for(int i=0;i<n;i++)
            if(!visited[i])
                dfs(i, visited, disc, low, parent, graph, n);

        sc.close();
    }
}
