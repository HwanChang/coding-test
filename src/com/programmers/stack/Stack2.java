package com.programmers.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Stack2 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        class Truck {
            private final int weight;
            private final int time;

            Truck(int weight, int time) {
                this.weight = weight;
                this.time = time;
            }
        }

        Queue<Truck> queueBridge = new ArrayDeque<>();
        Queue<Truck> queueTruck = new ArrayDeque<>();

        for(int truck : truck_weights) {
            queueTruck.offer(new Truck(truck, 0));
        }

        int weightSum = 0;
        do {
            if(!queueBridge.isEmpty()) {
                if(queueBridge.peek().time == answer) {
                    weightSum -= queueBridge.peek().weight;
                    queueBridge.poll();
                }
            }

            if(!queueTruck.isEmpty()) {
                Truck truckPeek = queueTruck.peek();
                int truckWeight = truckPeek.weight;

                weightSum += truckWeight;

                if (weightSum <= weight) {
                    Truck truck = new Truck(queueTruck.poll().weight, answer + bridge_length);
                    queueBridge.offer(truck);
                } else {
                    weightSum -= truckWeight;
                }
            }
            answer++;
        } while(!queueBridge.isEmpty());

        return answer;
    }

    public static void main(String[] args) {
//        int bridge_length = 2;
//        int weight = 10;
//        int[] truck_weights = {7, 4, 5, 6};

//        int bridge_length = 100;
//        int weight = 100;
//        int[] truck_weights = {10};

        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        int answer = solution(bridge_length, weight, truck_weights);
        System.out.println(answer);
    }
}
