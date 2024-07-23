package 자바;

import java.util.Scanner;

public class b25304 {// 영수증
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //검증을 위한 제품 가격 저장소
        int sumProduct = 0;

        //총 금액
        long sum = scanner.nextInt();
        scanner.nextLine();
        //물품 종류
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            //a: 금액, b: 수량
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            sumProduct += a * b;
        }

        if (sum == sumProduct) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
