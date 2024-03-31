package array.ex;

import java.util.Scanner;

public class ArrayEx2 {//배열의 입력과 출력
    /*
    사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
    출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
    실행 결과 예시를 참고하자.
    **실행 결과 예시**
    ```
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    출력
    1, 2, 3, 4, 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j]);
            if (j != num.length-1) {
                System.out.print(", ");
            }
        }

    }
}
