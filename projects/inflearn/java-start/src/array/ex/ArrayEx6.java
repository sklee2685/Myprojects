package array.ex;

import java.util.Scanner;

public class ArrayEx6 {//가장 작은 수 큰 수 찾기
    /*
    사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로램을 작성하자.
    실행 결과 예시를 참고하자.
    **실행 결과 예시**
    ```
    입력받을 숫자의 개수를 입력하세요:3
    3개의 정수를 입력하세요:
    1
    2
    5
    가장 작은 정수: 1
    가장 큰 정수: 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] num = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        max = min = num[0];
        for (int i = 1; i < count; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
