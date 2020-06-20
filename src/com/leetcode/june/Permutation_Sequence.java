package com.leetcode.june;

import java.util.ArrayList;

public class Permutation_Sequence {

    public static String getPermutation(int n, int k) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        int factorial = 1;
        for(int i=1; i<=n; i++) {
            list.add(i);
            factorial *= i;
        }

        k--;
        for(int i=n; i>0; i--) {
            int partition = factorial / i;
            int index = k / partition;
            int num = list.get(index);
            answer.append(num);

            k = k % partition;
            factorial = partition;
            list.remove(index);
         }

        return answer.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 3;

        String answer = getPermutation(n, k);
        System.out.println(answer);
    }
}
