package scanner;

import java.util.Scanner;

public class ScannerWhile2 {// Scanner+반복문
    /*
    1. 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램
    2. 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료
    3. 프로그램은 반복해서 실행된다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료 합니다.");
        while (true) {
            System.out.print("첫 번째 숫자: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 수의 합: " + sum);

        }
    }
}
