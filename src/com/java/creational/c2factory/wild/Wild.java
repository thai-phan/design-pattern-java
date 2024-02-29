package com.java.creational.c2factory.wild;

import com.java.creational.c2factory.FreeProduct;
import com.java.creational.c2factory.PricedProduct;
import com.java.creational.c2factory.Product;

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
