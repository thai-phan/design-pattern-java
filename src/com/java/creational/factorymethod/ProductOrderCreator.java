package com.java.creational.factorymethod;


public class ProductOrderCreator {
    public void orderProduct(
        Product product,
        long amount
    ) {
        
    }

    public static void main(String[] args) {
        final Product product;
        String name = "name";
        String price = 1000;
        if (name.endsWith("FREE")) {
            product = new FreeProduct()
            product.name  = name;
        } else {
            final PricedProduct pricedProduct = new PricedProduct();
            pricedProduct.name = name;
            pricedProduct.price = price;
            product = pricedProduct;
        }

        final ProductOrderCreator creator = new ProductOrderCreator();
        creator.orderProduct(product, amount);

    }
}