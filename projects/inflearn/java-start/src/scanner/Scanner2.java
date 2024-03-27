package scanner;

import java.util.Scanner;

public class Scanner2 {// 두 수를 입력받고 그 합을 출력

    public static void main(String[] args) {
        Scanner intValue = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = intValue.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = intValue.nextInt();

        int sum = num1 + num2;
        System.out.println("입력한 두 수의 합은: " + sum);
    }
}
