package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q12932 {

    public static int[] solution(long n) {
        ArrayList<Integer> nums = new ArrayList<>();

        while (n != 0) {
            nums.add((int) (n % 10));
            n = n / 10;
        }

        int[] answer = new int[nums.size()];
        int index = 0;
        for (int num : nums) {
            answer[index++] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 21345;
        Arrays.stream(solution(n)).forEach(System.out::println);
    }

}
