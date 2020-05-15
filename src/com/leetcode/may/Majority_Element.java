package com.leetcode.may;

import java.util.HashMap;
import java.util.Map;

// May06
public class Majority_Element {

    // Runtime: 8 ms
    // Memory Usage: 45.3 MB
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int numLengthHalf = nums.length / 2;
        int result = 0;
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry entry : map.entrySet()) {
            if((int)entry.getValue() > numLengthHalf) result = (int)entry.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int answer = majorityElement(nums);
        System.out.println(answer);
    }
}
