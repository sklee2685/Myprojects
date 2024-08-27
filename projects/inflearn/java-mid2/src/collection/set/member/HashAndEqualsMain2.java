package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {//hashCode는 구현했지만 equals를 구현하지 않은 경우

    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10); // 비교용
        MemberOnlyHash m1 = new MemberOnlyHash("A"); //id가 같은 회원
        MemberOnlyHash m2 = new MemberOnlyHash("A"); //id가 같은 회원
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        //equals를 재정의 하지 않아 Object의 equals를 사용 => 참조값 비교
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        //즉 해시 인덱스는 동일하지만, 참조값은 다른 상태라 중복값이 없는걸로 판단하고 중복 데이터가 저장됨
        set.add(m1);
        set.add(m2);
        //회원 id가 "A"로 같은 회원의 데이터가 데이터가 중복 저장됨
        System.out.println(set);

        //검색 실패
        //해시 인덱스는 정확하게 찾을 수 있음
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());

        //단, 해시 인덱스에 있는 모든 데이터를 equals()를 통해 비교해서 같은 값을 찾아야 하는데
        //재정의하지 않아 Object의 equals()기본 기능인 참조값을 비교함
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

    }
}
