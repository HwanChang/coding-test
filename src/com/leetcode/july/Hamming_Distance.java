package com.leetcode.july;

public class Hamming_Distance {
	
    public static int hammingDistance(int x, int y) {
    	int xor = x ^ y;
    	int count = 0;
    	
        while(xor != 0) {
        	xor &= (xor-1);
        	count += 1;
        }
        
        return count;
    }

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		
		int answer = hammingDistance(x, y);
		System.out.println(answer);
	}

}
