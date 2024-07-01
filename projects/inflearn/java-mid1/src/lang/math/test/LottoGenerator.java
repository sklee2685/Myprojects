package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    /*
    문제 - 로또 번호 자동 생성기

    **문제 설명**
    로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
    로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
    각 숫자는 중복되면 안된다.
    실행할 때 마다 결과가 달라야 한다.

    **실행 결과**
    로또 번호: 11 19 21 35 29 16
     */
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1~45 숫자 랜덤 생성
            int randomNum = random.nextInt(45) + 1;

            // 중복값 제외
            if (Unique(randomNum)) {
                lottoNumbers[count] = randomNum;
                count++;
            }
        }
        return lottoNumbers;
    }

    // 이미 생성된 번화와 중복되는지 검사
    private boolean Unique(int num) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
