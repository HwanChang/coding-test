package com.programmers.level1;

public class Q12926 {

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char sChar : s.toCharArray()) {
            if (sChar != ' ') {
                if (Character.isLowerCase(sChar)) {
                    sChar += n;
                    if (sChar > 122)
                        sChar -= 26;

                } else {
                    sChar += n;
                    if (sChar > 90)
                        sChar -= 26;
                }
            }

            answer.append(sChar);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "Z";
        int n = 25;
        System.out.println(solution(s, n));
    }

}
