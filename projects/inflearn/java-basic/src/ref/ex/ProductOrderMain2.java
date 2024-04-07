package ref.ex;

public class ProductOrderMain2 {//상품 주문 시스템 개발 - 리팩토링
    /*
    **문제 설명**
    앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
    `class1.ex.ProductOrderMain`
    당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
    먼저, 상품 주문 정보를 담을 수 있는 `ProductOrder` 클래스를 만들어보자.
    **요구 사항**
    `ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
    상품명 ( `productName` )
    가격 ( `price` )
    주문 수량 ( `quantity` )

    다음으로 `ref.ex.ProductOrderMain2` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열
    로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자. 이 클래스에서는 다음과 같은 메서드를 포함
    해야 합니다:
    `static ProductOrder createOrder(String productName, int price, int quantity)`
    `ProductOrder` 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 `ProductOrder` 를
    반환합니다.
    `static void printOrders(ProductOrder[] orders)`
    배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
    `static int getTotalAmount(ProductOrder[] orders)`
    배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.

    ** 출력 예시**
    ```
    상품명: 두부, 가격: 2000, 수량: 2
    상품명: 김치, 가격: 5000, 수량: 1
    상품명: 콜라, 가격: 1500, 수량: 2
    총 결제 금액: 12000
     */
    public static void main(String[] args) {
        ProductOrder[] orders = {createOrder("두부", 2000, 2), createOrder("김치", 5000, 1), createOrder("콜라", 1500, 2)};
        printOders(orders);

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

    static void printOders(ProductOrder[] orders) {
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
