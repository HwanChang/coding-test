package com.leetcode.may;

import java.util.Arrays;

// May11
public class Flood_Fill {

    // Runtime: 0 ms
    // Memory Usage: 40.6 MB
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int point = image[sr][sc];

        if(point == newColor) {
            return image;
        }

        findPixel(image, sr, sc, newColor, point);

        return image;
    }

    public static int[][] findPixel(int[][] image, int sr, int sc, int newColor, int point) {
        image[sr][sc] = newColor;

        // 상
        if( sr > 0 && point == image[sr-1][sc] ) {
            findPixel(image, sr-1, sc, newColor, point);
        }

        // 하
        if( sr < image.length-1 && point == image[sr+1][sc] ) {
            findPixel(image, sr+1, sc, newColor, point);
        }

        // 좌
        if( sc > 0 && point == image[sr][sc-1] ) {
            findPixel(image, sr, sc-1, newColor, point);
        }

        // 우
        if( sc < image[0].length-1 && point == image[sr][sc+1] ) {
            findPixel(image, sr, sc+1, newColor, point);
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
//        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
//        int sr = 1;
//        int sc = 1;
//        int newColor = 2;
//        int[][] image = {{0, 0, 0}, {0, 1, 1}};
//        int sr = 1;
//        int sc = 1;
//        int newColor = 1;

        int[][] answer = floodFill(image, sr, sc, newColor);

        for(int[] pixel : answer)
            System.out.println(Arrays.toString(pixel));
    }
}
