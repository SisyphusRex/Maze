package mazepack;

//System Imports
import java.util.HashMap;
//First Party Imports

import mazepack.MazePrinter;

//Third Party Imports

public class MazeSolver {

    private Boolean solving = true;

    private HashMap<String, Integer> bounds = new HashMap<String, Integer>();

    public void solve_maze(char[][] maze, int x, int y) {
        establish_bounds(maze);
        maze_traversal(maze, x, y);
        bounds.clear();
        solving = true;

    }

    private void maze_traversal(char[][] maze, int current_x, int current_y) {
        switch (maze[current_y][current_x]) {
            case '#':
                return;
            case 'X':
                return;
            case 'O':
                return;
            case '.':
                maze[current_y][current_x] = 'X';
                if (solving) {
                    MazePrinter.print_maze(maze);
                }
                if (current_y == bounds.get("top") || current_y == bounds.get("bottom")) {
                    solving = false;
                    return;
                }
                if (current_x == bounds.get("left") || current_x == bounds.get("right")) {
                    solving = false;
                    return;
                }
                if (solving) {
                    maze_traversal(maze, current_x, current_y + 1);
                }
                if (solving) {
                    maze_traversal(maze, current_x + 1, current_y);
                }
                if (solving) {
                    maze_traversal(maze, current_x - 1, current_y);
                }
                if (solving) {
                    maze_traversal(maze, current_x, current_y - 1);
                }
                if (solving) {
                    maze[current_y][current_x] = 'O';
                    MazePrinter.print_maze(maze);
                }
        }

    }

    private void establish_bounds(char[][] maze) {
        int rows = maze.length;
        int columns = maze[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        bounds.put("top", top);
        bounds.put("bottom", bottom);
        bounds.put("left", left);
        bounds.put("right", right);
    }
}