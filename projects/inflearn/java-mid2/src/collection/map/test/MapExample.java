package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {// 입력받은 데이터로 최고점수, 최고점수 받은 id, 평균을 구하는 프로그램
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }

        int avgScore = totalScore / map.size();
        System.out.println("평균점수: " + avgScore);

        System.out.println("최고점수: " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);

    }
}
