package com.programmers.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Priority {
    int priority;
    int location;

    public Priority(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}

public class Stack4 {

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        Deque<Priority> deque = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++) {
            deque.offer(new Priority(priorities[i], i));
        }

        Arrays.sort(priorities);
        int index = priorities.length - 1;

        while(!deque.isEmpty()) {
            Priority poll = deque.poll();

            if(poll.priority < priorities[index]) {
                deque.offer(poll);
            } else if(poll.priority == priorities[index]) {
                if(poll.location == location) {
                    return answer;
                }
                answer++;
                index--;
            }
        }

        // location 을 priorities 크기 보다 크게 입력 했을 경우 (오류)
        return -1;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 1, 1, 1};
        int location = 2;
        int answer = solution(priorities, location);
        System.out.println(answer);
    }
}
