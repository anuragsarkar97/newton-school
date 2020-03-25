package org.ns.oops.pojos;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<String, Product> products = new HashMap<String, Product>();
    private double totalPrice;
    private double discount;

    public Map<? extends String, ? extends Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public void removeProduct(String productId) {
        this.products.remove(productId);
    }

    public void setProduct(Product product) {
        this.products.put(product.getProductId(), product);
        this.totalPrice += product.getPrice();
        this.discount += product.getDiscount();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
