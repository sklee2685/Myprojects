package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 { // Map - 같은 키로 다른 데이터를 저장
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1(좀 더 편하게)
        studentMap.putIfAbsent("studentA", 100); //studentA라는 key가 없다면 데이터(value) 추가
        studentMap.putIfAbsent("studentB", 100);//studentB라는 key가 없다면 데이터(value) 추가
        System.out.println(studentMap);

    }
}
