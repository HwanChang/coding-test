package com.leetcode.may;

// May04
public class Number_Complement {

    // Runtime: 0 ms
    // Memory Usage: 36 MB
    public static int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        int xor = (int) Math.pow(2, binaryNum.length());

        if(binaryNum.length() < 31) {
            return num ^ (xor-1);
        }

        return num ^ xor;
    }

    public static void main(String[] args) {
//        int num = 2147483647;
        int num = 2147483646;
        int answer = findComplement(num);
        System.out.println(answer);
    }
}
