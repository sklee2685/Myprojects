package exception.ex0;

import java.util.Scanner;

public class Main0 { //예외처리 사용x
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String data = scanner.nextLine();

            if (data.equals("exit")) {
                break;
            }

            networkService.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
