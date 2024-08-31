package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {//편리한 컬렉션 생성

    public static void main(String[] args) {
        //편리한 **불변** 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3); //list.add(1)으로 데이터 추가 불가
        Set<Integer> set = Set.of(1, 2, 3); //동일하게 데이터 변경x 읽기만 가능
        Map<Integer, String> map = Map.of(1, "one", 2, "two"); //동일하게 데이터 변경x 읽기만 가능

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass());
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());

        /*
        list.add(4),set.add(4,"four"),map.add(4) 처럼 데이터 추가 불가(예외 발생)
         */
    }
}
