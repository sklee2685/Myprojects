package 자바;

import java.util.Scanner;

public class b1330 { //두 수 비교
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
