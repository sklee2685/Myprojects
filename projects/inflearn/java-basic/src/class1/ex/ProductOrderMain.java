package class1.ex;

public class ProductOrderMain {//상품 주문 시스템 개발
    /*
    **문제 설명**
    당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
    먼저, 상품 주문 정보를 담을 수 있는 `ProductOrder` 클래스를 만들어보자.
    **요구 사항**
    1. `ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
    상품명 ( `productName` )
    가격 ( `price` )
    주문 수량 ( `quantity` )
    2. `ProductOrderMain` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그
    정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
    3. 출력 예시와 같도록 출력하면 된다.

    출력 예시**
    ```
    상품명: 두부, 가격: 2000, 수량: 2
    상품명: 김치, 가격: 5000, 수량: 1
    상품명: 콜라, 가격: 1500, 수량: 2
    총 결제 금액: 12000
    */
    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] product = {tofu, kimchi, cola};

        int total = 0;
        for (ProductOrder p : product) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            total += (p.price * p.quantity);
        }
        System.out.println("총 결제 금액: " + total);
    }
}
