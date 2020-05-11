package com.leetcode.may;

import java.util.HashMap;

// First Unique Character in a String
public class May05 {

    // Runtime: 22 ms
    // Memory Usage: 39.6 MB
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArr = s.toCharArray();

        for(char c : charArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : charArr) {
            if(map.get(c) == 1) {
                return s.indexOf(c);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int answer = firstUniqChar(s);
        System.out.println(answer);
    }
}
