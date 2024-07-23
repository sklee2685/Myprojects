package 자바;

import java.util.Scanner;

public class b2480 {// 주사위 세개
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int max = A;

        // 3개 정수 중 큰 수 찾기
        if (B > A) {
            if (C > B) {
                max = C;
            }else {
                max = B;
            }
        } else if (C > A) {
            max = C;
        }

        if (A == B && A == C) { //같은 눈 3개
            System.out.println(10000 + (A * 1000));
        } else if (A == B || A == C) { //같은 눈 2개
            System.out.println(1000 + (A * 100));
        } else if (B == C) { //같은 눈 2개
            System.out.println(1000 + (B * 100));
        }else { //같은 눈 없음
            System.out.println(max * 100);
        }
    }
}
