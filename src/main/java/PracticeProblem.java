public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int searchMazeMoves(String[][] maze){
int col = 0;
int row = maze.length-1;
int moves = 0;

return mazeHelper (maze, moves, row, col);

	}

	public static int mazeHelper(String[][] maze, int moves, int row, int col){
		if(row < 0){
			return -1;
		}
		if(col >= maze[row].length){
			return -1;
		}
		if(maze[row][col].equals("*")){
			return -1;
		}
if(maze[row][col].equals("F")){
	return moves;
}
int right;
int up;
int minMoves;
right = mazeHelper(maze, moves+1, row, col+1);
up = mazeHelper(maze, moves+1, row-1, col);

if(up < 0 && right< 0){
	return -1;
}
else if(up < 0){
return right;
}
else if(right < 0){
return up;
}
minMoves = Math.min(right, up);
return minMoves;
}




public static int noOfPaths(String[][] maze){
	int col = 0;
	int row = maze.length-1;
	int paths = 0;
	int paths2 = 0;
	paths2 = mazePathsHelper (maze, paths, row, col);
	if(paths2 > -1){
		return paths2;
	}
	return 0;
		}
	
		public static int mazePathsHelper(String[][] maze, int paths, int row, int col){
			if(row < 0){
				return -1;
			}
			if(col >= maze[row].length){
				return -1;
			}
			if(maze[row][col].equals("*")){
			return -1;
		}
	if(maze[row][col].equals("F")){
		return 1;
	}
	int right;
	int up;
	right = mazePathsHelper(maze, paths, row, col+1);
	up = mazePathsHelper(maze, paths, row-1, col);
	
	if(up < 0 && right< 0){
		return -1;
	}
	else if(up < 0){
	return right;
	}
	else if(right < 0){
	return up;
	}
	return right + up;
	}

}
