package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {//hashCode, equals를 모두 구현하지 않은 경우

    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10); // 비교용
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A"); //id가 같은 회원
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A"); //id가 같은 회원
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // 참조값을 비교하기 때문에 false

        set.add(m1);
        set.add(m2);
        //회원 id가 "A"로 같은 회원의 데이터가 데이터가 중복 저장됨
        System.out.println(set);

        //검색 실패(데이터가 있는 위치랑 반환한 위치가 다름)
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

    }
}
