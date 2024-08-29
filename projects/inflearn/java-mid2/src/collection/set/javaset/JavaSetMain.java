package collection.set.javaset;

import java.util.*;

public class JavaSetMain { //자바가 제공하는 Set 예제
    public static void main(String[] args) {
        run(new HashSet<>()); // 입력한 순서 보장X
        run(new LinkedHashSet<>()); // 입력한 순서를 보장
        run(new TreeSet<>()); //데이터 값을 기준으로 정렬

    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
