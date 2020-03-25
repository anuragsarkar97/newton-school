package org.ns.oops.pojos;

public class Product {

    private String productId;
    private String name;
    private double price;
    private double discount;
    private int unitsLeft;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getUnitsLeft() {
        return unitsLeft;
    }

    public void setUnitsLeft(int unitsLeft) {
        this.unitsLeft = unitsLeft;
    }
}
