package com.programmers.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap2 {

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;

        for(int i=0; i<k; i++) {
            if(index < supplies.length && i == dates[index]) {
                maxHeap.offer(supplies[index]);
                index++;
            }

            if(stock == 0) {
                stock += maxHeap.poll();
                answer++;
            }

            stock--;
        }

        return answer;
    }

    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        int answer = solution(stock, dates, supplies, k);
        System.out.println(answer);
    }
}
