package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12906 {

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int preInt = arr[0];
        list.add(preInt);

        for (int arrInt : arr) {
            if (preInt == arrInt) {
                continue;
            }
            list.add(arrInt);
            preInt = arrInt;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        Arrays.stream(solution(arr)).forEach(System.out::println);
    }

}
