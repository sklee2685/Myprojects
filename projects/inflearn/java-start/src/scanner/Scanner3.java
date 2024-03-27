package scanner;

import java.util.Scanner;

public class Scanner3 {// 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하느느 프로그램. 두 숫자가 같은 경우 두 숫자는 같다고 출력

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번쨰 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번쨰 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("입력 받은 두 정수중 더 큰 수는: " + num1);
        } else if (num1 < num2) {
            System.out.println("입력 받은 두 정수중 더 큰 수는: " + num2);
        } else {
            System.out.println("입력 받은 두 정수는 서로 같다.");
        }
    }
}
