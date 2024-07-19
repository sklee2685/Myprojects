package 자바;

import java.util.Scanner;

public class b11382 {
    /*
     A + B + C 구하기
     단, (1 ≤ A, B, C ≤ 10^12)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int에 들어가는 최대 수를 넘을 수 있어 long 사용
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(a + b + c);
    }
}
