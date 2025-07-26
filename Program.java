// Copyright 2025 Theodore Podewil
// GPL-3.0-or-later

/*
This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>. 
*/

package mazepack;

import mazepack.MazePrinter;

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
        char[][] transposed_maze = MazeTransposer.transpose_maze(maze1);
        // MazePrinter.print_maze(mazeP);
        my_solver.solve_maze(maze1, X_START, Y_START);
        my_solver.solve_maze(transposed_maze, X_START, Y_START);
    }

}
