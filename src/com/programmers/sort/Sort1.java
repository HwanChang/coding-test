package com.programmers.sort;

import java.util.Arrays;

public class Sort1 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // 수정 전
//        int returnIndex = 0;
//
//        for(int[] command : commands) {
//            int[] newArray = new int[command[1] - command[0] + 1];
//            int index = 0;
//            for(int i=command[0]-1; i<command[1]; i++) {
//                newArray[index++] = array[i];
//            }
//            Arrays.sort(newArray);
//            answer[returnIndex++] = newArray[command[2]-1];
//        }

        // 수정 후
        for(int i=0; i<commands.length; i++) {
            int[] newArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution(array, commands);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
