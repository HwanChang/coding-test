package com.programmers.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Stack3 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> answerQueue = new ArrayDeque<>();
        Queue<Integer> progressesQueue = new ArrayDeque<>();

        for(int progress : progresses) {
            progressesQueue.offer(progress);
        }

        int beforeWorkDeploy = 0;
        int count = 1;
        while(progressesQueue.size() > 0) {
            int progress = progressesQueue.poll();
            int index = speeds.length - progressesQueue.size() - 1;
            int deploy = (int)Math.ceil((((double)(100 - progress) / speeds[index])));
            if(deploy <= beforeWorkDeploy) {
                count += 1;
            } else {
                if(beforeWorkDeploy != 0) {
                    answerQueue.offer(count);
                }
                beforeWorkDeploy = deploy;
                count = 1;
            }

            if(progressesQueue.size() == 0) {
                answerQueue.offer(count);
            }
        }

        answer = new int[answerQueue.size()];
        int queueSize = answerQueue.size();
        for(int i=0; i<queueSize; i++) {
            answer[i] = answerQueue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};

//        int[] progresses = {40, 93, 30, 55, 60, 65};
//        int[] speeds = {60, 1, 30, 5 , 10, 7};

        int[] progresses = {5, 5, 5};
        int[] speeds = {21, 25, 20};

        int[] answer = solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));
    }
}
