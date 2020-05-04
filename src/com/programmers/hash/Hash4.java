package com.programmers.hash;

import java.util.*;

// 미 해결 : [장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.] 해당 조건 만족하지 않음.
public class Hash4 {

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        for (String genre : genres) {
            countMap.put(genre, countMap.getOrDefault(genre, 0) + 1);
        }
        int genresCount = 0;
        for(int count : countMap.values()) {
            if(count > 1) {
                genresCount += 2;
            } else if(count == 1){
                genresCount += 1;
            }
        }
        answer = new int[genresCount];

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // [key : play 수, value : index] 맵 생성 후 키 값으로 ASC 정렬
        HashMap<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
        for(int i=0; i<plays.length; i++) {
            playsMap.put(plays[i], i);
        }
        Object[] playsKey = playsMap.keySet().toArray();
        Arrays.sort(playsKey);

        // value 기준으로 DESC 정렬
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list_entries, (obj1, obj2) -> obj2.getValue().compareTo(obj1.getValue()));

        int index = 0;
        for(Map.Entry entry : list_entries) {
            int count = 0;
            for(int i=playsKey.length-1; i>=0; i--) {
                if(entry.getKey().equals(genres[playsMap.get(playsKey[i])])) {
                    answer[index] = playsMap.get(playsKey[i]);
                    count++;
                    index++;
                }
                if(count == 2) {
                    break;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
//        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//        int[] plays = {500, 600, 150, 800, 2500};

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 2500, 150, 800, 2510};

        int[] answer = solution(genres, plays);
        for(int result : answer)
            System.out.println(result);
    }
}
