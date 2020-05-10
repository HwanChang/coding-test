package com.leetcode.may;

public class May09 {

    public static boolean isPerfectSquare(int num) {

        // 수정 전 : 시간 복잡도 최악
        // Runtime: 2677 ms
        // Memory Usage: 36.2 MB
//        if(num <= 0) {
//            return false;
//        } else if(num == 1) {
//            return true;
//        }
//
//        int i = 1;
//        while(i <= num/2) {
//            if(i*i == num) {
//                return true;
//            } else {
//                i++;
//            }
//        }
//
//        return false;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 수정 후 : 중간 값을 찾아서 해당 값의 제곱이 num 보다 크면 중간 값보다 큰 수는 답이 될 수 없다. 작은 경우도 동일.
        // Runtime: 2 ms
        // Memory Usage: 40.1 MB
        long low = 1;
        long high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid > num) high = mid - 1;
            else if (mid * mid < num) low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        boolean answer = isPerfectSquare(num);
        System.out.println(answer);
    }
}
