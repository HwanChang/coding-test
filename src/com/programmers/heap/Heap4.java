package com.programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap4 {

    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(String operation : operations) {
            String[] arrayOperation = operation.split(" ");

            if(arrayOperation[0].equals("I")) {
                minHeap.offer(Integer.parseInt(arrayOperation[1]));
                maxHeap.offer(Integer.parseInt(arrayOperation[1]));
            } else if(arrayOperation[0].equals("D")) {
                if(arrayOperation[1].equals("1") && !maxHeap.isEmpty()) {
                    minHeap.remove(maxHeap.poll());
                } else if(arrayOperation[1].equals("-1") && !minHeap.isEmpty()) {
                    maxHeap.remove(minHeap.poll());
                }
            }
        }

        if(minHeap.isEmpty() && maxHeap.isEmpty()) {
            return new int[] {0, 0};
        } else {
            return new int[] {maxHeap.poll(), minHeap.poll()};
        }
    }

    public static void main(String[] args) {
//        String[] operations = {"I 16", "D 1"};
//        String[] operations = {"I 7", "I 5", "I -5", "D -1"};
        String[] operations = {"I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1", "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"};

        int[] answer = solution(operations);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
