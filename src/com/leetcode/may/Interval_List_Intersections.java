package com.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// May23
public class Interval_List_Intersections {

    // Runtime: 2 ms
    // Memory Usage: 40.6 MB
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        int low;
        int high;

        while(i < A.length && j < B.length) {
            low = Math.max(A[i][0], B[j][0]);
            high = Math.min(A[i][1], B[j][1]);

            if(low <= high) {
                list.add(new int[]{low, high});
            }

            if(high == A[i][1]) {
                i++;
            } else if(high == B[j][1]) {
                j++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = {{0,2},{5,10},{13,23},{24,25}};
        int[][] B = {{1,5},{8,12},{15,24},{25,26}};

        int[][] answer = intervalIntersection(A, B);
        System.out.println(Arrays.deepToString(answer));
    }
}
