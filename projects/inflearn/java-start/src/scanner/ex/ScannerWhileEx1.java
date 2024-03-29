package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {//이름 과 나이 반복
    /*
    사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
    사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
    다음 실행 결과 예시를 참고해주세요.
    **실행 결과 예시**
    ```
    이름을 입력하세요 (종료를 입력하면 종료): 자바
    나이를 입력하세요: 30
    입력한 이름: 자바, 나이: 30
    이름을 입력하세요 (종료를 입력하면 종료): 하니
    나이를 입력하세요: 20
    입력한 이름: 하니, 나이: 20
    이름을 입력하세요 (종료를 입력하면 종료): 종료
    프로그램을 종료합니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();// 10을 입력후 엔터(\n)를 입력하면 nextInt()에서 10만 가지고감-> 엔터(\n)값은 남아있음
            // 그래서 반복문을 통해 다시 처음부터 값을 입력받으면 처음 이름을 입력하는 부분이 그냥 넘어감
            scanner.nextLine();// 따라서 해당 코드를 통해 남은 엔터(\n)값을 가지고감

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }


    }
}
