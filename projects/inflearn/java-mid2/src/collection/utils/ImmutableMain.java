package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {//불변 컬렉션과 가변 컬렉션 전환

    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        //가변 리스트 생성
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4); //데이터 추가 가능
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList Class = " + mutableList.getClass());

        //다시 불변 리스트로
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList Class = " + unmodifiableList.getClass());
        //unmodifiableList.add(5); //예외 발생
    }
}
