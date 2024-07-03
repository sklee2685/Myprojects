package enumeration.ex3;

import static enumeration.ex3.Grade.*;
//static import를 사용하여 더 읽기 좋은 코드를 만들 수 있다.

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPrecent = 0;

        if (grade == BASIC) { // Grade.BASIC
            discountPrecent = 10;
        } else if (grade == GOLD) { // Grade.GOLD
            discountPrecent = 20;
        } else if (grade == DIAMOND) { // Grade.DIAMOND
            discountPrecent = 30;
        }else {
            System.out.println("할인X");
        }

        return price * discountPrecent / 100;
    }
}

