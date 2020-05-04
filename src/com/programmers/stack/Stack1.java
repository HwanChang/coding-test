package com.programmers.stack;

import java.util.Stack;

public class Stack1 {

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> stack = new Stack<Integer>();
        for(int height : heights) {
            stack.push(height);
        }

        while(stack.size() > 0) {
            int pop = stack.pop();
            int size = stack.size()-1;

            for(int i=size; i>=0; i--) {
                if(heights[i] > pop) {
                    answer[size+1] = i+1;
                    break;
                }

                if(i == 0) {
                    answer[size+1] = 0;
                    break;
                }
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
