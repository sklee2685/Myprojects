package com.testshop.order;

import com.testshop.product.Product;
import com.testshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
