package enumeration.ref2;

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

}
