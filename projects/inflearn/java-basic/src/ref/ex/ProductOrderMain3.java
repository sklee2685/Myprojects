package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {//상품 주문 시스템 개발 - 사용자 입력
    /*
    문제 설명
    앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.

    **요구 사항**
    아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.
    주문 수량을 입력 받자
    예) 입력할 주문의 개수를 입력하세요:
    가격, 수량, 상품명을 입력 받자
    입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
    입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.
    **입력, 출력 예시**
    ```
    입력할 주문의 개수를 입력하세요: 3
    1번째 주문 정보를 입력하세요.
    상품명: 두부
    가격: 2000
    수량: 2
    2번째 주문 정보를 입력하세요.
    상품명: 김치
    가격: 5000
    수량: 1
    3번째 주문 정보를 입력하세요.
    상품명: 콜라
    가격: 1500
    수량: 2
    상품명: 두부, 가격: 2000, 수량: 2
    상품명: 김치, 가격: 5000, 수량: 1
    상품명: 콜라, 가격: 1500, 수량: 2
    총 결제 금액: 12000
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int productCount = input.nextInt();

        ProductOrder[] orders = new ProductOrder[productCount];
        for (int i = 0; i < orders.length; i++) {

            System.out.println((i + 1) + "번째 주문정보를 입력하세요");
            input.nextLine();

            System.out.print("상품명: ");
            String productName = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrder(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
