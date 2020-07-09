package com.leetcode.problems;

public class Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        int point = 0;

        for(int i=1; i<nums.length; i++) {
            if(nums[point] != nums[i]) {
                point++;
                nums[point] = nums[i];
            }
        }

        return point + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {0};

        int answer  = removeDuplicates(nums);
        System.out.println(answer);
    }
}
