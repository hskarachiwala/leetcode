package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CitiesCodeChef {

    public static int[] getDistances(int n, int[] adj) {
        int[] res = new int[n];
        boolean[][] graph = new boolean[n][n];
        boolean visited[] = new boolean[n];

        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(adj[i]==i) {
                list.add(i);
                queue.add(list);
                visited[i] = true;
            } else {
                graph[i][adj[i]] = graph[adj[i]][i] = true;
            }
        }

        int resIndex = 0;
        while(!queue.isEmpty()) {
            List<Integer> current = queue.poll();
            List<Integer> newList = new ArrayList<>();
            for(int c : current) {
                for(int i=0; i<n; i++) {
                    if(graph[c][i] && !visited[i]) {
                        newList.add(i);
                        visited[i] = true;
                    }
                }
            }
            if(!newList.isEmpty()) {
                queue.add(newList);
            }
            res[resIndex++] = newList.size();
        }

        return res;
    }
}
