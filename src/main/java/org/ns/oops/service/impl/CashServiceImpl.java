package org.ns.oops.service.impl;

import org.ns.oops.pojos.Cart;
import org.ns.oops.pojos.Product;
import org.ns.oops.pojos.enums.PaymentType;
import org.ns.oops.service.CashierService;
import org.ns.oops.service.PaymentService;

public class CashServiceImpl implements CashierService {

    PaymentService paymentService = new PaymentService();

    public void add(Product product, Cart cart) {
        cart.setProduct(product);
    }

    public void remove(String productId, Cart cart) {
        cart.removeProduct(productId);

    }

    public boolean pay(Cart cart, PaymentType paymentType) {
        paymentService.pay(paymentType, cart.getTotalPrice());
        return false;
    }

    public Cart createCart() {
        return new Cart();
    }
}
