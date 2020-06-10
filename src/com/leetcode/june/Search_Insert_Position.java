package com.leetcode.june;

public class Search_Insert_Position {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int half = start + (end - start) / 2;
            
            if(nums[half] == target) {
                return half;
            }
            
            if(nums[half] < target) {
                start = half + 1;
            } else {
                end = half - 1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int answer = searchInsert(nums, target);
        System.out.println(answer);
    }
}
