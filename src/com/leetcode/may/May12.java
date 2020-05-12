package com.leetcode.may;

import java.util.HashMap;
import java.util.Map;

// Single Element in a Sorted Array
public class May12 {

    public static int singleNonDuplicate(int[] nums) {
        // 수정 전
        // Runtime: 6 ms
        // Memory Usage: 41.5 MB
//        int answer = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for(Map.Entry entry : map.entrySet()) {
//            if((int)entry.getValue() == 1) {
//                answer = (int)entry.getKey();
//            }
//        }
//
//        return answer;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // leetCode Solution 참고
        // 수정 후
        // Runtime: 0 ms
        // Memory Usage: 39.8 MB
//        int lo = 0, len = nums.length, hi = len / 2;
//
//        while (lo < hi){
//            int mid = lo + ((hi - lo) >> 1);
//            if (nums[2 * mid] == nums[2 * mid + 1]){
//                lo = mid + 1;
//            } else {
//                hi = mid;
//            }
//        }
//
//        return nums[2 * lo];

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 수정 후
        // Runtime: 0 ms
        // Memory Usage: 39.5 MB
        int xor = 0;
        for(int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 4, 7, 8, 8};
        int answer = singleNonDuplicate(nums);

        System.out.println(answer);
    }
}
