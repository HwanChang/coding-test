package com.leetcode.june;

public class Unique_Paths {

    public static int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];

        for(int i=0; i<m; i++) {
            path[i][0] = 1;
        }

        for(int i=0; i<n; i++) {
            path[0][i] = 1;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }

        return path[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 51;
        int n = 9;
//        int m = 7;
//        int n = 3;

        int answer = uniquePaths(m, n);
        System.out.println(answer);
    }
}
