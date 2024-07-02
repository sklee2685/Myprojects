package enumeration.ex0;

public class DiscountService {// 열거형이 생겨난 이유
    /*
    열거형 미사용 예제

    비즈니스 요구사항
    고객은 3등급으로 나누고, 상품 구매시 등급별로 할인을 적용한다. 할인시 소수점 이하는 버린다.
    `BASIC` 10% 할인
    `GOLD` 20% 할인
    `DIAMOND` 30% 할인
    예) `GOLD` 유저가 10000원을 구매하면 할인 대상 금액은 2000원이다.
     */
    public int discount(String grade, int price) {
        int discountPrecent = 0;

        if (grade.equals("BASIC")) {
            discountPrecent = 10;
        } else if (grade.equals("GOLD")) {
            discountPrecent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPrecent = 30;
        }else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPrecent / 100;
    }
}
