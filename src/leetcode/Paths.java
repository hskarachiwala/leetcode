package leetcode;

import java.util.List;

public class Paths {

    public static class Position {
        public int x;
        public int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean getPath(boolean[][]maze, boolean[][]visited, int row, int col, List<Position> positions) {
        if(row==maze.length-1 && col==maze[0].length-1 && maze[row][col]) {
            positions.add(new Position(row, col));
            return true;
        }
        if(!visited[row][col]) {
            visited[row][col] = true;
            if(row+1<maze.length && maze[row+1][col]) {
                boolean result =  getPath(maze, visited, row+1, col, positions);
                if(result) {
                    positions.add(new Position(row, col));
                    return true;
                }
            }
            if(col+1<maze[0].length && maze[row][col+1]) {
                boolean result = getPath(maze, visited, row, col+1, positions);
                if(result) {
                    positions.add(new Position(row, col));
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
