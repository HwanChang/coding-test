package com.programmers.hash;

import java.util.*;

public class Hash4 {

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list_entries, (obj1, obj2) -> obj2.getValue().compareTo(obj1.getValue()));

        System.out.println(map);

//        for(Map.Entry entry : list_entries) {
//            System.out.println(list_entries);
//        }

//        List<Integer> values = new ArrayList<Integer>();
//        values.addAll(map.values());
//        Collections.sort(values);
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            entry.
//        }
//
//        HashMap<Integer, String> genresMap = new HashMap<Integer, String>();
//        for(int i=0; i<genres.length; i++) {
//            genresMap.put(i, genres[i]);
//        }
//        HashMap<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
//        for(int i=0; i<plays.length; i++) {
//            playsMap.put(i, plays[i]);
//        }


        return answer;

    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = solution(genres, plays);
    }
}
