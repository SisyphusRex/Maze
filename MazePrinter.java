package mazepack;

//This class prints a maze

public class MazePrinter {
    public static void print_maze(char[][] input_maze) {
        int rows = input_maze.length;
        int columns = input_maze[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                switch (input_maze[i][j]) {
                    case '#':
                        System.out.print('#');
                        break;
                    case '.':
                        System.out.print(ColoredText.ANSI_YELLOW + "." + ColoredText.ANSI_RESET);
                        break;
                    case 'X':
                        System.out.print(ColoredText.ANSI_GREEN + "X" + ColoredText.ANSI_RESET);
                        break;
                    case 'O':
                        System.out.print(ColoredText.ANSI_RED + "O" + ColoredText.ANSI_RESET);
                        break;
                    // System.out.print(input_maze[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
