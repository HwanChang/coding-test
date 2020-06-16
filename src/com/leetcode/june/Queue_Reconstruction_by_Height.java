package com.leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;

public class Queue_Reconstruction_by_Height {

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> (o1[0] == o2[0]) ? (o1[1] - o2[1]) : (o2[0] - o1[0]));

        ArrayList<int[]> arrayList = new ArrayList<>();
        for(int[] person : people) {
            arrayList.add(person[1], person);
        }

        return arrayList.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
//        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] people = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};

        int[][] answer = reconstructQueue(people);
        for(int[] value : answer) {
            System.out.println(value[0] + " | " + value[1]);
        }
    }
}
