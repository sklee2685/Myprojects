package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx8 {//2차원 배열2
    /*
    이전 문제에서 학생수를 입력받도록 개선하자.
    **실행 결과 예시**
    ```
    학생수를 입력하세요:3
    1번 학생의 성적을 입력하세요:
    국어 점수:10
    영어 점수:20
    수학 점수:30
    2번 학생의 성적을 입력하세요:
    국어 점수:10
    영어 점수:10
    수학 점수:10
    3번 학생의 성적을 입력하세요:
    국어 점수:20
    영어 점수:20
    수학 점수:20
    1번 학생의 총점: 60, 평균: 20.0
    2번 학생의 총점: 30, 평균: 10.0
    3번 학생의 총점: 60, 평균: 20.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int member = scanner.nextInt();

        int[][] scores = new int[member][3];
        String[] objects = {"국어", "영어", "수학"};

        for (int i = 0; i < member; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력학세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(objects[j] + " 점수:");
                int score = scanner.nextInt();
                scores[i][j] = score;
            }
        }
        for (int i = 0; i < member; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / member;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
