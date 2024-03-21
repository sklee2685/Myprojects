package cond;

public class If6 {//If5 else if 사용하게되면
    public static void main(String[] args) {
        /*
        온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인
        금액이 달라질 수 있다.
        각각의 할인 조건은 다음과 같다.
        아이템 가격이 10000원 이상일 때, 1000원 할인
        나이가 10살 이하일 때 1000원 할인
        이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.
        예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고, 동시에 나이가 10살 이하이면 추가로 1000원 더
        할인을 받는다. 그래서 총 2000원 까지 할인을 받을 수 있다.
         */

        int price = 10000;// 아이템 가격
        int age = 10;//나이
        int discount = 0;
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");// 총 할인 금액: 1000원 10000원 이상 구매 할인만 적용됨
    }
}
