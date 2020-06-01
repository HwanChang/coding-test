package com.programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Job implements Comparable<Job>{
    int jobStart;
    int jobTime;

    public Job(int jobStart, int jobTime) {
        this.jobStart = jobStart;
        this.jobTime = jobTime;
    }

    @Override
    public int compareTo(Job o) {
        return this.jobTime - o.jobTime;
    }
}

public class Heap3 {

    public static int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        PriorityQueue<Job> minHeap = new PriorityQueue<>();
        int time = 0;
        int index = 0;
        int work = 0;

        while(index < jobs.length || !minHeap.isEmpty()) {
            while(index < jobs.length && time == jobs[index][0]) {
                minHeap.offer(new Job(jobs[index][0], jobs[index][1]));
                index++;
            }

            if(work == 0 && !minHeap.isEmpty()) {
                Job job = minHeap.poll();
                work = job.jobTime;
                answer += (time-job.jobStart) + job.jobTime;
            }

            if(work != 0) {
                work--;
            }

            time++;
        }

        answer = answer / jobs.length;

        return answer;
    }

    public static void main(String[] args) {
//        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
//        int[][] jobs = {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};
//        int[][] jobs = {{0, 10}, {4, 10}, {5, 11}, {15, 2}};
        int[][] jobs = {{1, 9}, {1, 4}, {1, 5}, {1, 7}, {1, 3}};
        
        int answer = solution(jobs);
        System.out.println(answer);
    }
}
