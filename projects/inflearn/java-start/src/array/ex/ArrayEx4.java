package array.ex;

import java.util.Scanner;

public class ArrayEx4 {//합계와 평균1
    /*
    사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
    **실행 결과 예시**
    ```
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    입력한 정수의 합계: 15
    입력한 정수의 평균: 3.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        double average = (double) sum / num.length;
        System.out.println("입력한 정수의 총합: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
