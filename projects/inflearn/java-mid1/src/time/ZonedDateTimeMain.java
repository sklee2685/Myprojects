package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {//ZonedDateTime `ZonedDateTime` 은 `LocalDateTime` 에 시간대 정보인 `ZoneId` 가 합쳐진 것
    public static void main(String[] args) {
        ZonedDateTime nowZd = ZonedDateTime.now();
        System.out.println("nowZd = " + nowZd);

        LocalDateTime ldt = LocalDateTime.of(2023, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0,
                ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        //타임존 변경
        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt);

    }
}
