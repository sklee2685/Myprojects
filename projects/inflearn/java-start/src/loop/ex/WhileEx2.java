package loop.ex;

public class WhileEx2 {//while ver

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

        int num = 1;
        int count = 0;

        while (count < 10) {// count라는 변수가 0부터 시작해서 조건식이 count < 10[1부터 시작하면 count <= 10]
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        //강의 자료에 나온 정답 코드
        /*int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }*/
    }
}
