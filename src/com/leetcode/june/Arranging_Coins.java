package com.leetcode.june;

public class Arranging_Coins {

    /*
        x(x+1)/2 == 1부터 x까지 합

        x(x+1)/2 <= n
        -> x^2 + x + 1/2 <= n
        -> x^2 + x <= 2n
        -> X^2 + x + 1/4 <= 2n + 1/4
        -> (x + 1/2)^2 <= 2n + 1/4
        -> x + 1/2 <= root(2n + 1/4)
        -> x <= root(2n + 1/4) - 1/2
    */
    public static int arrangeCoins(int n) {
        return (int)(Math.sqrt((2L * n) + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        int n = 1804289383;

        int answer = arrangeCoins(n);
        System.out.println(answer);
    }
}
