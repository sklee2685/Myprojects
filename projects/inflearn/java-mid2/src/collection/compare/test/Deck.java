package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {//카드 뭉치
    List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit card : Suit.values()) {
                cards.add(new Card(i, card));
            }
        }
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
