package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Islands {

    public static class Location{
        public int row;
        public int col;
        public Location(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<Location> queue = new LinkedList<Location>();
        Location next = findNext(grid, visited);
        if(next!=null) {
            queue.add(next);
        }
        int total = 0;
        while(!queue.isEmpty()) {
            Location current = queue.poll();
            int i = current.row;
            int j = current.col;
            if(i>0 && grid[i-1][j]=='1') {
                queue.add(new Location(i-1, j));
                visited[i-1][j] = true;
            }
            if(i<grid.length-1 && grid[i+1][j]=='1') {
                queue.add(new Location(i+1, j));
                visited[i+1][j] = true;
            }
            if(j>0 && grid[i][j-1]=='1') {
                queue.add(new Location(i, j-1));
                visited[i][j-1] = true;
            }
            if(j<grid[0].length-1 && grid[i][j+1]=='1') {
                queue.add(new Location(i, j+1));
                visited[i][j+1] = true;
            }
            if(queue.isEmpty()) {
                total++;
                next = findNext(grid, visited);
                if(next!=null) {
                    queue.add(next);
                }
            }
        }
        return total;
    }

    private static Location findNext(char[][] grid, boolean[][] visited) {
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!visited[i][j] && grid[i][j]=='1') {
                    visited[i][j] = true;
                    return new Location(i, j);
                }
            }
        }
        return null;
    }

}
