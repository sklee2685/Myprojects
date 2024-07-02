package enumeration.ex0;

public class StringGradeEx0_1 {// 열거형이 생겨난 이유
    /*
    열거형 미사용 예제

    비즈니스 요구사항
    고객은 3등급으로 나누고, 상품 구매시 등급별로 할인을 적용한다. 할인시 소수점 이하는 버린다.
    `BASIC` 10% 할인
    `GOLD` 20% 할인
    `DIAMOND` 30% 할인
    예) `GOLD` 유저가 10000원을 구매하면 할인 대상 금액은 2000원이다.
     */
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC",price);
        int gold = discountService.discount("GOLD",price);
        int diamond = discountService.discount("DIAMOND",price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
    /*
    문제점
    지금과 같이 단순히 문자열을 입력하는 방식은, 오타가 발생하기 쉽고, 유효하지 않는 값이 입력될 수 있다.
    -> 예제 StringGradeEx0_2.java
     */
}
