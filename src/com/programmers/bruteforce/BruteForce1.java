package com.programmers.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForce1 {

    public static int[] solution(int[] answers) {
//        Integer[] answer;

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0, 0, 0};

        for(int i=0; i<answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                count[0] += 1;
            }

            if (answers[i] == two[i % two.length]) {
                count[1] += 1;
            }

            if (answers[i] == three[i % three.length]) {
                count[2] += 1;
            }
        }

        // 수정 전
//        int max = 0;
//        List<Integer> solved = new ArrayList<>();
//        for(int i=0; i<3; i++) {
//            if(i == 0) {
//                max = count[i];
//                solved.add(i+1);
//            } else {
//                if(max < count[i]) {
//                    max = count[i];
//                    solved.clear();
//                    solved.add(i+1);
//                } else if(max == count[i]) {
//                    solved.add(i+1);
//                }
//            }
//        }
//
//        answer = solved.toArray(new Integer[solved.size()]);
//        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();


        // 수정 후 (Stream API 사용하지 않으면 실행시간 단축 가능)
        int max = count[0];

        if(max < count[1]) max = count[1];
        if(max < count[2]) max = count[2];

        if(max == count[0] && max == count[1] && max == count[2]) return new int[]{1,2,3};
        else if(max == count[0] && max == count[1]) return new int[]{1,2};
        else if(max == count[0] && max == count[2]) return new int[]{1,3};
        else if(max == count[1] && max == count[2]) return new int[]{2,3};
        else if(max == count[0]) return new int[]{1};
        else if(max == count[1]) return new int[]{2};

        return new int[]{3};
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        int[] answer = solution(answers);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
