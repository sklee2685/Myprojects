package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {//공통의 합
    /**
     * 문제 설명**
     * `map1` 과 `map2` 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
     * 실행 결과를 참고하자.
     *
     * 실행 결과
     * ```
     * {B=6, C=8}
     */
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();

        for (String map1Key : map1.keySet()) {
            if (map2.containsKey(map1Key)) {
                result.put(map1Key, map1.get(map1Key) + map2.get(map1Key));
            }
        }
        System.out.println(result);

    }
}
