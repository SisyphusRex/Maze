package mazepack;

//This class prints a maze

public class MazePrinter {
    public static void print_maze(char[][] input_maze) {
        int rows = input_maze.length;
        int columns = input_maze[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(input_maze[i][j]);
            }
            System.out.println();
        }
    }
}