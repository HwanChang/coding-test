package com.programmers.level1;

import java.util.Arrays;

public class Q12940 {

    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);

        return new int[]{gcd, (n * m) / gcd};
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int n = 12;
        int m = 3;
        Arrays.stream(solution(n, m)).forEach(System.out::println);
    }

}
