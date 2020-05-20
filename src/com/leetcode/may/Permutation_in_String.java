package com.leetcode.may;

import java.util.Arrays;

// May18
public class Permutation_in_String {

    public static boolean checkInclusion(String s1, String s2) {
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];

        for(char c: s1.toCharArray()) {
            s1Array[c - 'a']++;
        }
        
        int n = s1.length();

        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);

            if (i>=n){
                s2Array[s2.charAt(i-n) - 'a']--;
            }

            s2Array[c - 'a']++;
            if(Arrays.equals(s2Array, s1Array)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
//        String s1 = "ab";
//        String s2 = "eidboaoo";

        boolean answer = checkInclusion(s1, s2);
        System.out.println(answer);
    }
}
