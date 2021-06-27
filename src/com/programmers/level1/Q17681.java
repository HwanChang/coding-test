package com.programmers.level1;

import java.util.Arrays;

public class Q17681 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String value = Integer.toBinaryString(arr1[i] | arr2[i]);
            if (value.length() < n) {
                String format = "%" + n + "s";
                value = String.format(format, value);
            }

            answer[i] = value.replaceAll("0", " ").replaceAll("1", "#");
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        Arrays.stream(solution(n, arr1, arr2)).forEach(System.out::println);
    }

}
