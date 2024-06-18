package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {// 사이 숫자 **마지막 코드 부분 다시 체크 해보기**
    /*
    사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
    사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 `num1` 이어야 합니다.
    사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 `num2` 이어야 합니다.
    만약 첫 번째 숫자 `num1` 이 두 번째 숫자 `num2` 보다 크다면, 두 숫자를 교환하세요.
    참고: 교환을 위해 임시 변수 사용을 고려하세요.
    `num1` 부터 `num2` 까지의 각 숫자를 출력하세요.
    출력 결과에 유의하세요. 다음 예시와 같이 `2,3,4,5` 처럼 `,` 로 구분해서 출력해야 합니다.
    **실행 결과 예시**
    ```
    첫 번째 숫자를 입력하세요:2
    두 번째 숫자를 입력하세요:5
    두 숫자 사이의 모든 정수:2,3,4,5
     */
    public static void main(String[] args) {
        // Scanner클래스를 사용할 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt(); //int타입으로 값을 받아 변수 num1에 초기화

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt(); //int타입으로 값을 받아 변수 num2에 초기화

        // num1이 num2보다 크면 두 숫자를 교환
        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) { //맨 마지막 정수일때 ,를 제외하고 출력
                System.out.print(",");
            }
        }
    }
}
