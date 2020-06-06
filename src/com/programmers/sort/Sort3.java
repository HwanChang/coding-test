package com.programmers.sort;

import java.util.Arrays;

public class Sort3 {

    public static int solution(int[] citations) {
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
//        int[] citations = {3, 0, 6, 1, 5};
        int[] citations = {3, 0, 6, 1, 5, 4, 9, 7};
        int answer = solution(citations);
        System.out.println(answer);
    }
}
