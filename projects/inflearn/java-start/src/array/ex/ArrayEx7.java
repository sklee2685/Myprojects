package array.ex;

import java.util.Scanner;

public class ArrayEx7 {//2차원 배열1
    /*
    사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
    **실행 결과 예시**
    ```
    1번 학생의 성적을 입력하세요:
    국어 점수:100
    영어 점수:80
    수학 점수:70
    2번 학생의 성적을 입력하세요:
    국어 점수:30
    영어 점수:40
    수학 점수:50
    3번 학생의 성적을 입력하세요:
    국어 점수:60
    영어 점수:70
    수학 점수:50
    4번 학생의 성적을 입력하세요:
    국어 점수:90
    영어 점수:100
    수학 점수:80
    1번 학생의 총점: 250, 평균: 83.33333333333333
    2번 학생의 총점: 120, 평균: 40.0
    3번 학생의 총점: 180, 평균: 60.0
    4번 학생의 총점: 270, 평균: 90.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] object = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(object[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
