package com.leetcode.june;

import java.util.HashMap;
import java.util.Map;

public class Single_Number_II {

    public static int singleNumber(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};

        int answer = singleNumber(nums);
        System.out.println(answer);
    }
}
