package zoho_round3_Nov_2025;

import java.util.*;
public class problem5 {

    public static int dfs(int node, int n, boolean[] vis, int[][] adj) {
        vis[node] = true;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (adj[node][i] == 1 && !vis[i]) {
                count += dfs(i, n, vis, adj);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 7;
        int[][] edges = {
                {1, 2},
                {2, 3},
                {3, 4},
                {5, 6},
                {6, 7},
                {5, 7}
        };

        int hacked = 3;

        int[][] adj = new int[n + 1][n + 1];
        boolean[] vis = new boolean[n + 1];

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        int hackedCount = dfs(hacked, n, vis, adj);

        System.out.println(hackedCount);
    }
}

//input

//n = 7
//edges:
//        1-2
//        2-3
//        3-4
//        5-6
//        6-7
//        5-7
//hacked = 3

//output
//4

