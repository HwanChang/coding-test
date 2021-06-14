package com.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class Q42839 {

    public static int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        char[] numberArray = numbers.toCharArray();
        boolean[] check = new boolean[7];

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != '0') {
                check[i] = true;
                dfs(set, numberArray, Character.toString(numberArray[i]), 1, check);
                check[i] = false;
            }
        }

        return set.size();
    }

    public static void dfs(Set<Integer> set, char[] numbers, String number, int index, boolean[] check) {
        int intNumber = Integer.parseInt(number);
        if (!set.contains(intNumber)) {
            if (isPrimeNumber(intNumber)) {
                set.add(intNumber);
            }
        }
        if (numbers.length == index) return;

        for (int i = 0; i < numbers.length; i++) {
            if (check[i]) continue;
            check[i] = true;
            dfs(set, numbers, number + numbers[i], index + 1, check);
            check[i] = false;
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2) return true;
        if (number == 1 || number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));
    }

}
