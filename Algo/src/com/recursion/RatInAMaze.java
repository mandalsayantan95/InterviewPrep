package com.recursion;

public class RatInAMaze {
	
	static int N = 4;
	static int maze[][] = {{1,0,0,0},
			{1,1,0,1},
			{0,1,0,0},
			{1,1,1,1}};
	static int sol[][] = new int[N][N];
	
	public static boolean findSol(int [][] maze){
		
		if(findsolRec(0,0)==false) {
			return false;
		} else {
			printMatrix(sol);
			return true;
		}
	}
	
	private static void printMatrix(int[][] mat) {
		  for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	  		  System.out.println();
		  }		
	}

	private static boolean findsolRec(int i, int j) {
		
		if (i==N-1 && j==N-1) {
			sol[i][j] = 1;
			return true;
		}
		if (isSafe(i,j)) {
			sol[i][j] = 1;
			if (findsolRec(i, j+1)) return true;
			else if (findsolRec(i+1, j+1)) return true;
			else if (findsolRec(i+1, j))return true;
			sol[i][j] = 0;
		}
		return false;
	}

	private static boolean isSafe(int i, int j) {

		return i<N && j<N && maze[i][j]==1;
	}

	public static void main(String[] args) {
		
		int maze[][] = {{1,0,0,0},
						{1,1,0,1},
						{0,1,0,0},
						{1,1,1,1}};
	
		findSol(maze);
		
	}

}
