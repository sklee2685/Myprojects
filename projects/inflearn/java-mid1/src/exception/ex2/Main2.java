package exception.ex2;

import java.util.Scanner;

public class Main2 { //예외처리 사용
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();

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
