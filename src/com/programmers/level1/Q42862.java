package com.programmers.level1;

public class Q42862 {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue;
            boolean isLost = true;
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == (reserve[j] - 1) || lost[i] == (reserve[j] + 1)) {
                    isLost = false;
                    reserve[j] = -1;
                    break;
                }
            }
            if (isLost) answer++;
        }

        return n - answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2};
        int[] reserve = {2, 3};
        System.out.println(solution(n, lost, reserve));
    }

}
