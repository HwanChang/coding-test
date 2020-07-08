package com.leetcode.july;

public class Island_Perimeter {

    public static int islandPerimeter(int[][] grid) {
    	int result = 0;
        int x = grid.length;
        int y = grid[0].length;
        
        for(int i=0; i<x; i++) {
        	for(int j=0; j<y; j++) {
        		if(grid[i][j] == 1) {
        	    	if(i == 0 || grid[i-1][j] == 0) result ++;
        	    	if(j == 0 || grid[i][j-1] == 0) result ++;
        	    	if(j == y-1 || grid[i][j+1] == 0) result ++;
        	    	if(i == x-1 || grid[i+1][j] == 0) result ++;
        		}
        	}
        }
        
        return result;
    }

	public static void main(String[] args) {
		int[][] grid = {{0, 1, 0, 0},
						{1, 1, 1, 0},
						{0, 1, 0, 0},
						{1, 1, 0, 0}};
//		int[][] grid = {{1}};

		int answer = islandPerimeter(grid);
		System.out.println(answer);
	}
}
