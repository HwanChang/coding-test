package com.programmers.level1;

public class Q12947 {

    public static boolean solution(int x) {
        String[] numbers = Integer.toString(x).split("");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        return (x % sum) == 0;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }

}
