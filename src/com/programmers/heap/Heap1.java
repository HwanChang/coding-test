package com.programmers.heap;

import java.util.PriorityQueue;

public class Heap1 {

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Integer scovilleValue : scoville) {
            minHeap.offer(scovilleValue);
        }

        while(!minHeap.isEmpty() && minHeap.peek() < K) {
            int min1 = minHeap.poll();
            if(minHeap.isEmpty()) {
                return -1;
            } else {
                int min2 = minHeap.poll();
                int mix = min1 + (min2 * 2);
                minHeap.offer(mix);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] scoville = {100, 2, 5, 4, 1, 2, 3, 9, 10, 12};
        int[] scoville = {1, 1, 2};
        int K = 3;

        int answer = solution(scoville, K);
        System.out.println(answer);
    }
}
