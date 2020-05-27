package com.programmers.stack;

import java.util.Stack;

public class Stack5 {

    public static int solution(String arrangement) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        char[] array = arrangement.toCharArray();

        for(int i=0; i<arrangement.length(); i++) {
            if(array[i] != ')') {
                stack.add(array[i]);
            }

            if(array[i] == (')')) {
                stack.pop();

                if(array[i-1] == ('(')) {
                    answer += stack.size();
                } else if(array[i-1] == (')')) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String arrangement = "()(((()())(())()))(())";
        int answer = solution(arrangement);
        System.out.println(answer);
    }
}
