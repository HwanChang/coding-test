package com.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// May17
public class Find_All_Anagrams_in_a_String {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();

        // 수정 전
        // Runtime: 1639 ms
        // Memory Usage: 40.9 MB
//        char[] pArray = p.toCharArray();
//        Arrays.sort(pArray);
//        for(int i=0; i<s.length()-(p.length()-1); i++) {
//            String subString = s.substring(i, p.length() + i);
//            char[] sArray = subString.toCharArray();
//            Arrays.sort(sArray);
//
//            if(Arrays.equals(pArray, sArray)) answer.add(i);
//        }
//
//        return answer;

//        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()) {
//            return answer;
//        }
//
//        int[] pCount = new int[26];
//        for(char c : p.toCharArray()) {
//            pCount[c - 'a']++;
//        }
//
//        int[] sCount = new int[26];
//        for(int i=0; i<s.length()-p.length()+1; i++) {
//
//            for(int j=0; j<p.length(); j++) {
//                sCount[s.charAt(i+j) - 'a']++;
//            }
//
//            boolean found = true;
//            for (int j=0; j<26; j++) {
//                if (pCount[j] != sCount[j]) {
//                    found = false;
//                    break;
//                }
//            }
//            if(found) answer.add(i);
//        }

        // 수정 후
        // Runtime: 14 ms
        // Memory Usage: 44.6 MB
        int[]sArray = new int[26];
        int[]pArray = new int[26];

        for(char c: p.toCharArray())
            pArray[c-'a']++;
        int n = p.length();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if (i>=n){
                sArray[s.charAt(i-n) - 'a']--;
            }

            sArray[c - 'a']++;
            if(Arrays.equals(sArray, pArray))
                answer.add(i - n+1);
        }

        return answer;

    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
//        String s = "abab";
//        String p = "ab";

        List<Integer> answer = findAnagrams(s, p);
        answer.forEach(System.out::println);
    }
}
