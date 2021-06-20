package com.programmers.level1;

public class Q12918 {

    public static boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6;

        for (char character : s.toCharArray()) {
            if (character <= 48 || character >= 57) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

}
