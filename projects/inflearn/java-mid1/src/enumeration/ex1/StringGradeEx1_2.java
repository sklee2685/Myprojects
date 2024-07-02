package enumeration.ex1;

public class StringGradeEx1_2 {
    /*
    하지만 문자열 상수를 사용해도, 지금까지 발생한 문제들을 근본적으로 해결할 수 는 없다.
    왜냐하면 `String` 타입은 어떤 문자열이든 입력할 수 있기 때문
     */
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
    // 상수를 사용해도 StringGradeEx0_2에서 처럼 문자열로 입력시 동일한 문제 발생
}
