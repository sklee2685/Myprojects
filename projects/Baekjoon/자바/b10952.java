package 자바;

import java.util.Scanner;

public class b10952 {//입력의 마지막에는 0 두 개가 입력되기 전까지 A+B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            } else {
                System.out.println(A + B);
            }
        }
    }
}
