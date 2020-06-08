package com.leetcode.june;

public class Power_of_Two {

    public static boolean isPowerOfTwo(int n) {
        return (n>0) && (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int n = 1;

        boolean answer = isPowerOfTwo(n);
        System.out.println(answer);
    }
}
