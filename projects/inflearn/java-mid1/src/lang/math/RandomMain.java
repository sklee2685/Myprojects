package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1);// seed가 같으면 Random의 값과 같다.
        //ex 마인크래프트 맵 생성시 seed가 같으면 항상 같은 맵이 생성됨

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);// 0~9까지 랜덤 출력
        System.out.println("0~9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1~10까지 랜덤 출력
        System.out.println("1~10: " + randomRange2);

    }
}
