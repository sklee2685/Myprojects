package collection.compare.test;

public enum Suit {// 카드 마크
    SPADE("♠"), // 스페이드(♠)
    HEART("♥"),// 하트(♥)
    DIAMOND("♦"),// 다이아몬드(♦)
    CLUB("♣");// 클로버(♣)

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
