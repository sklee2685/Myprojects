package loop.ex;

public class WhileEx1 { //while ver
    public static void main(String[] args) {
        /*
        처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, `count` 라는 변수를 사용해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.

        출력 예시:
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        */

        // while
        int count = 1;

        while (count <= 10) {
            System.out.println("WhileCount: " + count);
            count++;
        }
    }
}
