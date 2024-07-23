package 자바;

import java.util.Scanner;

public class b25314 {//입력한 정수에 따라 long 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        num = num / 4;

        for (int i = 0; i <= num; i++) {
            if (i < num) {
                System.out.print("long ");
            } else if (i == num) {
                System.out.println("int");
            }
        }
    }
}
