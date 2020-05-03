package com.programmers.hash;

import java.util.HashMap;

public class Hash3 {

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 1) + 1);
        }

        for(Integer count : map.values()) {
            answer = answer * count;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {};
        int answer = solution(clothes);
    }
}
