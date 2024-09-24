package mazepack;

//System Imports

//First Party Imports

//Third Party Imports

public class Program {
    // Beginning coordinates
    private static int X_START = 1;
    private static int Y_START = 1;
    // Maze 1 in an array
    private static char[][] maze1 = {
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#' },
            { '#', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#' },
            { '#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
            { '#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.' },
            { '#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
            { '#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
            { '#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
            { '#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#' },
            { '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#' },
            { '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
    };
    // Practice maze in an array
    private static char[][] mazeP = {
            { '#', '#', '#', '#', '#' },
            { '#', '.', '.', '.', '#' },
            { '#', '.', '#', '.', '#' },
            { '#', '#', '.', '.', '#' },
            { '#', '#', '.', '#', '#' },
    };

    // Run method
    public static void run() {
        MazeSolver my_solver = new MazeSolver();
        char[][] transposed_maze = MazeTransposer.transpose_maze(mazeP);

        my_solver.solve_maze(mazeP, X_START, Y_START);
        my_solver.solve_maze(transposed_maze, X_START, Y_START);
    }

}
