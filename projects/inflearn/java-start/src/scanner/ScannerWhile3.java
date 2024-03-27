package scanner;

import java.util.Scanner;

public class ScannerWhile3 {// Scanner+반복문
    /*
    사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성
    사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
    이 떄, 프로그램이 종료될 떄까지 사용자가 입력한 모든 정수의 합을 출력해야한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 프로그램은 종료 됩니다.");
        while (true) {
            System.out.print("숫자를 입력하시오: ");
            int num1 = scanner.nextInt();

            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num1;
        }
        System.out.println("입력한 숫자들의 합: " + sum);
    }
}
