package 자바;

import java.util.Scanner;

public class b1001 { //A-B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////#1
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //
        //System.out.println(a - b);

        //#2
        String nums = scanner.nextLine();

        //입력받은 문자열에 있는 두 수를 공백을 기준으로 나눔
        String[] num = nums.split(" ");

        //입력 받은 두 수를 문자열에서 정수형으로 변경
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        System.out.println(a - b);
    }
}
