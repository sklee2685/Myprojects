package enumeration.ex2;

public class DiscountService {
    /*
    문자열 상수를 사용함으로써 상수의 이름을 잘못 입력해도 오류를 쉽고 빠르게 찾을 수 있음
     */
    public int discount(ClassGrade classGrade, int price) {
        int discountPrecent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPrecent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPrecent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPrecent = 30;
        }else {
            System.out.println("할인X");
        }

        return price * discountPrecent / 100;
    }
}

