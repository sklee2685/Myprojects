package array.ex;

import java.util.Scanner;

public class ArrayEx3 {//배열과 역순 출력
    /*
    사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
    출력시 출력 포멧은 5, 4, 3, 2, 1과 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
    실행 결과 예시를 참고하자.
    **실행 결과 예시**
    ```
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    입력한 정수를 역순으로 출력:
    5, 4, 3, 2, 1
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: ");
        for (int j = num.length - 1; j >= 0; j--) {
            System.out.print(num[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
    }
}
