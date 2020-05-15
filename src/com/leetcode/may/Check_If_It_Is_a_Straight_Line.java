package com.leetcode.may;

// May08
public class Check_If_It_Is_a_Straight_Line {

    // Runtime: 0 ms
    // Memory Usage: 38.9 MB
    public static boolean checkStraightLine(int[][] coordinates) {
        int length = coordinates.length - 1;
        double inclination = 0;

        if(coordinates[length][1] != coordinates[0][1]) {
            inclination = (double)(coordinates[length][0] - coordinates[0][0]) / (coordinates[length][1] - coordinates[0][1]);
        }

        for(int i=0; i<length/2; i++) {
            if(coordinates[length-i][1] == coordinates[i][1]) {
                continue;
            }

            if((double)(coordinates[length-i][0] - coordinates[i][0]) / (coordinates[length-i][1] - coordinates[i][1]) != inclination) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
//        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
//        int[][] coordinates = {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
        int[][] coordinates = {{2,-3},{-8,-3},{-8,6},{-4,8},{1,5},{4,-7},{1,7},{8,4}};
        boolean answer = checkStraightLine(coordinates);
        System.out.println(answer);
    }
}
