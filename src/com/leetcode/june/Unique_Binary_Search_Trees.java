package com.leetcode.june;

public class Unique_Binary_Search_Trees {

    public static int numTrees(int n) {
        int[] answer = new int[n+1];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                answer[i] += answer[j-1] * answer[i-j];
            }
        }

        return answer[n];
    }

    public static void main(String[] args) {
        int n = 3;

        int answer = numTrees(n);
        System.out.println(answer);
    }
}
