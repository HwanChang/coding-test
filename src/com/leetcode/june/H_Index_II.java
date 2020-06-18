package com.leetcode.june;

import java.util.Arrays;

public class H_Index_II {

    public static int hIndex(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i=citations.length-1; i>=0; i--) {
            if(citations[i] >= citations.length - i) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {0, 1, 3, 5, 6};
        int answer = hIndex(citations);
        System.out.println(answer);
    }
}
