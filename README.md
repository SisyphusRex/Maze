This program is is a maze solver.

The class Maze_solver and its corresponding method find a path out of a maze recursively.  The maze is defined in Program.java as an array with different characters. # is a wall, . is a path.

As the solver "moves" through the maze, it evaluates its position and if it is a good path, marks an 'X', and marks an 'O' if it is a bad path.

Each time the solver moves, it prints out the maze to the terminal.

After solving the maze, the program transposes the array and solves the transposition.

Outside Sources Used:
https://www.w3schools.com/java/java_hashmap.asp
//I used this to create a hashmap, or dictionary
https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
//I used this to print colors to the terminal.

To compile: javac -d . *.java

To Run: java mazepack.MazeBootstrap

___________________________________________________________________________________________________

Copyright 2025 Theodore Podewil  
GPL-3.0-or-later  

/* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/. */
