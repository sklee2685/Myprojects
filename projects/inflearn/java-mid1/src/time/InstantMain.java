package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {//기계 중심의 시간

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();// UTC기준으로 얼만큼 시간이 흘렀는지
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);
        
        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        
        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
