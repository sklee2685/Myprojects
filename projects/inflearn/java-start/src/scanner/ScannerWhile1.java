package scanner;

import java.util.Scanner;

public class ScannerWhile1 {// Scanner+반복문
    /*
    1. 사용자가 입력한 문자열을 그대로 출력하는 프로그램
    2. exit라는 문자가 입력되면 프로그램을 종료
    3. 프로그램은 반복해서 실행됨
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료): ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {// str이라는 변수의 값이 "exit"와 같은가?
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
