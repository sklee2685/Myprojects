package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {// 음식점 주문
    /*
    - 음식점 주문
      사용자로부터 음식의 이름( `foodName` ), 가격( `foodPrice` ), 그리고 수량( `foodQuantity` )을 입력받
      아, 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
      음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격( `foodPrice` )과 수량( `foodQuantity` )을 곱한
      값이며, 이를 `totalPrice` 라는 이름의 변수에 저장하세요.
      주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가
      격]원입니다." 이어야 합니다.
      **실행 결과 예시**
      ```
      음식 이름을 입력해주세요: 피자
      음식의 가격을 입력해주세요: 20000
      음식의 수량을 입력해주세요: 2
      피자 2개를 주문하셨습니다. 총 가격은 40000원입니다.
      ```
     */
    public static void main(String[] args) {
        // Scanner클래스를 사용할 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();// String타입으로 값을 받아 변수 foodName에 초기화

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();// int타입으로 값을 받아 변수 foodPrice에 초기화

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();// int타입으로 값을 받아 변수 foodQuantity에 초기화

        int totalPrice = foodPrice * foodQuantity; // 입력받은 음식 수량(foodQuantity) 및 가격(foodPrice)을 곱한 값을 totalprice에 초기화

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
