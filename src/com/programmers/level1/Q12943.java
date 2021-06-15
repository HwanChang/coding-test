package com.programmers.level1;

public class Q12943 {

    public static int solution(int num) {
        int answer = 0;
        long longNum = num;

        while (longNum != 1) {
            if (answer == 500) {
                answer = -1;
                break;
            }

            longNum = (longNum % 2 == 0) ? longNum / 2 : (longNum * 3) + 1;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int num = 626331;
        System.out.println(solution(num));
    }

}
