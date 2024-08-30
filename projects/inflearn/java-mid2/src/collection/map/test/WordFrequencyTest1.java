package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {//같은 단어가 나타난 수
    /**
     * 문제 설명**
     * 각각의 단어가 나타난 수를 출력해라
     *
     * 실행 결과
     * ```
     * {orange=1, banana=2, apple=3}
     */
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;

            map.put(word, count);
        }
    }
}
