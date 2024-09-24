package mazepack;

//This class is for transposing an array

public class MazeTransposer {
    public static char[][] transpose_maze(char[][] input_maze) {
        int rows = input_maze.length;
        int columns = input_maze[0].length;
        // the new array must be initialized to correct size; get size from input maze
        char[][] transposed_maze = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed_maze[i][j] = input_maze[j][i];
            }
        }

        return transposed_maze;
    }
}