// Copyright 2025 Theodore Podewil
// GPL-3.0-or-later

/*
This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>. 
*/

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
