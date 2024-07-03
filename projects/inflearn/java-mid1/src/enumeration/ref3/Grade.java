package enumeration.ref3;

public enum Grade {
    //ex3.DiscountService와 동일한 코드

    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 할인율 로직 객체지향 관점으로 수정
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
