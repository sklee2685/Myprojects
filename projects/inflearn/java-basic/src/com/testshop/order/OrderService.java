package com.testshop.order;

import com.testshop.product.Product;
import com.testshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
