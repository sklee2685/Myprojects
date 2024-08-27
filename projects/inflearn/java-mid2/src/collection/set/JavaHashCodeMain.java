package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain { //자바에서 지원하는 hashcode
    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode()); //참조값 출력
        System.out.println("obj2.hashCode() = " + obj2.hashCode()); //참조값 출력

        System.out.println();
        
        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        System.out.println();


        //둘은 같을까?, 인스턴스가 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2)); //참조값이 다르기 때문에 false 출력
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); //동일하게 idA를 가지고 있으므로 true

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
