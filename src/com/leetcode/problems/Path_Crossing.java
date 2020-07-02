package com.leetcode.problems;

import java.util.HashSet;

class Point {
    int x = 0;
    int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return x * 991 + y;
    }
}

public class Path_Crossing {

    public static boolean isPathCrossing(String path) {
        HashSet<Point> hashSet = new HashSet<>();
        hashSet.add(new Point(0, 0));
        int x = 0;
        int y = 0;

//        속도 차이 수정
//        for(char c : path.toCharArray()) {
        for(int i=0; i<path.length(); i++) {
            if(path.charAt(i) == 'N') {
                y++;
            } else if(path.charAt(i) == 'E') {
                x++;
            } else if(path.charAt(i) == 'W') {
                x--;
            } else if(path.charAt(i) == 'S') {
                y--;
            }

            Point point = new Point(x, y);
            if(hashSet.contains(point)) {
                return true;
            }
            
            hashSet.add(point);
        }

        return false;
    }

    public static void main(String[] args) {
        String path = "NESWW";

        boolean answer = isPathCrossing(path);
        System.out.println(answer);
    }
}
