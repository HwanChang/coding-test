package com.programmers.sort;

import java.util.Arrays;

public class Sort2 {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        Integer[] numbersInteger = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersInteger, (o1, o2) -> {
            String o1String = o1.toString();
            String o2String = o2.toString();
            return Integer.parseInt(o2String + o1String) - Integer.parseInt(o1String + o2String);
        });

        if(numbersInteger[0] == 0) {
            return "0";
        } else {
            Arrays.stream(numbersInteger).forEach(number -> answer.append(number.toString()));
            return answer.toString();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
//        int[] numbers = {6, 10, 2};
//        int[] numbers = {0, 0, 0, 0,};

        String answer = solution(numbers);
        System.out.println(answer);
    }
}
