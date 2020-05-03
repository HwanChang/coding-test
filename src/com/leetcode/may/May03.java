package com.leetcode.may;

import java.util.HashMap;
import java.util.Map;

public class May03 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean answer = true;

//        수정 전
//        Runtime: 14 ms
//        Memory Usage: 40.8 MB
//        HashMap<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
//        HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
//
//        for(char c : ransomNote.toCharArray()) {
//            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
//        }
//
//        for(char c : magazine.toCharArray()) {
//            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
//        }
//
//        for(Map.Entry entry : ransomNoteMap.entrySet()) {
//            if(magazine.contains(entry.getKey().toString())) {
//                if(Integer.parseInt(entry.getValue().toString()) > magazineMap.get(entry.getKey())) {
//                    answer = false;
//                }
//            } else {
//                answer = false;
//            }
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        수정 후
//        Runtime: 2 ms
//        Memory Usage: 40.1 MB
        if(magazine.length() < ransomNote.length()) return false;

        int[] charArr = new int[26];

        for(char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            charArr[index]++;
        }

        for(char c : magazine.toCharArray()) {
            int index = c - 'a';
            charArr[index]--;
        }

        for(int i = 0; i < 26; i += 1) {
            if (charArr[i] < 0) return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean answer = canConstruct(ransomNote, magazine);
        System.out.println(answer);
    }
}
