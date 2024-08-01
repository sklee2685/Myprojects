package exception.ex1;

import java.util.Scanner;

public class Main1 { //예외처리 사용x - 오류 사항 만들기
    //문제점: 정상 흐름과 예외(오류)흐름이 섞여있어서 코드를 이해하는데 어려움이 있음
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();
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
