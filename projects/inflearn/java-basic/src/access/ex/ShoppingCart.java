package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    private int total;
    public void addItem(Item item) {
        //검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        //실행 로직
            items[itemCount] = item;
            itemCount++;
    }

    //현재 장바구니에 있는 상품명 및 금액
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + TotalPrice());
    }

    // 장바구니에 있는 상품의 총합
    private int TotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
