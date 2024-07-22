package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);


        //계산(불변객체이니 주의)
        ofDate.plusDays(10); // 불변으로 인해 값 변경X -> 반환값 받아야함
        System.out.println("지정 날짜+10d(변경x) = " + ofDate);

        LocalDate localDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d(변경ㅇ) = " + localDate);

    }
}
