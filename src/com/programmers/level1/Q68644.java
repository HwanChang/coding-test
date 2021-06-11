package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q68644 {

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                var sum = numbers[i] + numbers[j];
                if (!list.contains(sum))
                    list.add(sum);
            }
        }

        return list.stream().sorted().mapToInt(number -> number).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
//        int[] numbers = {5, 0, 2, 7};
        Arrays.stream(solution(numbers)).forEach(System.out::println);
    }

}
