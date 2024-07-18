package 자바;

import java.util.Scanner;

public class b1008 { //A/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////#1
        //double a  = scanner.nextDouble();
        //double b = scanner.nextDouble();
        //
        //System.out.println(a / b);

        //#2
        String nums = scanner.nextLine();

        //입력받은 문자열에 있는 두 수를 공백을 기준으로 나눔
        String[] num = nums.split(" ");

        //입력 받은 두 수를 문자열에서 실수형으로 변경(소수점으로 인해 타입 변경)
        Double a = Double.valueOf(num[0]);
        Double b = Double.valueOf(num[1]);

        System.out.println(a / b);
    }
}
