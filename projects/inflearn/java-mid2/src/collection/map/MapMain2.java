package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 { // Map - 같은 키로 다른 데이터를 저장
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); // 같은 키에 저장시 시존 값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA"); // "studentA"라는 key가 있는지 확인
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        studentMap.remove("studentA");// key랑 value 모두 삭제됨
        System.out.println(studentMap);

    }
}
