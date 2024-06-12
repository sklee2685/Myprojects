package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        // a와 b에 서로 다른 참조값을 저장한다.(= 인스턴스를 참조한다.)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");// b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // -> 서울
        System.out.println("b = " + b); // -> 부산
    }
}
