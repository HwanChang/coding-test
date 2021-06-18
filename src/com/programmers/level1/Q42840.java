package com.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q42840 {

    public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answerCount = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) answerCount[0]++;
            if (answers[i] == second[i % 8]) answerCount[1]++;
            if (answers[i] == third[i % 10]) answerCount[2]++;
        }

        int max = Math.max(answerCount[0], Math.max(answerCount[1], answerCount[2]));

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            if (max == answerCount[i]) set.add(i + 1);
        }

        return set.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
//        int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int[] answers = {1, 3, 2, 4, 2};
        Arrays.stream(solution(answers)).forEach(System.out::println);
    }

}
