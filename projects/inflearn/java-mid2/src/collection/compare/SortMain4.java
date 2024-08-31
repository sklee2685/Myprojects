package collection.compare;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {//자료구조 정렬

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null); //기본형으로 정렬시 null을 입력
        //Collections.sort(list); //도 가능
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        //Collections.sort(list,new IdComparator()); //도 가능
        System.out.println(list);
    }
}
