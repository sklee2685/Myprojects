package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        /*
        할인율 계산은 이제 `Grade` 가 스스로 처리한다. 따라서 `DiscountService.discount()` 메서드는 단순히
        `Grade.discount()` 를 호출하기만 하면 된다.
        -> DiscountService 파일 이제 필요 없음
         */
        int price = 10000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
