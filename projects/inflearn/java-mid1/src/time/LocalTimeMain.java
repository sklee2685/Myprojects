package time;

import java.time.LocalTime;
import java.util.Locale;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        //계산(불변객체이니 주의)
        ofTime.plusSeconds(30);
        System.out.println("지정 시간+30s(변경x) = " + ofTime); // 불변객체로 인해 변경x -> 반환값 받아야함

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간+30s(변경ㅇ) = " + ofTimePlus);

    }
}
