package org.ns.oops.service;

import org.ns.oops.pojos.Cart;
import org.ns.oops.pojos.Product;
import org.ns.oops.pojos.enums.PaymentType;

import java.io.Serializable;

// interface imple ....
// serializable -> convert to a byte (parsed )
public interface CashierService extends Serializable {

    public void add(Product product, Cart cart); // these are methods -- input types as well

    public void remove(String productId, Cart cart);

    public boolean pay(Cart cart, PaymentType paymentType);

    public Cart createCart();


    // adding over here ////

}
