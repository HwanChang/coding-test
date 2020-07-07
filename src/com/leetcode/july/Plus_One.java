package com.leetcode.july;

import java.util.Arrays;

public class Plus_One {

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 9, 9};
//        int[] digits = {9, 9};

        int[] answer = plusOne(digits);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
