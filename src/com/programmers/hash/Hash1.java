package com.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(String name : completion) {
            map.put(name, map.get(name) -1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {};
        String[] completion = {};
        String answer = solution(participant, completion);
    }
}
