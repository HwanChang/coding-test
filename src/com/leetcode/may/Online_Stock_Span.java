package com.leetcode.may;

import java.util.Stack;

class StockSpanner {

    Stack<DailyPrice> stack = null;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while(!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;
        }
        
        stack.add(new DailyPrice(price, span));

        return span;
    }
}

class DailyPrice {
    int price;
    int span;

    public DailyPrice(int price, int span) {
        this.price = price;
        this.span = span;
    }
}

public class Online_Stock_Span {

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        int answer = 0;
//        answer = stockSpanner.next(29);
//        answer = stockSpanner.next(91);
//        answer = stockSpanner.next(62);
//        answer = stockSpanner.next(76);
//        answer = stockSpanner.next(51);
        answer = stockSpanner.next(100);
        answer = stockSpanner.next(80);
        answer = stockSpanner.next(60);
        answer = stockSpanner.next(70);
        answer = stockSpanner.next(60);
        answer = stockSpanner.next(75);
        answer = stockSpanner.next(85);
    }
}
