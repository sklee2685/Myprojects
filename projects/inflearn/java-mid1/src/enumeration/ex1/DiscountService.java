package enumeration.ex1;

public class DiscountService {
    /*
    문자열 상수를 사용함으로써 상수의 이름을 잘못 입력해도 오류를 쉽고 빠르게 찾을 수 있음
     */
    public int discount(String grade, int price) {
        int discountPrecent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPrecent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPrecent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPrecent = 30;
        }else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPrecent / 100;
    }
}

