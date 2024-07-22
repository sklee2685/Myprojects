package 자바;

import java.util.Scanner;

public class b2884 {//알람 시계
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m > 44) {
            System.out.println(h + " " + (m - 45));
        } else if (m < 45 && h > 0) {
            System.out.println((h - 1) + " " + (m + 15));
        }else {
            System.out.println(23 + " " + (m + 15));
        }
    }
}
