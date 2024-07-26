package 자바;

import java.util.Scanner;

public class b11022 {//A+B [각 케이스마다 "Case #x: A + B = C" 출력]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[] aNum = new int[T];
        int[] bNum = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            aNum[i] = A;
            bNum[i] = B;
        }

        for (int i = 0; i < aNum.length; i++) {
            // 마지막 케이스 실행하면 줄바꿈 된 상태로 끝나는 점 해결
            if (i == aNum.length - 1) {
                System.out.print("Case #" + (i + 1) + ": " + aNum[i] + " + " + bNum[i] + " = " + (aNum[i] + bNum[i]));
            } else {
                System.out.println("Case #" + (i + 1) + ": " + aNum[i] + " + " + bNum[i] + " = " + (aNum[i] + bNum[i]));
            }
        }
    }
}
