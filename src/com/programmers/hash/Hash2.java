package com.programmers.hash;

import java.util.HashMap;

public class Hash2 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for(String number : phone_book) {
            map.put(number, true);
        }



        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {};
        boolean answer = solution(phone_book);
    }
}
