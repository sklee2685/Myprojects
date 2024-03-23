package loop.ex;

public class ForEx2 {//for ver

    public static void main(String[] args) {
        /*
        반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, `num` 이라는 변수를 사용하여 수를
        표현해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.

        출력 예시:
        2
        4
        6
        8
        10
        12
        14
        16
        18
        20
        */
        int count = 1;

        for (int num = 1; count <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
        }

        //강의 자료에 나온 정답 코드
        /*for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }*/
    }
}
