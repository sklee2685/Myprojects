package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int rank; //카드의 숫자
    private final Suit suit; //카드 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        //숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.rank != anotherCard.rank) { // 숫자가 드라면
            return Integer.compare(this.rank, anotherCard.rank); // 숫자 끼리 비교하고
        }else{// 숫자가 같으면
            return this.suit.compareTo(anotherCard.suit);//문양끼리 비교
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
