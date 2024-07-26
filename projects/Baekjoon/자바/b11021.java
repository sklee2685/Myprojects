package 자바;

import java.util.Scanner;

public class b11021 {//A+B [각 케이스마다 "Case #x: " 출력]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[] sum = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            sum[i] = A + B;
        }

        for (int i = 0; i < sum.length; i++) {
            // 마지막 케이스 실행하면 줄바꿈 된 상태로 끝나는 점 해결
            if (i == sum.length-1) {
                System.out.print("Case #" + (i + 1) + ": " + sum[i]);
            }else {
                System.out.println("Case #" + (i + 1) + ": " + sum[i]);
            }
        }
    }
}
