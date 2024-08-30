package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product name, int count) {
        if (cartMap.containsKey(name)) {
            cartMap.put(name, (cartMap.get(name) + count));
        }else {
            cartMap.put(name, count);
        }

        //숏코팅
        /*
        //getOrDefault을 통해 지정된 키(name)에 연결된 값을 반환 없으면 0 반환
        int existingQuantity = cartMap.getOrDefault(name, 0);
        cartMap.put(name, existingQuantity + count);
        */
    }

    public void minus(Product name, int count) {
        if (cartMap.get(name) <= count ) {
            cartMap.remove(name);
        }else {
            cartMap.put(name, (cartMap.get(name) - count));
        }

        //강의vr
        /*
        int existingQuantity = cartMap.getOrDefault(name, 0);

        int newQuantity = existingQuantity - count;
        if (newQuantity <= 0) {
            cartMap.remove(name);
        } else {
            cartMap.put(name, newQuantity);
        }
         */
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }

        //좀더 간단히
        /*
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
         */
    }
}
