package com.java.creational.factory;

public class Wild {
  public static void main(String[] args) {
    long price = 100;
    String name = "Product 1";
    final Product product;
    if (price == 0) {
      product = new FreeProduct();
      product.name = name + "FREE";
    } else {
      product = new PricedProduct();
      product.price = price;
      product.name = name;
    }
  }
}
