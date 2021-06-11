package com.programmers.level1;

public class Q12903 {

    public static String solution(String s) {
        int divide = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(divide - 1, divide + 1);
        }
        return String.valueOf(s.charAt(divide));
    }

    public static void main(String[] args) {
        String s = "abcde";
//        String s = "qwer";
        System.out.println(solution(s));
    }

}
