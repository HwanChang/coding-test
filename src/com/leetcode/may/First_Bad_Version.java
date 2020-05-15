package com.leetcode.may;

// May01
public class First_Bad_Version {

    public static boolean isBadVersion(int n) {
        boolean answer = false;
        if(n >= 4) answer = true;

        return answer;
    }

    // 수정 전 : n=2, badVersion=1 이면 1이 아닌 2를 반환하는 오류.
    // 수정 후 : isBadVersion 이 false 일 경우 min 값은 half+1 로 수정.
    // Runtime: 12 ms
    // Memory Usage: 36.1 MB
    public static int firstBadVersion(int n) {
        return checkBadVersion(1, n);
    }

    public static int checkBadVersion(int min, int max) {
        if(min == max) return max;

        int half = min + (max - min) / 2;

        if(isBadVersion(half)) {
            return checkBadVersion(min, half);
        } else {
            return checkBadVersion(half+1, max);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // leetCode Solution 참고
    // 수정 후 : 재귀함수보다 시간이 더 오래걸린다.
    // Runtime: 17 ms
    // Memory Usage: 37.8 MB
//    public static int firstBadVersion(int n) {
//
//        int min = 1;
//        int max = n;
//
//        while (min < max) {
//
//            // half = (min + max) / 2 를 하면 min와 max 가 큰 수 일 경우에 overflow가 난다.
//            // 기본 적으로 중간 값은 아래와 같이 구하는 방식이 안전 하다.
//            int half = min + (max - min) / 2;
//
//            if(isBadVersion(half)) {
//                max = half;
//            } else {
//                min = half + 1;
//            }
//        }
//
//        return max;
//    }

    public static void main(String[] args) {
        int n = 5;
        int answer = firstBadVersion(n);
        System.out.println(answer);
    }
}
