// Copyright 2025 Theodore Podewil
// GPL-3.0-or-later

/*
This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>. 
*/

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
