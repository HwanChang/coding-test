package com.programmers.stack;

import java.util.Stack;

public class Stack1 {

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for(int height : heights) {
            stack1.push(height);
            stack2.push(height);
        }

        System.out.println(stack1);

        while(stack2.size() > 0) {
            int stack1Size = stack1.size();
            int stack2Size = stack2.size();

            if(stack1Size == stack2Size) {
                stack1.pop();
                continue;
            } else if(stack1Size == 0) {
                answer[stack2.size()-1] = 0;
                stack2.pop();
                continue;
            }

            int stack1Last = stack1.lastElement();
            int stack2Last = stack2.lastElement();


            if(stack1Last > stack2Last) {
                answer[stack2Size-1] = stack1Size;
                stack2.pop();
            } else {
                stack1.pop();
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {1,5,3,6,7,6,5};
        int[] answer = solution(heights);

        for(int a : answer) {
            System.out.println(a);
        }
    }
}
