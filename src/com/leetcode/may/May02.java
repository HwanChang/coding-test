package com.leetcode.may;

public class May02 {

    public static int numJewelsInStones(String J, String S) {
        int answer = 0;

//        수정 전
//        Runtime: 9 ms
//        Memory Usage: 40.8 MB
//        String[] jewels = J.split("");
//        String[] stones = S.split("");
//
//        for(String jewel : jewels) {
//            for(String stone : stones) {
//                if(jewel.equals(stone)) {
//                    answer ++;
//                }
//            }
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        수정 후
//        Runtime: 0 ms
//        Memory Usage: 37.4 MB
        for(char jewel : J.toCharArray()) {
            for(char stone : S.toCharArray()) {
                if(jewel == stone) {
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        int answer = numJewelsInStones(J, S);
        System.out.println(answer);
    }
}
