package com.programmers.hash;

public class Hash2 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(String number1 : phone_book) {
            for(String number2 : phone_book) {
                if(number1.equals(number2)) {
                    continue;
                }

                if(number2.startsWith(number1)) {
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
        boolean answer = solution(phone_book);
    }
}
