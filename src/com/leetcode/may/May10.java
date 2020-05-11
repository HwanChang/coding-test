package com.leetcode.may;

import java.util.Arrays;

// Find the Town Judge
public class May10 {

    public static int findJudge(int N, int[][] trust) {
//        수정 전
//        Runtime: 5 ms
//        Memory Usage: 47.5 MB
//        int answer = -1;
//        int[] trustSum = new int[N];
//
//        for(int[] trustArray : trust) {
//            trustSum[trustArray[1]-1] +=  + 1;
//            trustSum[trustArray[0]-1] += -N;
//        }
//
//        System.out.println(Arrays.toString(trustSum));
//
//        int cnt = 0;
//        for(int i=0; i<trustSum.length; i++) {
//            if(trustSum[i] == N-1) {
//                cnt++;
//                answer = i + 1;
//            }
//        }
//        if(cnt > 1) return -1;
//
//        return answer;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 수정 후
        // Runtime: 2 ms
        // Memory Usage: 47.2 MB

        if(trust.length<  N-1){
            return -1;
        }

        int [] to = new int[N+1];
        int [] from = new int[N+1];

        for(int[] relation :trust){
            to[relation[1]]++;
            from[relation[0]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (to[i] == N - 1 && from[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        int N = 4;
//        int[][] trust = {{1,3}, {1,4}, {2,3}, {2,4}, {4,3}};
//        int N = 3;
//        int[][] trust = {{1,3}, {2,3}};
        int N = 3;
        int[][] trust = {{1,3}, {2,3}, {3,1}};
//        int N = 2;
//        int[][] trust = {{1,2}};

        int answer = findJudge(N, trust);
        System.out.println(answer);
    }
}
