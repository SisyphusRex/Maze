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