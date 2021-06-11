package com.programmers.level2;

public class Q43165 {

    public static int solution(int[] numbers, int target) {
        return dfs(numbers[0], numbers, 1, target) + dfs(-numbers[0], numbers, 1, target);
    }

    public static int dfs(int sum, int[] numbers, int index, int target) {
        if (index == numbers.length) {
            if (sum == target) return 1;
            else return 0;
        }

        int positive = sum + numbers[index];
        int negative = sum - numbers[index];

        return dfs(positive, numbers, index + 1, target) + dfs(negative, numbers, index + 1, target);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

}
